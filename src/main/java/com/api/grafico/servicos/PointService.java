package com.api.grafico.servicos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.grafico.modelos.Point;
import com.api.grafico.repositorio.PointRepositorio;

@Service
public class PointService  {
    //from crudRepositiry we have all methods
    @Autowired
    private PointRepositorio repo;
    
   
   public  void ins(Point p) {
      repo.save(p);
   }

}
