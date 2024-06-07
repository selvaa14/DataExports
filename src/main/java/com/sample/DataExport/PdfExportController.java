package com.sample.DataExport;

import com.itextpdf.*;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class PdfExportController {

    @GetMapping("/records/export/pdf")
    public void exportToPDF(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        Document document = new Document(null);
        PdfWriter(document, response.getOutputStream());
        
        document.add(new Paragraph());
       
        document.close();
    }

	private void PdfWriter(Document document, ServletOutputStream outputStream) {
		
		
	}
}

