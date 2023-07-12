package com.example.Grafico.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Grafico.modelos.Point;

@Repository
public interface PointRepository extends CrudRepository<Point, Integer> {

  
}
  