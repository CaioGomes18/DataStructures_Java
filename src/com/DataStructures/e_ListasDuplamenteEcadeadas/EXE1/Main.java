package com.DataStructures.e_ListasDuplamenteEcadeadas.EXE1;

public class Main {

    public static void main(String [] args){

        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        minhaLista.add("Olá mundo");
        minhaLista.add("helicoptero");
        minhaLista.add("João");
        minhaLista.add("teste 4");

        System.out.println(minhaLista);
        minhaLista.remove(2);
        System.out.println(minhaLista);

        minhaLista.add(2, "Olá voltei");
        System.out.println(minhaLista + "\ntamanho da lista = "+ minhaLista.size());

    }
}
