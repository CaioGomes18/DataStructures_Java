package com.DataStructures.i_StackPilha;

import java.util.Stack;

public class Main {
    public static void main(String [] args)
    {
        Stack<Carro> pilhaCarro = new Stack<>();


        pilhaCarro.push(new Carro("Ford"));
        pilhaCarro.push(new Carro("chevrolet"));
        pilhaCarro.push(new Carro("volkswagen"));
        pilhaCarro.push(new Carro("bugatti"));

        System.out.println(pilhaCarro.empty());
        System.out.println(pilhaCarro);
        pilhaCarro.pop();
        System.out.println(pilhaCarro);

    }
}
