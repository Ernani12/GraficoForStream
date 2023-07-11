package com.api.grafico.repositorio;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.api.grafico.modelos.Point;

@Repository
public interface PointServico {
      List < Point > findAll();

      void save(Point p);
  
}
  