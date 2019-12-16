package com.cognizant.iiht.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.iiht.constant.StockExchangeQueries;
import com.cognizant.iiht.model.StockExchange;

public interface StockExchangeRepository extends JpaRepository<StockExchange, Long> {
	
@Query(value=StockExchangeQueries.GET_STOCK_EXCHANGE,nativeQuery=true)
List<StockExchange> getStockExchange();

}
