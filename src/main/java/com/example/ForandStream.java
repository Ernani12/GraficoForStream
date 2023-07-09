package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ForandStream {
    
List<Integer> items = new ArrayList<Integer>(100);

public ForandStream(){
    Random random = new Random();

     for (int i = 0; i < items.size(); i++) {
        items.add(random.nextInt()); // storing random integers in an array
    }
}

public void ForStream(){
    items.stream()
    .forEach(s->System.out.println(s)); // storing random integers in an array
}

public void For(){
    for (int i = 0; i < items.size(); i++) {
        int element = items.get(i);
        System.out.println(element+""); // printing each array element
    }
}

}
