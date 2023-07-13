package com.example.Grafico.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Grafico.modelos.Point;

public interface PointRepository extends JpaRepository<Point, Integer> {  
}
  