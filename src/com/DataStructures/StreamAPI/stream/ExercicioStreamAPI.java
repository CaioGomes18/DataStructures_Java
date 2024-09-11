package com.DataStructures.StreamAPI.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
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
    }


}
