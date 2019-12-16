package com.cognizant.iiht.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.iiht.constant.CompanyQueries;
import com.cognizant.iiht.constant.IPOQueries;
import com.cognizant.iiht.model.Company;
import com.cognizant.iiht.model.IPODetails;

public interface CompanyRepository extends JpaRepository<Company, Long> {
	
	@Query(value = CompanyQueries.GET_COMPANIES, nativeQuery = true)
	 List<Company> manageCompany();
			
	@Query(value = CompanyQueries.GET_COMPANY, nativeQuery = true)
	 Company getCompany(long id);
	
	@Query(value=CompanyQueries.COMPANY_GRAPH,nativeQuery = true)
	Double[] companyGraph(long id,int days);
	
}
