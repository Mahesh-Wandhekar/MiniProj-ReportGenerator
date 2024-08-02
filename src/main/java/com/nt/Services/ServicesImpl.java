package com.nt.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.CitizenData;
import com.nt.Repository.CitizenRepo;
import com.nt.SearchHandel.SearchHandel;

@Service
public class ServicesImpl implements Services {
	
	@Autowired
	private CitizenRepo repo;

	@Override
	public List<String> getPlanName() {
		List<String> plan=repo.getPlanNames();

		return plan;
	}
	
	@Override
	public List<String> getPlanStatus() {
		List<String> status=repo.getPlanStatus();
		return status;
	}
	@Override
	public List<CitizenData> search(SearchHandel search) {
		List<CitizenData> get=repo.findAll();
		return get;
	}
	
	@Override
	public boolean excelGenerated() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean pdfGenerated() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
