package com.DataStructures.K_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        List<Car> listaCar = new ArrayList<>();

        listaCar.add(new Car("Bugatti"));
        listaCar.add(new Car("Chevrolet"));
        listaCar.add(new Car("volkswagen"));
        listaCar.add(new Car("maseratti"));


        System.out.println(listaCar);
        listaCar.remove(2);
        System.out.println(listaCar);

        System.out.println(listaCar.contains(new Car("Bugatti")));

        System.out.println(listaCar.get(2));

        System.out.println(listaCar.indexOf(new Car("Chevrolet")));




    }
}
