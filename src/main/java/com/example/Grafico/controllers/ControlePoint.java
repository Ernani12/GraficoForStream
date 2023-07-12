package com.example.Grafico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.Grafico.modelos.Point;
import com.example.Grafico.servicos.PointService;



@RestController
public class ControlePoint {

    @Autowired private PointService P;
  
    // Save operation
    @PostMapping("/points")
    public void save(  @RequestBody Point p)
    {
  
         P.save(p);
    }
    
}
