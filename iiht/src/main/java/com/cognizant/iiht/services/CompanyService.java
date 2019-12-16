package com.cognizant.iiht.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.cognizant.iiht.model.Company;
import com.cognizant.iiht.repository.CompanyRepository;

@Component
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public	List<Company> manageCompany(){
		return companyRepository.manageCompany();
	}
	
	
	public void addCompany(Company company){
		companyRepository.save(company);
	}
	
	public Company getcompany(long id){
		return companyRepository.getCompany(id);
	}
	
	public Double[] companyGraph(long id,int days){
		return companyRepository.companyGraph(id,days);
	}
	
}
