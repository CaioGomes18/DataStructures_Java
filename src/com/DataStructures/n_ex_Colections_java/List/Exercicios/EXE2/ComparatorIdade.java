package com.DataStructures.n_ex_Colections_java.List.Exercicios.EXE2;

import java.util.Comparator;

public class ComparatorIdade implements Comparator<Gato> {


    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
