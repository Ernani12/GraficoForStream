package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ForandStream {
    

public void ForStream(){
    List<Integer> items = new ArrayList<Integer>(100);

    Random random = new Random();
    items.add(random.nextInt()); // storing random integers in an array


    items.stream().forEach(i -> System.out.println(i));
    
}

public void For(){
    Random random = new Random(); // creating Random object
    List<Integer> items = new ArrayList<Integer>(100);
    for (int i = 0; i < items.size(); i++) {
        items.add(random.nextInt()); // storing random integers in an array
        int element = items.get(i);
        System.out.println(element+""); // printing each array element
    }
}

}
