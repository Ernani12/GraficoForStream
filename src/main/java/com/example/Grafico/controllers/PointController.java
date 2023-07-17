package com.example.Grafico.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Grafico.modelos.Point;
import com.example.Grafico.repositorio.PointRepositorio;


@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("Point")
public class PointController {

    @Autowired  //injected
    private PointRepositorio P;//instance
  

    @GetMapping
    public List<PointPostDTO> getAll(){
        List<PointPostDTO> PointList= P.findAll().stream().map(PointPostDTO::new).toList();
        return PointList;
    }

    @PostMapping
    public void savePoint(@RequestBody PointPostDTO data){
        Point Pont = new Point(data);
            P.save(Pont);
           
    }   
 



}
