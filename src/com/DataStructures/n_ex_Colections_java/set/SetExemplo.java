package com.DataStructures.n_ex_Colections_java.set;

import java.util.*;

public class SetExemplo {

    public static void main(String[] args) {
       // 7, 8.5, 9.3, 5, 7, 0, 3.6

        System.out.println("Crie um conjunto e adicione as notas: ");

        Set<Double> meuSet = new HashSet<>();
        meuSet.add(7d);
        meuSet.add(8.5);
        meuSet.add(9.3);
        meuSet.add(5d);
        meuSet.add(7d);
        meuSet.add(0d);
        meuSet.add(3.6);

        System.out.println(meuSet);

        //System.out.println("Exiba a posição da nota 5.0: ");
    //    System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
//        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");

        //Não podemos ver ou colocar nada pois o set não não trabalha c9om posições

        System.out.println("Confira se a nota 5.0 está no conjunto: " + meuSet.contains(5d));

     // System.out.println("Exiba a terceira nota adicionada: ");


        // Mesma coisa dos outros lá da posição


        System.out.println("Exiba a menor nota: " + Collections.min(meuSet));

        System.out.println("Exiba a maior nota: " + Collections.max(meuSet));


        Double soma = 0d;
        Iterator<Double> andador = meuSet.iterator();

        while(andador.hasNext()){
            Double next = andador.next();
            soma+= next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/ meuSet.size()));
        System.out.println("Remova a nota 0: ");
        meuSet.remove(0d);
        System.out.println(meuSet);


        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator = meuSet.iterator();

        while(iterator.hasNext()){
            Double next = iterator.next();
            if(next < 7){
                iterator.remove();
            }
        }

        System.out.println(meuSet);
        //Para fazer o print na hora que foram informados não podemos usar o hash set pois não tem nada que funcione, porém para isso
        //usamos a linkedHashSet
        Set<Double> meuSet2 = new LinkedHashSet<>();
        meuSet2.add(7d);
        meuSet2.add(8.5);
        meuSet2.add(9.3);
        meuSet2.add(5d);
        meuSet2.add(7d);
        meuSet2.add(0d);
        meuSet2.add(3.6);
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        System.out.println(meuSet2);


        //para utilizar a ordem natural dos elementos utilizamos um treeset
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> meuSet3 = new TreeSet<>(meuSet2);
        System.out.println(meuSet3);

        System.out.println("Apague todo o conjunto");
        meuSet.clear();

        System.out.println(meuSet2.isEmpty());
        meuSet2.clear();
        System.out.println(meuSet3.isEmpty());
        System.out.println(meuSet2.isEmpty());




    }
}
