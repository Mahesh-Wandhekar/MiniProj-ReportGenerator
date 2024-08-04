package com.nt.Utlity;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;

import com.nt.Entity.CitizenData;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class ExcelGenerated {
	
	
	public void excelGenerated(HttpServletResponse response , List<CitizenData> record ,File f)throws Exception {
		
		Workbook workbook=new HSSFWorkbook();
		Sheet sheet=workbook.createSheet();
		Row headrow=sheet.createRow(0);
		headrow.createCell(0).setCellValue("Id");
		headrow.createCell(1).setCellValue("Name");
		headrow.createCell(2).setCellValue("Gender");
		headrow.createCell(3).setCellValue("plan");
		headrow.createCell(4).setCellValue("Status");
		headrow.createCell(5).setCellValue("startDate");
		headrow.createCell(6).setCellValue("EndDate");
		headrow.createCell(7).setCellValue("BenifitAmt");
		headrow.createCell(8).setCellValue("TerminatedReason");
		headrow.createCell(9).setCellValue("TerminatedDate");
		headrow.createCell(10).setCellValue("DeniedReason");
		
		int rowindex=1;
		
		
		
		for(CitizenData Data:record) {
			Row row=sheet.createRow(rowindex);
			row.createCell(0).setCellValue(Data.getCitizenId());
			row.createCell(1).setCellValue(Data.getCitizenName());
			row.createCell(2).setCellValue(Data.getGender());
			row.createCell(3).setCellValue(Data.getPlanName());
			row.createCell(4).setCellValue(Data.getPlanStatus());
			if(null!=Data.getStartDate()) {
			row.createCell(5).setCellValue(Data.getStartDate()+"");
			}else {
				row.createCell(5).setCellValue("N/A");	
			}
			if(null!=Data.getEndDate()) {
			row.createCell(6).setCellValue(Data.getEndDate()+"");
			}else {
				row.createCell(6).setCellValue("N/A");
				
			}
			if(null!=Data.getBenifitAmount()) {
			row.createCell(7).setCellValue(Data.getBenifitAmount());
			
			}else {
				row.createCell(7).setCellValue("N/A");
				
			}
			row.createCell(8).setCellValue(Data.getTerminatedReason());
			if(null!=Data.getTerminatedDate()) {
				row.createCell(9).setCellValue(Data.getTerminatedDate()+"");
			}else {
				row.createCell(9).setCellValue("N/A");
				
			}
			row.createCell(10).setCellValue(Data.getDenialReason());
				
			rowindex ++;
			
			
		}
		
		FileOutputStream fos=new FileOutputStream(f);
		workbook.write(fos);
		
		
		ServletOutputStream sos=response.getOutputStream();
		workbook.write(sos);
		workbook.close();
		
	}

	public ExcelGenerated() {
		// TODO Auto-generated constructor stub
	}

}
