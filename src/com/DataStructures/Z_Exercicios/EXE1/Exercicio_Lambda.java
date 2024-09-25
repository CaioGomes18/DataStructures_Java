package com.DataStructures.Z_Exercicios.EXE1;

import java.util.*;

public class Exercicio_Lambda {

    public static void main(String[] args) {

         Map<Integer, Contato> agenda1 = new HashMap<>() {{
             put(1, new Contato("Joana", 45500567));
             put(3, new Contato("Marcos", 67899067));
             put(5, new Contato("lucas", 12458907));
         }};


        System.out.println("--\tOrdem aleatória\t--");
        System.out.println(agenda1);
        for(Map.Entry<Integer, Contato> entry : agenda1.entrySet()){
            System.out.println(entry.getKey() + " - "  + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda2 = new LinkedHashMap<>() {{
            put(1, new Contato("Joana", 45500567));
            put(3, new Contato("Marcos", 67899067));
            put(5, new Contato("lucas", 12458907));
        }};

        System.out.println(agenda2);
        for(Map.Entry<Integer, Contato> entry : agenda2.entrySet()){
            System.out.println(entry.getKey() + " - "  + entry.getValue().getNome());
        }


        System.out.println("--\tOrdem id\t--");

        Map<Integer, Contato> agenda3 = new TreeMap<>(agenda1);

        System.out.println(agenda3);

        for(Map.Entry<Integer, Contato> entry : agenda3.entrySet())
        {
            System.out.println(entry.getKey() + " - "  + entry.getValue().getNome());
        }


        System.out.println("--\tOrdem número telefone\t--");

        Set<Map.Entry<Integer, Contato>> set_agenda1 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
        set_agenda1.addAll(agenda1.entrySet());

        for (Map.Entry<Integer, Contato> entry: set_agenda1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " +entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");

        Set<Map.Entry<Integer, Contato>> set_agenda2 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
        set_agenda2.addAll(agenda1.entrySet());

        for(Map.Entry<Integer, Contato> entry : set_agenda2){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}
