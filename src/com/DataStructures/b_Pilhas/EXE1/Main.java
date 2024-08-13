package com.DataStructures.b_Pilhas.EXE1;

public class Main {

    public static void main(String [] args){

        Pilha pilha =  new Pilha();

        No no1 = new No(1);

        pilha.push(no1);
        pilha.push(new No(2));
        pilha.push(new No(3));
        pilha.push(new No(4));
        pilha.push(new No(5));
        pilha.push(new No(6));

        System.out.println(pilha);

        pilha.pop();

        System.out.println(pilha);

    }
}
