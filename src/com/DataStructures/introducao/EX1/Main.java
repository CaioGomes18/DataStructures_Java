package com.DataStructures.introducao.EX1;

public class Main {

    public static void main(String [] args){
        int intA =2;
        int intB = intA;

        System.out.println("intA = " + intA + " intB = " + intB);

        MyOBJ obj1 = new MyOBJ(2);
        MyOBJ obj2 = obj1;


        System.out.println("Obj1 = " + obj1.toString() + "\nObj2" + obj2.toString());

        obj1.setNum(3);
        System.out.println("Obj1 = " + obj1.toString() + "\nObj2" + obj2.toString());

        //está sendo testado a relação onde quando se trata de atribuição de valores a variaveis primitivas o java copia o valor que está em memoória, porém
        //quando se trata de objeto o java copia a referencia na atribuição como podemos ver no output do porgraminha

        /*intA = 2 intB = 2
        Obj1 = MyOBJ{num=2}
        Obj2MyOBJ{num=2}
        Obj1 = MyOBJ{num=3}
        Obj2MyOBJ{num=3}*/


    }
}
