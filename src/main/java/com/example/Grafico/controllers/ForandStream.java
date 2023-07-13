package com.example.Grafico.controllers;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import com.example.Grafico.modelos.Point;




public class ForandStream {
    
    
    
List<Point> items = new ArrayList<Point>(100);

public ForandStream(){
    Random random = new Random();

    
     for (int i = 0; i < 100; i++) {
        Point P = new Point(random.nextDouble(),0.0);

        items.add(P); // storing random integers in an array
    }
}


public void ForStream(){
    long TStream1 = System.nanoTime();
    items.stream()
    .forEach(s->System.out.println(s)); // storing random integers in an array

    long TStream2 = System.nanoTime() - TStream1;
    System.out.println(TStream2);

}


public void For(){

    for (int i = 0; i < items.size(); i++) {
        long TStream1 = System.nanoTime();
        
        Point element = items.get(i);
        System.out.println(element.getX()+""); // printing each array element
        long TStream2 = System.nanoTime() - TStream1;
        element.setgetY(TStream2);
        System.out.println(TStream2);

    }
    

}

}
