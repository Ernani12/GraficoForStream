package com.example.Grafico.modelos;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Resposta {
    
  
     
    private String menssagem;

    public void Menssagem(String menssagem) {
        this.menssagem = menssagem;
    }

   
}
