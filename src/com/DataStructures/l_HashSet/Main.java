package com.DataStructures.l_HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class Main {

    public static void main(String [] args){
        /*Set<Car> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Car("Ford"));
        hashSetCarros.add(new Car("fiat"));
        hashSetCarros.add(new Car("Chevrolet"));
        hashSetCarros.add(new Car("alfa romeo"));

        System.out.println(hashSetCarros);*/

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCarros);

    }
}
