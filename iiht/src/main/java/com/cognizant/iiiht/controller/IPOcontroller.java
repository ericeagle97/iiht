package com.cognizant.iiiht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.iiht.model.IPODetails;
import com.cognizant.iiht.services.IPOService;

@RestController
@RequestMapping("/ipo")
public class IPOcontroller {
	
	@Autowired
	private IPOService ipoService;
	
	public List<IPODetails> getUpcomingIPO() {
		return ipoService.getUpcomingIPO();
	}

}
