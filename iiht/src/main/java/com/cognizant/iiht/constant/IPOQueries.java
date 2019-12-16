package com.cognizant.iiht.constant;

public interface IPOQueries {
	
	String GET_IPO= "select" +"company_Name" +"stock_Exchange" + "price_Per_Share" + "total_Shares"+"open_date"+"open_time"+"remarks"+"from"+
			"IPODetails"+"where"+"open_date>CURRDATE()";

}
