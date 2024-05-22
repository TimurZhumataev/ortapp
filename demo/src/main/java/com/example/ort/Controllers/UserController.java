package com.example.ort.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/home")
    public String home() { return "everyone"; }

    @GetMapping("/user/home")
    public String user() {
        return "users_home";
    }

    @GetMapping("/admin/home")
    public String admin() {
        return "admin_home";
    }

    @GetMapping("/login")
    public String login() { return "custom_login"; }
}
