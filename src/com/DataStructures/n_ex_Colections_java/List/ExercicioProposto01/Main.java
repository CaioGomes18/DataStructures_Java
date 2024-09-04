package com.DataStructures.n_ex_Colections_java.List.ExercicioProposto01;

import java.util.*;
public class Main {

    /*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

    public static void main(String [] args){
        List<Double> temperaturas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("---Bem vindo ao programa de Temperatura Semestral---");
        System.out.println("Digite as temperaturas dos primeiros 6 meses do ano");

        System.out.println("Digite a temperatura de janeiro");
        temperaturas.add(scan.nextDouble());
        System.out.println("Digite a temperatura de Fevererio");
        temperaturas.add(scan.nextDouble());
        System.out.println("Digite a temperatura de Março");
        temperaturas.add(scan.nextDouble());
        System.out.println("Digite a temperatura de Abril");
        temperaturas.add(scan.nextDouble());
        System.out.println("Digite a temperatura de Maio");
        temperaturas.add(scan.nextDouble());
        System.out.println("Digite a temperatura de Junho");
        temperaturas.add(scan.nextDouble());

        System.out.println(temperaturas.toString());

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma =0d;
        while(iterator.hasNext()){
            Double valor = iterator.next();
            soma += valor;
        }
        Double media = (soma/temperaturas.size());
        System.out.printf("Media de temperatura dos 6 primeiros meses  = %.1f", media);

        Iterator<Double> iterator2 = temperaturas.iterator();
        System.out.println("\n----Meses que tiveram a temperatura acima da média-----");
        while(iterator2.hasNext()){
            Double valor = iterator2.next();
            if(valor > media){
                int index = temperaturas.indexOf(valor);
                switch(index){
                    case 0 :
                        System.out.println("1 - Janeiro = " + valor);
                        break;
                    case 1 :
                        System.out.println("2 - Fevereiro = " + valor);
                        break;
                    case 2:
                        System.out.println("3 - Março= " + valor);
                        break;
                    case 3:
                        System.out.println("4 - Abril "+ valor);
                        break;
                    case 4:
                        System.out.println("5 - Maio" + valor);
                        break;
                    case 5:
                        System.out.println("6 - Junho" + valor);
                        break;
                    default:
                        System.out.println("Não houve nenhum mês acima da média");
                }
            }
        }
    }
}
