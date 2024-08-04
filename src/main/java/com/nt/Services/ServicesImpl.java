package com.nt.Services;


import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.nt.Entity.CitizenData;
import com.nt.Repository.CitizenRepo;
import com.nt.SearchHandel.SearchHandel;
import com.nt.Utlity.ExcelGenerated;
import com.nt.Utlity.MailSender;
import com.nt.Utlity.PdfGenerated;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class ServicesImpl implements Services {
	
	@Autowired
	private CitizenRepo repo;
	
	@Autowired
	private ExcelGenerated excelGenerated;
	
	@Autowired
	private PdfGenerated pdfGenerated;
	
	@Autowired
	private MailSender mailSender;

	@Override
	public List<String> getPlanName() {
		return repo.getPlanNames();

		
	}
	
	@Override
	public List<String> getPlanStatus() {
		return repo.getPlanStatus();
		
	}
	@Override
	public List<CitizenData> search(SearchHandel search) {
		
		CitizenData entity=new CitizenData();
		if(null !=search.getPlanName() && !"".equals(search.getPlanName())) {
			entity.setPlanName(search.getPlanName());
		}
		if(null !=search.getPlanStatus() && !"".equals(search.getPlanStatus())) {
			entity.setPlanStatus(search.getPlanStatus());
		}
		
		if(null !=search.getGender() && !"".equals(search.getGender())) {
			entity.setGender(search.getGender());
		}
		if(null !=search.getStartDate() && !"".equals(search.getStartDate())) {
			String startdate=search.getStartDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate localdate = LocalDate.parse(startdate, formatter);
			entity.setStartDate(localdate);
		}
		
		if(null !=search.getEndDate() && !"".equals(search.getEndDate())) {
			String enddate=search.getEndDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate localdate = LocalDate.parse(enddate, formatter);
			entity.setEndDate(localdate);
			
		}
		
		return repo.findAll(Example.of(entity));
	}
	
	@Override
	public boolean excelGenerated(HttpServletResponse response) throws Exception {
		
		File f=new File("plans.xls");
		
		List<CitizenData> data=repo.findAll();
		excelGenerated.excelGenerated(response, data,f);
		
		String subject="Customer Plan Details";
		String body="<h1>plans Information </h1>";
		String to="maheshwandhekar700@gmail.com";
		
		mailSender.sendMail(subject, body, to,f);
		f.delete();
		
		return true;
	}
	
	@Override
	public boolean pdfGenerated(HttpServletResponse response ) throws Exception {
		File f=new File("plans.pdf");
		
		List<CitizenData> data=repo.findAll();
		pdfGenerated.pdfgenerated(response, data ,f);
		
		String subject="Customer Plan Details";
		String body="<h1>plans Information </h1>";
		String to="maheshwandhekar700@gmail.com";
		
		mailSender.sendMail(subject, body, to,f);
		f.delete();
		
		return true;

	}
}
