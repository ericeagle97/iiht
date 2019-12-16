package com.cognizant.iiiht.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.iiht.model.StockExchange;
import com.cognizant.iiht.services.StockExchangeService;

@RestController
@RequestMapping("/stockexchange")
public class StockExchangeController {
	
	@Autowired
	private StockExchangeService stockExchangeService;

	@GetMapping("/stockexchangelist")
	public List<StockExchange> getStockExchange(){
		return stockExchangeService.getStockExchangeList();
	}
}
