package com.sample.DataExport;

import com.opencsv.CSVWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class CsvExportController {

    @GetMapping("/records/export/csv")
    public void exportToCSV(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        CSVWriter writer = new CSVWriter(new PrintWriter(response.getWriter()));
        // Add records data here

        writer.close();
    }
}
