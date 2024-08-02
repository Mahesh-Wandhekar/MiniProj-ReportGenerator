package com.nt.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.Entity.CitizenData;

public interface CitizenRepo extends JpaRepository<CitizenData, Integer>{

	 @Query("SELECT DISTINCT c.planName FROM CitizenData c")
	    List<String> getPlanNames();

	    @Query("SELECT DISTINCT c.planStatus FROM CitizenData c")
	    List<String> getPlanStatus();
	
}
