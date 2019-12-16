package com.cognizant.iiht.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import com.cognizant.iiht.constant.IPOQueries;
import com.cognizant.iiht.model.IPODetails;



@Repository
public interface IPORepository extends JpaRepository<IPODetails, Long>{
	
	@Query(value = IPOQueries.GET_IPO, nativeQuery = true)
	 List<IPODetails> findUpcomingIPO();
	
	
	
}
