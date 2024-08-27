package com.DataStructures.n_ex_Colections_java.List;

import java.util.*;

public class ExemploList {

    public static void main(String[]args){
        List<Double> list = new ArrayList<>();

        System.out.println("Crie uma lista e adicione as sete notas: ");
        //7, 8.5, 9.3, 5, 7, 0, 3.6

        //Se adicionarmos um d depois do númeor interio ele vai aceitar o double
        list.add(7d);
        list.add(8.5);
        list.add(9.3);
        list.add(5d);
        list.add(7d);
        list.add(0d);
        list.add(3.6);

        System.out.println(list.toString());

        System.out.println("Exiba a posição da nota 5.0: " + list.indexOf(5d));

        System.out.println("Adicone a nota 8 a posição 4" );
        list.add(4, 8.0);

        System.out.println(list.toString());



        System.out.println("Substituia a nota 5.0 pela nota 6.0");
        list.set(list.indexOf(5d), 6.0);

        System.out.println(list.toString());

        System.out.println("Confira se a nota 5 está na Lista = [ " + list.contains(5d) + " ]");

        System.out.println("Exiba a lista na ordem que forma colocados =");
        int index = 0;
        for(Double i : list){
            System.out.println("Nota [" +index+ "] = "+ i);
            index ++;
        }

        System.out.println("Exiba a terceira nota adicionada =" + list.get(2));


        // O Collections consegue fazer a comparação pois a classe double implementa a interface comparable
        System.out.println("Exiba a menor nota " + Collections.min(list));
        System.out.println("Exiba a maior nota " + Collections.max(list));

        Iterator<Double> iterator = list.iterator();
        Double soma =0d;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Faça soma das notas - Soma = [" + soma + "]");

        System.out.println("Faça a a média das notas - Média = ["+ (soma/list.size()) + "]");

        System.out.println("Remova a nota 0 da lista");
        list.remove(0d);
        System.out.println(list.toString());

        Iterator<Double> iterator1 = list.iterator();

        System.out.println("Elimine todas as notas menores que 7");
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7)
                iterator1.remove();
        }
        System.out.println(list);

        System.out.println("Apague toda lista");
        list.clear();

        System.out.println("Verifique se a lista ta vazia "+ list.isEmpty());
    }
}
