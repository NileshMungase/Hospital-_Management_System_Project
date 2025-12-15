package com.yourcompany.hms.controller;

import com.yourcompany.hms.service.PatientService;
import com.yourcompany.hms.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        // Add patient specific data
        return "patient/dashboard";
    }

    @GetMapping("/history")
    public String history(Model model) {
        return "patient/history";
    }
}
