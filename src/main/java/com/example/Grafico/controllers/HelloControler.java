
package com.example.Grafico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControler {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
