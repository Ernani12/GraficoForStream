package com.example.grafico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homecontroller {

    @RequestMapping(value = "/")
    public String homePage() {
        return "home";
    }

}