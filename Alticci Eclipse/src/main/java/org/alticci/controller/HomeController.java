package org.alticci.controller;

import org.alticci.service.AlticciService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/alticci")
@CrossOrigin(origins = "*")
public class HomeController {

    private final AlticciService alticciService;

    public HomeController(AlticciService alticciService) {
        this.alticciService = alticciService;
    }

    @GetMapping("{n}")
    public long getAlticciValue(@PathVariable long n) {
        return alticciService.getAlticciValue(n);
    }

}