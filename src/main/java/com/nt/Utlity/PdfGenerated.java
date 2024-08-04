package com.nt.Utlity;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.stereotype.Component;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.nt.Entity.CitizenData;

import jakarta.servlet.http.HttpServletResponse;

@Component
public class PdfGenerated {

	public void pdfgenerated(HttpServletResponse response, List<CitizenData> record, File f) throws Exception {

		Document document = new Document(PageSize.A4);

		PdfWriter.getInstance(document, response.getOutputStream());
		PdfWriter.getInstance(document, new  FileOutputStream(f));

		document.open();

		Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		fontTiltle.setSize(20);

		// Creating paragraph
		Paragraph paragraph = new Paragraph("Citizen Info", fontTiltle);

		// Aligning the paragraph in document
		paragraph.setAlignment(Paragraph.ALIGN_CENTER);

		// Adding the created paragraph in document
		document.add(paragraph);

		PdfPTable table = new PdfPTable(11);
		table.setSpacingBefore(5);
		table.addCell("id");
		table.addCell("Name");
		table.addCell("Gender");
		table.addCell("plan");
		table.addCell("Status");
		table.addCell("startDate");
		table.addCell("EndDate");
		table.addCell("BenifitAmt");
		table.addCell("TerminatedReason");
		table.addCell("TerminatedDate");
		table.addCell("DeniedReason");

		for (CitizenData Data : record) {

			table.addCell(String.valueOf(Data.getCitizenId()));
			table.addCell(Data.getCitizenName());
			table.addCell(Data.getGender());
			table.addCell(Data.getPlanName());
			table.addCell(Data.getPlanStatus());
			table.addCell(Data.getStartDate() + "");
			table.addCell(Data.getEndDate() + "");
			table.addCell(String.valueOf(Data.getBenifitAmount()));
			table.addCell(Data.getTerminatedReason());
			table.addCell(Data.getTerminatedDate() + "");
			table.addCell(Data.getDenialReason());
		}
		document.add(table); 
		document.close();

	}

	public PdfGenerated() {
		// TODO Auto-generated constructor stub
	}

}
