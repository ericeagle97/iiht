package com.cognizant.iiht.constant;

public interface CompanyQueries {

	String GET_COMPANY= "select" +"company_id" +"company_name" + "turnover" + "ceo"+""+"board_of_directors"+"listed_in_stock_exchange"+"sector"+
			"brief_write_up"+"stock_exchange_code"+"from" + "company" + "where" +"company_id = ?";
	
	String ADD_COMPANY = "INSERT " + "INTO " + "company" + "(comapny_id," + "company_name,"
		+ "turnover," + "ceo," + "board_of_director," + "listed_in_stock_exchange," + "sector,"
		+ "brief_write_up," + "stock_exchange_code)" + "VALUES (?,?,?,?,?,?,?,?,?)";
	
	String GET_COMPANIES= "select" +"company_id" +"company_name" + "turnover" + "ceo"+""+"board_of_directors"+"listed_in_stock_exchange"+"sector"+
			"brief_write_up"+"stock_exchange_code"+"from" + "company";
	
	String COMPANY_GRAPH = "select" + "stock_price" + "from" + "stockprice" + "where" +"company_id=?" + "order"+ "by"+"stock_date"+ "," + "stock_time";
}


