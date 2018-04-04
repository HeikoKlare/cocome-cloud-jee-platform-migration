package org.cocome.tradingsystem.remote.access.connection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import javax.enterprise.context.Dependent;

import org.apache.log4j.Logger;


/**
 * Implements functionality to manipulate data in the backend using
 * the CSV-based serviceadapter interface.
 * 
 * @author Tobias Pöppke
 *
 */
@Dependent
public class CSVBackendConnection extends unification.org.cocome.tradingsystem.remote.access.connection.UnifiedCSVBackendConnection implements IPersistenceConnection {
	
	private static Logger LOG = Logger.getLogger(CSVBackendConnection.class);
	
	private String getSetDataBackendURL() {
		String url = "http://" + getBackendHost() + ":" + getBackendPort() + getBackendSetDataURL();
		return url;
	}

	private static Logger getLOG() {
		return LOG;
	}

	private static void setLOG(Logger lOG) {
		LOG = lOG;
	}

	private HttpURLConnection getURLConnection(String type, String entity) throws IOException {
		URL url = new URL(getSetDataBackendURL() + 
				"?query." + type + "=" + entity);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		return con;
	}
	
	private void setConnectionAttributes(HttpURLConnection con, String requestMethod) throws ProtocolException {
		con.setRequestMethod(requestMethod);
		con.setDoOutput(true);
		con.setDoInput(true);
		con.setUseCaches(false);
		con.setRequestProperty("Content-Type", "application/csv");
	}
	
	private String writeDataToBackend(HttpURLConnection con, String content) throws IOException {
		DataOutputStream  wr = new DataOutputStream (con.getOutputStream());
		
		getLOG().debug("Sending content [" + content + "] to " + con.getURL().toString());
		
		wr.writeBytes(content);

		wr.flush();
		wr.close();

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
			response.append(System.getProperty("line.separator"));
		}
		in.close();
		
		getLOG().debug("Response from backend:\n" + response.toString());
		
		return response.toString();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void sendUpdateQuery(String entity, String header, String content) throws IOException {
		HttpURLConnection con = getURLConnection("update", entity);
		setConnectionAttributes(con, "PUT");
		this.setMessage(writeDataToBackend(con, header + "\n" + content));
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void sendCreateQuery(String entity, String header, String content) throws IOException {
		HttpURLConnection con = getURLConnection("insert", entity);
		setConnectionAttributes(con, "POST");
		this.setMessage(writeDataToBackend(con, header + "\n" + content));
	}
	
	/**
	 * {@inheritDoc}
	 */
	public String getResponse() {
		return this.getMessage();
	}
}
