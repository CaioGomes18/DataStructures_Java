package com.DataStructures.j_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String [] args){
        Queue<Car> LinkedListCar = new LinkedList<>();

        LinkedListCar.add(new Car("Ford"));
        LinkedListCar.add(new Car("Nissan"));
        LinkedListCar.add(new Car("Chevrolet"));
        LinkedListCar.add(new Car("Volkwagen"));
        LinkedListCar.add(new Car("Bugatti"));

        System.out.println(LinkedListCar);

        LinkedListCar.remove();

        System.out.println(LinkedListCar);



    }
}
