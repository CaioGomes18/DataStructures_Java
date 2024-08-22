package com.DataStructures.f_ListasCirculares.EXE1;

public class Main {

    public static void main(String []args){
        LIstaCircular<String> minhaListaCircular = new LIstaCircular<>();

        minhaListaCircular.add("teste 1 ");
        minhaListaCircular.add("teste 2 ");
        minhaListaCircular.add("teste 3 ");
        minhaListaCircular.add("teste 4 ");
        minhaListaCircular.add("teste 5 ");
        minhaListaCircular.add("teste 6 ");

        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(1);
        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular + " \ntamanho da lista = " + minhaListaCircular.size());

        System.out.println(minhaListaCircular.get(0));
        System.out.println(minhaListaCircular.get(4));
        System.out.println(minhaListaCircular.get(5));

        minhaListaCircular.remove(7);

    }
}
