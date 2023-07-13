package com.example.Grafico.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Grafico.repositorio.PointRepositorio;


@RestController
@RequestMapping("Point")
public class PointController {

    @Autowired  //injected
    private PointRepositorio P;//instance
  

    @GetMapping
    public List<PointDTO> getAll(){
        List<PointDTO> PointList= P.findAll().stream().map(PointDTO::new).toList();
        return PointList;
    }


}
