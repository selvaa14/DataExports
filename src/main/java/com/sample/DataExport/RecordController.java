package com.sample.DataExport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/records")
public class RecordController {
    @Autowired
    private RecordService recordService;

    @GetMapping
    public String getAllRecords(Model model) {
        List<Record> records = recordService.getAllRecords();
        model.addAttribute("records", records);
        return "records";
    }

    @GetMapping("/export/pdf")
    public String exportToPDF() {
        // Implement PDF export logic
        return "redirect:/records";
    }

    @GetMapping("/export/excel")
    public String exportToExcel() {
        // Implement Excel export logic
        return "redirect:/records";
    }

    @GetMapping("/export/csv")
    public String exportToCSV() {
        // Implement CSV export logic
        return "redirect:/records";
    }

    @GetMapping("/print")
    public String printView(Model model) {
        List<Record> records = recordService.getAllRecords();
        model.addAttribute("records", records);
        return "printRecords";
    }
}

