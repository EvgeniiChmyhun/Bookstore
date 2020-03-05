package com.bookstore.web.ui.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("${admin-console.base-path}")
public class DashboardController {

    @GetMapping("/dashboard")
    public String get() {
        return "admin/dashboard";
    }

}