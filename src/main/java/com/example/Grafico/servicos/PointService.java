package com.example.Grafico.servicos;


import java.util.List;

import com.example.Grafico.modelos.Point;

public interface PointService {

    void save(Point P);
    List < Point > findAll();

}
