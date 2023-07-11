package com.api.grafico.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.grafico.modelos.Point;

@Repository
public interface PointRepositorio extends CrudRepository<Point,Integer> {

}
  