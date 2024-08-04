package com.nt.Controller;

import java.util.List;

import org.apache.catalina.filters.ExpiresFilter.XServletOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nt.Entity.CitizenData;
import com.nt.SearchHandel.SearchHandel;
import com.nt.Services.Services;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CitizenController {

    @Autowired
    private Services service; 
    
    @GetMapping("pdf")
    public void exportpdf(HttpServletResponse response ,Model model)throws Exception {
    	
    	response.setContentType("application/pdf");
    	response.addHeader("content-Disposition", "attachment;filename=plans.pdf");
    	boolean status=service.pdfGenerated(response);
    	if(status==true) {
    		model.addAttribute("msg", "PDf Record Send On Mail Successfully" );
    	}
    	
    	
    }
    
    @GetMapping("excel")
    public void exportExcle(HttpServletResponse response)throws Exception {
    	
    	response.setContentType("application/octet-stream");
    	response.addHeader("content-Disposition", "attachment;filename=plans.xls");
    	service.excelGenerated(response);
    	
    	
    }
    
    @PostMapping("/search")
    public String search(@ModelAttribute("search") SearchHandel request ,Model model) {
    	
    	System.out.println(request);
    	List<CitizenData> plan=service.search(request);
    	System.out.println(plan);
    	model.addAttribute("plans", plan);
    	init(model);
    	return "index";
    }

 @GetMapping("/")
 public String viewPage(Model model) {
	 
	 model.addAttribute("search", new SearchHandel());
	 init(model);
	 return "index";
 }

public void init(Model model) {
	 model.addAttribute("plan", service.getPlanName());
	 model.addAttribute("status", service.getPlanStatus());
}
    
   
}
