package org.alticci.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class Home implements ErrorController {

    @GetMapping("/home")
    public String getClient() {
        return "forward:/index.html";
    }

}