package com.DataStructures.n_ex_Colections_java.List.Exercicios.EXE2;

import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {

        int nome = g1.getName().compareToIgnoreCase(g2.getName());

        if(nome != 0){
            return nome;
        }

        int cor = g1.getColor().compareToIgnoreCase(g2.getColor());
        if(cor != 0){
            return cor;
        }


        return Integer.compare(g1.getIdade() , g2.getIdade());
    }
}
