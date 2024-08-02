package com.nt;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.Entity.CitizenData;
import com.nt.Repository.CitizenRepo;

@SpringBootApplication
public class MiniProjectNo1ReportGeneratedApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(MiniProjectNo1ReportGeneratedApplication.class, args);
		CitizenRepo repo=context.getBean(CitizenRepo.class);
		
		CitizenData c1=new CitizenData();
		c1.setCitizenName("Mahesh");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setStartDate(LocalDate.now());
		c1.setEndDate(LocalDate.now().plusMonths(6));
		c1.setBenifitAmount(1900.00);
		
		CitizenData c2=new CitizenData();
		c2.setCitizenName("Labhesh");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("invalid Document");
		
		CitizenData c3=new CitizenData();
		c3.setCitizenName("Nikita");
		c3.setGender("Fe-Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setStartDate(LocalDate.now().minusMonths(3));
		c3.setEndDate(LocalDate.now().plusMonths(3));
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminatedReason("Goverment Job");
		
		
		CitizenData c4=new CitizenData();
		c4.setCitizenName("Akash");
		c4.setGender("Male");
		c4.setPlanName("food");
		c4.setPlanStatus("Approved");
		c4.setStartDate(LocalDate.now());
		c4.setEndDate(LocalDate.now().plusMonths(6));
		c4.setBenifitAmount(21000.00);
		
		CitizenData c5=new CitizenData();
		c5.setCitizenName("Rahul");
		c5.setGender("Male");
		c5.setPlanName("food");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("invalid id");
		
		CitizenData c6=new CitizenData();
		c6.setCitizenName("Kalyani");
		c6.setGender("Fe-Male");
		c6.setPlanName("food");
		c6.setPlanStatus("Terminated");
		c6.setStartDate(LocalDate.now().minusMonths(3));
		c6.setEndDate(LocalDate.now().plusMonths(3));
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminatedReason("get Job");
		
		
		CitizenData c7=new CitizenData();
		c7.setCitizenName("Adinath");
		c7.setGender("Male");
		c7.setPlanName("medical");
		c7.setPlanStatus("Approved");
		c7.setStartDate(LocalDate.now());
		c7.setEndDate(LocalDate.now().plusMonths(6));
		c7.setBenifitAmount(12300.00);
		
		CitizenData c8=new CitizenData();
		c8.setCitizenName("Vishal");
		c8.setGender("Male");
		c8.setPlanName("medical");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("buy house");
		
		CitizenData c9=new CitizenData();
		c9.setCitizenName("Rutuja");
		c9.setGender("Fe-Male");
		c9.setPlanName("medical");
		c9.setPlanStatus("Terminated");
		c9.setStartDate(LocalDate.now().minusMonths(3));
		c9.setEndDate(LocalDate.now().plusMonths(3));
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminatedReason("job in IT Sector");
		
		
		CitizenData c10=new CitizenData();
		c10.setCitizenName("Shrikant");
		c10.setGender("Male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setStartDate(LocalDate.now());
		c10.setEndDate(LocalDate.now().plusMonths(6));
		c10.setBenifitAmount(9900.00);
		
		CitizenData c12=new CitizenData();
		c12.setCitizenName("Labhesh");
		c12.setGender("Male");
		c12.setPlanName("Cash");
		c12.setPlanStatus("Denied");
		c12.setDenialReason("unlegal Author");
		
		CitizenData c11=new CitizenData();
		c11.setCitizenName("Nikita");
		c11.setGender("Fe-Male");
		c11.setPlanName("Cash");
		c11.setPlanStatus("Terminated");
		c11.setStartDate(LocalDate.now().minusMonths(3));
		c11.setEndDate(LocalDate.now().plusMonths(3));
		c11.setTerminatedDate(LocalDate.now());
		c11.setTerminatedReason("Goverment Job");
		
		
//		List<CitizenData> data=Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
//		repo.saveAll(data);
		
	}

}
