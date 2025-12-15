package com.yourcompany.hms.controller;

import com.yourcompany.hms.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/billing")
public class BillingController { // User didn't request BillingController explicitly but
                                 // "BillingService/invoice.html" exists

    @Autowired
    private BillingService billingService;

    @GetMapping("/invoice")
    public String invoice() {
        return "billing/invoice";
    }
}
