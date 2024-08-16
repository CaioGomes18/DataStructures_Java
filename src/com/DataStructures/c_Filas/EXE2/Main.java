package com.DataStructures.c_Filas.EXE2;


/*No pacote temos mudanças na classe fila para que recebamos um object e não um no e tbm faremos alterações para o uso de generics*/
public class Main {

    public static void main(String [] args){
        Fila<String> fila1 = new Fila<String>();

        fila1.enqueue("primeiro");
        fila1.enqueue("segundo");
        fila1.enqueue("terceiro");
        fila1.enqueue("quarto");
        fila1.enqueue("quinto");

        System.out.println(fila1);
        System.out.println(fila1.dequeue());
        System.out.println(fila1);
        fila1.enqueue("ultimo");
        System.out.println(fila1);


        System.out.println(fila1.first());
        System.out.println(fila1);
    }
}
