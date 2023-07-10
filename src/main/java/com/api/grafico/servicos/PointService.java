package com.api.grafico.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.grafico.modelos.Point;
import com.api.grafico.modelos.Resposta;
import com.api.grafico.repositorio.PointRepositorio;

import ch.qos.logback.core.status.Status;

@Service
public class PointService {
    
    @Autowired
    private PointRepositorio p;

    //list points
    public Iterable<Point> listar(){
        return p.findAll();
    }

    // my message
    @Autowired
    private Resposta  r;

    

    // method to save point
    public ResponseEntity<?> save(Point pi){

        if((pi.getY()==0)){
            //smessageria
            r.Menssagem("Noy set");
            return new ResponseEntity<Resposta>(r, HttpStatus.BAD_REQUEST);
        }else{
            r.Menssagem("Ok saved!");
            return new ResponseEntity<Point>(p.save(pi), HttpStatus.CREATED));
        }

    }


}
