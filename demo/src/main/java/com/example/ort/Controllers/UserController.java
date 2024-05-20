package com.example.ort.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/home")
    public String home() { return "page for everyone"; }

    @GetMapping("/home/check")
    public String home_check() { return "just for checking"; }

    @GetMapping("/user/home")
    public String user() {
        return "page for users";
    }

    @GetMapping("/admin/home")
    public String admin() {
        return "page for admins";
    }

}
