package com.DataStructures.StreamAPI.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {

    public static void main(String[] args) {

        List<String> numeros = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");


        //----------------------------------------------------------------------------------
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        //podemos utilizar esse método sem o stream pois existe forEach na colection list

        numeros.stream()
                .forEach(System.out::println);

        //----------------------------------------------------------------------------------

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");


        List<String> stringTeste = new ArrayList<>();


        //podemos colocar cetos números dentro do que queremos
        stringTeste = numeros.stream()
                .limit(5)
                .toList();
        System.out.println("Colocando o código de streams na minha stringTeste");

        System.out.println(stringTeste);

        numeros.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        //No caso da impressão do set quando imprimimos o set no caso desse set podemos ver que não temos números repetidos pois um set não aceita números repetidos

        //----------------------------------------------------------------------------------

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");

        List<Integer> collectList = numeros.stream()
                //usamos o map para fazer a transformação do tipo da collection de string para inteiro
                .map(Integer :: parseInt)
                .collect(Collectors.toList());

        System.out.println(collectList);

        //----------------------------------------------------------------------------------


        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");


        //O filter pede um predicate
        /*List<Integer> lista2 = numeros.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if(i % 2 ==0 && i> 2)return true;
                        return false;
                    }
                })
                .collect(Collectors.toList());*/

        //podemos simplificar

        List<Integer> lista2 = numeros.stream()
                .map(Integer::parseInt)
                .filter(i -> i %2 == 0 && i > 2)
                .collect(Collectors.toList());

        System.out.println(lista2);



        //----------------------------------------------------------------------------------

        System.out.println("Mostre a média dos números: ");

        //No caso uso o MapToINt pois posso fazer manipulação de cada numero podemos assim dizer
        numeros.stream().mapToInt(Integer :: parseInt).average().ifPresent(System.out::println);





        //----------------------------------------------------------------------------------

        System.out.println("Remova os valores ímpares: ");

        /*collectList.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer % 2 != 0)return true;
                return false;
            }
        });*/

        collectList.removeIf( i -> (i % 2 !=0));

        System.out.println(collectList);

    }


}
