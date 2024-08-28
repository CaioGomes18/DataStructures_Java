package com.DataStructures.n_ex_Colections_java.List.ExerciciosPropostos.Ex02;


import java.util.*;
public class Main {
    public static void main(String [] args){
        List<String> depoimentos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("---Por favor responda as perguntas---");
        System.out.println("Digite apenas s ou n");

        System.out.println("Telefonou para vítima? ");
        depoimentos.add(scan.next());

        System.out.println("Esteve no local do crime?");
        depoimentos.add(scan.next());

        System.out.println("Mora Perto da vítima?");
        depoimentos.add(scan.next());

        System.out.println("Devia para a vítima?");
        depoimentos.add(scan.next());

        System.out.println("Já trabalhou com a vitima");
        depoimentos.add(scan.next());

        int count = 0;
        String repostaDaCulpa = "s";
        Iterator<String> iterator = depoimentos.iterator();
        while(iterator.hasNext()){
            String confissao = iterator.next();
            if(confissao.equals(repostaDaCulpa)){
                count++;
            }
        }

        if(count == 2){
            System.out.println("Essa pessoa é [ Suspeita ]");
        } else if (count == 3 || count ==4) {
            System.out.println("Essa pessoa é [ Cumplice ]");
        }else if(count == 5){
            System.out.println("Essa pessoa é [ Assassina ]");
        }else{
            System.out.println("Essa pessoa é [ Inocente ]");
        }
    }
}
