package com.yourcompany.hms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

    @GetMapping("/login")
    public String login() {
        return "common/login";
    }

    @GetMapping("/")
    public String home() {
        // Redirect based on role or show a landing page.
        // For now, just a landing page or redirect to login.
        return "common/login";
    }
}
