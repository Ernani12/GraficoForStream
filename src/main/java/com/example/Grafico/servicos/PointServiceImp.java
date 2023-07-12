package com.example.Grafico.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Grafico.modelos.Point;
import com.example.Grafico.repositorio.PointRepository;

@Service
public class PointServiceImp implements PointService  {
    
    @Autowired
    private PointRepository P;

     // save operation
     @Override
     public void save(Point p) {
          P.save(p);
     }
     @Override
     public List < Point > findAll() {
         return (List<Point>) P.findAll();
     }

}

