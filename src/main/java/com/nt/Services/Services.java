package com.nt.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.Entity.CitizenData;
import com.nt.SearchHandel.SearchHandel;

@Service
public interface Services {
	
	public List<String> getPlanName();
	public List<String> getPlanStatus();
	public List<CitizenData> search(SearchHandel search);
	public boolean excelGenerated();
	public boolean pdfGenerated();

}
