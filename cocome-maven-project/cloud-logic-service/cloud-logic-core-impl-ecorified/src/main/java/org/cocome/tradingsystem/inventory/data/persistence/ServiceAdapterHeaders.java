package org.cocome.tradingsystem.inventory.data.persistence;

public final class ServiceAdapterHeaders extends unification.org.cocome.tradingsystem.inventory.data.persistence.UnifiedServiceAdapterHeaders {
	private static String PRODUCTORDER_HEADER = "ProductOrderId;StoreId;ProductBarcode;"
			+ "OrderDeliveryDate;OrderOrderingDate;OrderAmount";
	
	private static String STOCKITEM_HEADER = "StoreId;ProductBarcode;StockItemMinStock;"
			+ "StockItemMaxStock;StockItemIncomingAmount;StockItemAmount;StockItemSalesPrice";
	
	private static String ENTERPRISE_CREATE_HEADER = "EnterpriseName";
	
	private static String ENTERPRISE_UPDATE_HEADER = "EnterpriseId;EnterpriseName";
	
	private static String STORE_CREATE_HEADER = "EnterpriseName;StoreName;StoreLocation";
	
	private static String STORE_UPDATE_HEADER = "EnterpriseName;StoreId;StoreName;StoreLocation";
	
	private static String PRODUCT_HEADER = "ProductBarcode;ProductName;ProductPurchasePrice";
	
	private static String PRODUCTSUPPLIER_CREATE_HEADER = "ProductSupplierName";
	
	private static String PRODUCTSUPPLIER_UPDATE_HEADER = "ProductSupplierId;ProductSupplierName";
	
	private static String SEPARATOR = ";";

	private static String USER_CREATE_HEADER = "UserName;CredentialType;CredentialString;Role";
	
	private static String USER_UPDATE_HEADER = "UserId;UserName;CredentialType;CredentialString;Role";
	
	private static String CUSTOMER_CREATE_HEADER = "FirstName;LastName;MailAddress;"
			+ "UserName";
	
	private static String CUSTOMER_UPDATE_HEADER = "CustomerId;FirstName;LastName;MailAddress;"
			+ "UserName";
	
	private static String CUSTOMER_CREATE_HEADER_WITH_STORE = "FirstName;LastName;MailAddress;"
			+ "PreferredStoreEnterpriseName;PreferredStoreId;PreferredStoreName;PreferredStoreLocation;"
			+ "UserName";
	
	private static String CUSTOMER_UPDATE_HEADER_WITH_STORE = "CustomerId;FirstName;LastName;MailAddress;"
			+ "PreferredStoreEnterpriseName;PreferredStoreId;PreferredStoreName;PreferredStoreLocation;"
			+ "UserName";

	public static String getPRODUCTORDER_HEADER() {
		return PRODUCTORDER_HEADER;
	}

	public static String getCUSTOMER_UPDATE_HEADER_WITH_STORE() {
		return CUSTOMER_UPDATE_HEADER_WITH_STORE;
	}

	public static void setCUSTOMER_UPDATE_HEADER_WITH_STORE(String cUSTOMER_UPDATE_HEADER_WITH_STORE) {
		CUSTOMER_UPDATE_HEADER_WITH_STORE = cUSTOMER_UPDATE_HEADER_WITH_STORE;
	}

	public static String getCUSTOMER_CREATE_HEADER_WITH_STORE() {
		return CUSTOMER_CREATE_HEADER_WITH_STORE;
	}

	public static void setCUSTOMER_CREATE_HEADER_WITH_STORE(String cUSTOMER_CREATE_HEADER_WITH_STORE) {
		CUSTOMER_CREATE_HEADER_WITH_STORE = cUSTOMER_CREATE_HEADER_WITH_STORE;
	}

	public static String getCUSTOMER_UPDATE_HEADER() {
		return CUSTOMER_UPDATE_HEADER;
	}

	public static void setCUSTOMER_UPDATE_HEADER(String cUSTOMER_UPDATE_HEADER) {
		CUSTOMER_UPDATE_HEADER = cUSTOMER_UPDATE_HEADER;
	}

	public static String getCUSTOMER_CREATE_HEADER() {
		return CUSTOMER_CREATE_HEADER;
	}

	public static void setCUSTOMER_CREATE_HEADER(String cUSTOMER_CREATE_HEADER) {
		CUSTOMER_CREATE_HEADER = cUSTOMER_CREATE_HEADER;
	}

	public static String getUSER_UPDATE_HEADER() {
		return USER_UPDATE_HEADER;
	}

	public static void setUSER_UPDATE_HEADER(String uSER_UPDATE_HEADER) {
		USER_UPDATE_HEADER = uSER_UPDATE_HEADER;
	}

	public static String getUSER_CREATE_HEADER() {
		return USER_CREATE_HEADER;
	}

	public static void setUSER_CREATE_HEADER(String uSER_CREATE_HEADER) {
		USER_CREATE_HEADER = uSER_CREATE_HEADER;
	}

	public static String getSEPARATOR() {
		return SEPARATOR;
	}

	public static void setSEPARATOR(String sEPARATOR) {
		SEPARATOR = sEPARATOR;
	}

	public static String getPRODUCTSUPPLIER_UPDATE_HEADER() {
		return PRODUCTSUPPLIER_UPDATE_HEADER;
	}

	public static void setPRODUCTSUPPLIER_UPDATE_HEADER(String pRODUCTSUPPLIER_UPDATE_HEADER) {
		PRODUCTSUPPLIER_UPDATE_HEADER = pRODUCTSUPPLIER_UPDATE_HEADER;
	}

	public static String getPRODUCTSUPPLIER_CREATE_HEADER() {
		return PRODUCTSUPPLIER_CREATE_HEADER;
	}

	public static void setPRODUCTSUPPLIER_CREATE_HEADER(String pRODUCTSUPPLIER_CREATE_HEADER) {
		PRODUCTSUPPLIER_CREATE_HEADER = pRODUCTSUPPLIER_CREATE_HEADER;
	}

	public static String getPRODUCT_HEADER() {
		return PRODUCT_HEADER;
	}

	public static void setPRODUCT_HEADER(String pRODUCT_HEADER) {
		PRODUCT_HEADER = pRODUCT_HEADER;
	}

	public static String getSTORE_UPDATE_HEADER() {
		return STORE_UPDATE_HEADER;
	}

	public static void setSTORE_UPDATE_HEADER(String sTORE_UPDATE_HEADER) {
		STORE_UPDATE_HEADER = sTORE_UPDATE_HEADER;
	}

	public static String getSTORE_CREATE_HEADER() {
		return STORE_CREATE_HEADER;
	}

	public static void setSTORE_CREATE_HEADER(String sTORE_CREATE_HEADER) {
		STORE_CREATE_HEADER = sTORE_CREATE_HEADER;
	}

	public static String getENTERPRISE_UPDATE_HEADER() {
		return ENTERPRISE_UPDATE_HEADER;
	}

	public static void setENTERPRISE_UPDATE_HEADER(String eNTERPRISE_UPDATE_HEADER) {
		ENTERPRISE_UPDATE_HEADER = eNTERPRISE_UPDATE_HEADER;
	}

	public static String getENTERPRISE_CREATE_HEADER() {
		return ENTERPRISE_CREATE_HEADER;
	}

	public static void setENTERPRISE_CREATE_HEADER(String eNTERPRISE_CREATE_HEADER) {
		ENTERPRISE_CREATE_HEADER = eNTERPRISE_CREATE_HEADER;
	}

	public static String getSTOCKITEM_HEADER() {
		return STOCKITEM_HEADER;
	}

	public static void setSTOCKITEM_HEADER(String sTOCKITEM_HEADER) {
		STOCKITEM_HEADER = sTOCKITEM_HEADER;
	}

	public static void setPRODUCTORDER_HEADER(String pRODUCTORDER_HEADER) {
		PRODUCTORDER_HEADER = pRODUCTORDER_HEADER;
	}
}
