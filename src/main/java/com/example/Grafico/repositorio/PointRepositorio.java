package com.example.Grafico.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Grafico.modelos.Point;

public interface PointRepositorio extends JpaRepository<Point, Integer> {  
}
  