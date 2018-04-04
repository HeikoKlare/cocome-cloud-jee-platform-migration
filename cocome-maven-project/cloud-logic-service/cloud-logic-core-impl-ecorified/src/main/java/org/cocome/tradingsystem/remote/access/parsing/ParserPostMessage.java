package org.cocome.tradingsystem.remote.access.parsing;

import java.io.IOException;
import java.io.StringReader;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import de.kit.ipd.java.utils.parsing.csv.CSVParser;

public class ParserPostMessage extends unification.org.cocome.tradingsystem.remote.access.parsing.UnifiedParserPostMessage {

	public ParserPostMessage(String response) throws Exception {
		this.setResponse(response);
		setMessages();
	}

	private String getCSV() {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			try {
				DocumentBuilder db = dbf.newDocumentBuilder();
				InputSource is = new InputSource();
				is.setCharacterStream(new StringReader(this.getResponse()));
		
				Document doc = db.parse(is);
				doc.getDocumentElement().normalize();
				NodeList nodes = doc.getElementsByTagName("BodyEntry");
		
				for (int i = 0; i < nodes.getLength(); i++) {
					Node node = nodes.item(i);
		
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						if (element.getAttribute("name").equalsIgnoreCase(
								"Notification")) {
							return getValue("Content", element);
						}
					}
				}
			}catch (IOException | ParserConfigurationException | SAXException e) {
				//TODO
			 }
		return ";";
	}

	private String getValue(String tag, Element element) {
		NodeList nodes = element.getElementsByTagName(tag).item(0)
				.getChildNodes();
		Node node = (Node) nodes.item(0);
		return node.getNodeValue();
	}
	
	private void setMessages()  {
		CSVParser parser = new CSVParser();
		parser.parse(getCSV());
		try {
			this.setTime(parser.getModel().getRows().get(0).getColumns().get(0).getValue());
			this.setLebel(parser.getModel().getRows().get(0).getColumns().get(1).getValue());
			this.setStatus(parser.getModel().getRows().get(0).getColumns().get(2).getValue());
			this.setDescription(parser.getModel().getRows().get(0).getColumns().get(3).getValue());
		}catch (Exception e) {
			Date d = new Date();
			this.setTime(d.toString());
			this.setLebel("Unknown");
			this.setStatus("Error");
			this.setDescription("Error with post parser message!");
		}
	}

	public ParserPostMessage() {
	}
}
