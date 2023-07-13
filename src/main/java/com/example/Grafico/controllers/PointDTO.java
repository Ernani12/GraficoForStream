package com.example.Grafico.controllers;

import com.example.Grafico.modelos.Point;

public record PointDTO (Integer id, Double x, Double y) {
 
    public PointDTO(Point P){
        this(P.getId(),P.getX(), P.getY());
    }   

}
