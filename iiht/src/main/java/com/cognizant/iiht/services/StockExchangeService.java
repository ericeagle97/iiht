package com.cognizant.iiht.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.iiht.model.StockExchange;
import com.cognizant.iiht.repository.StockExchangeRepository;

@Component
public class StockExchangeService {

	@Autowired
	private StockExchangeRepository stockExchangeRepository;
	
	public List<StockExchange> getStockExchangeList(){
		return stockExchangeRepository.getStockExchange();
	}
	
	public void addStockExchange(StockExchange stockExchange){
		stockExchangeRepository.save(stockExchange);
	}
}
