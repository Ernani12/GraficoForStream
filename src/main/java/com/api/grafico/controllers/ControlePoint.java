package com.api.grafico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.grafico.modelos.Point;
import com.api.grafico.servicos.PointService;

@RestController
public class ControlePoint {


    @Autowired
    private PointService ps;


    @GetMapping("/list")
    public Iterable<Point> listar(){
             return ps.listar();
    }
    
    
}
