package com.example.Grafico.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Grafico.modelos.Point;
import com.example.Grafico.repositorio.PointRepository;



@RestController
@RequestMapping("Point")
public class PointController {

    @Autowired  //injected
    private PointRepository P;//instance
  

    @GetMapping
    public List<Point> getAll(){
        List<Point> PointList= P.findAll();
        return PointList;
    }


}
