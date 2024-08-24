package com.DataStructures.h_equals_HashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){

        List<Car> carro = new ArrayList<>();

        carro.add(new Car("ford"));
        carro.add(new Car("bugatti"));
        carro.add(new Car("lamborghini"));



        //essa linha de código abaixo está verificando se existe o mesmo carro dentro da minha lista
        // No caso esse método contains faz uso do hash code e equals
        System.out.println(carro.contains(new Car("ford")));
        System.out.println(new Car("Ford").hashCode());

        Car carrro1 = new Car("ford");
        Car carrro2 = new Car("bugatti");
        System.out.println(carrro1.equals(carrro2));
    }
}
