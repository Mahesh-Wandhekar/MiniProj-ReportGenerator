package com.nt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nt.Entity.CitizenData;
import com.nt.Services.Services;

@Controller
public class CitizenController {

    @Autowired
    private Services service; 

//    @GetMapping("/")
//    public String viewPage() {
//        return "index"; 
//    }
    @ResponseBody
    @GetMapping("/plan")
    public ResponseEntity<List<String>> getPlan(){
    	List<String> plan=service.getPlanName();
    	return  new ResponseEntity<>(plan,HttpStatus.OK);
    }
    @GetMapping("/status")
    public ResponseEntity<List<String>> getStatus(){
    	List<String> status=service.getPlanStatus();
    	return  new ResponseEntity<>(status,HttpStatus.OK);
    }
    
   
}
