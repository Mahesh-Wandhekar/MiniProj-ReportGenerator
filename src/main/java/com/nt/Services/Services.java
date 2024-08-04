package com.nt.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.Entity.CitizenData;
import com.nt.SearchHandel.SearchHandel;

import jakarta.servlet.http.HttpServletResponse;

@Service
public interface Services {
	
	public List<String> getPlanName();
	public List<String> getPlanStatus();
	public List<CitizenData> search(SearchHandel search);
	public boolean excelGenerated( HttpServletResponse response) throws Exception;
	public boolean pdfGenerated(HttpServletResponse response) throws Exception;

}
