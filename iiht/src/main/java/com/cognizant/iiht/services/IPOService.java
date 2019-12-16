package com.cognizant.iiht.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.iiht.model.IPODetails;
import com.cognizant.iiht.repository.IPORepository;

@Component
public class IPOService {

	@Autowired
	private IPORepository ipoRepository;
	
	public List<IPODetails> getUpcomingIPO() {
		
		return ipoRepository.findUpcomingIPO();
		}
	
	public void addIPO(IPODetails ipo){
	     ipoRepository.save(ipo);	
	}

}
