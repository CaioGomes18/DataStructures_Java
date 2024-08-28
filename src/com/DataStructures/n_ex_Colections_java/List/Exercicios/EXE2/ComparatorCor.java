package com.DataStructures.n_ex_Colections_java.List.Exercicios.EXE2;

import java.util.Comparator;

public class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getColor().compareToIgnoreCase(o2.getColor());
    }
}
