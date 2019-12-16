package com.cognizant.iiht.constant;

public interface StockExchangeQueries {
	
	String GET_STOCK_EXCHANGE= "select" +"stock_exchange_id" +"stock_exchange_name" + "brief" + 
								"contact_address"+"remarks"+"from" + "stock_exchange" +
								"where" +"stock_exchange_id = ?";

}
