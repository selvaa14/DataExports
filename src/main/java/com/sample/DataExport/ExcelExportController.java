package com.sample.DataExport;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ExcelExportController {

    @GetMapping("/records/export/excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Records");
        Row headerRow = sheet.createRow(0);
        // Create header cells here

        // Add records data here

        workbook.write(response.getOutputStream());
        workbook.close();
    }
}

