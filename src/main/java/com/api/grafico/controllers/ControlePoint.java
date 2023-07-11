package com.api.grafico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.grafico.modelos.Point;
import com.api.grafico.servicos.PointService;

@RestController
public class ControlePoint {

    @Autowired
    PointService pointservice;

  @RequestMapping(value = "/insert", method = RequestMethod.POST)
   public  ResponseEntity<Object> createProduct(@RequestBody Point p) {
      pointservice.ins(p);
      return new ResponseEntity<>("Point Created", HttpStatus.CREATED);
   }
    
}
