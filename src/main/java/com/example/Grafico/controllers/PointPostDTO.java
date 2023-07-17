package com.example.Grafico.controllers;

import com.example.Grafico.modelos.Point;

public record PointPostDTO (Integer id, Double x, Double y) {
 
    public PointPostDTO(Point P){
        this(P.getId(),P.getX(), P.getY());
    }   

}
