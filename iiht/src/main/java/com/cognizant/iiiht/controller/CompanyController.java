package com.cognizant.iiiht.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.iiht.model.Company;
import com.cognizant.iiht.services.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/allcompanies")
	public List<Company> getCompanies(){
		return companyService.manageCompany();
		
	}
	
	@PostMapping("/newcompany")
	public void addCompany(Company company){
		companyService.addCompany(company);
		
	}
	
	@GetMapping("/company/{id}")
	public Company getcompany(@PathVariable long id){
		return companyService.getcompany(id);
	}
	
	@GetMapping("/company/{id}")
	public Double[] companyGraph(@PathVariable long id,@PathVariable int days ){
		return companyService.companyGraph(id,days);
	}
}
