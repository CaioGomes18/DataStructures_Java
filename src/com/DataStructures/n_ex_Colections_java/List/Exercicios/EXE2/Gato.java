package com.DataStructures.n_ex_Colections_java.List.Exercicios.EXE2;

public class Gato implements Comparable<Gato>{

    private String name;
    private Integer idade;
    private String color;

    public Gato(String name, Integer idade, String color) {
        this.name = name;
        this.idade = idade;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }


    @Override
    public int compareTo(Gato gato) {
        return this.getName().compareToIgnoreCase(gato.getName());
    }
}
