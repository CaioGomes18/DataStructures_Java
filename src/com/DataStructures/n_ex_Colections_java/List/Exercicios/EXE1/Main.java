package com.DataStructures.n_ex_Colections_java.List.Exercicios.EXE1;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        /*
        Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");

        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/
        List<Double> notas2 = new LinkedList<>(notas);

        //notas2.addAll(notas);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.getFirst());
        double primeiroNum = notas2.getFirst();
        System.out.println(notas2);
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
        double notaRemovida = notas2.removeFirst();
        System.out.println(notaRemovida);

    }
}
