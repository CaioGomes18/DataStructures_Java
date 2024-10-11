package com.DataStructures.O_exericiciosDeFixacao.ex1;

import java.util.HashMap;
import java.util.*;
public class PrimeiroExercicio {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os veiculos ao seu respectivo consumo");

        Map<String, Double> carrospopulares = new HashMap<>(){{
            put("Gol", 15.5);
            put("City", 11d);
            put("Cronus", 12d);
            put("Opalla", 5d);
            put("Corolla", 16d);
            put("Civic", 14d);
            put("Toros", 5d);
        }};
        System.out.println(carrospopulares);

        System.out.println("Substitua o consumo do gol por 15.2km/L");
        carrospopulares.put("Gol", 15.2);

        System.out.println(carrospopulares);

        System.out.println("Verificando se Existe o Carro tucson no dicionario -> " + carrospopulares.containsKey("Tucson"));
        System.out.println("Verificamos se existe o carro Cronus dentro do dicionario - > " + carrospopulares.containsKey("Cronus"));

        System.out.println("Exiba o consumo do Cronus -> " + carrospopulares.get("Cronus"));

        System.out.println("Exiba somente o nomes dos carros");
        Set<String> setDeCarrosPopulares = carrospopulares.keySet();
        System.out.println(setDeCarrosPopulares);

        System.out.println("Exiba os valores de consumo dos carros");
        Collection<Double> c = carrospopulares.values();
        System.out.println(c);


        System.out.println("Exiba o carro mais economico da biblioteca");
        Double maisEconomico = Collections.min(carrospopulares.values());


        Set<Map.Entry<String, Double>> meuEntry = carrospopulares.entrySet();
        String ModeloMaisEficiente = "";


        for(Map.Entry<String, Double> entries : meuEntry){
            if(entries.getValue().equals(maisEconomico)){
                ModeloMaisEficiente = entries.getKey();
            }
        }
        System.out.println(ModeloMaisEficiente + " " + maisEconomico);

        System.out.println("imprima o carro com Maior consumo");



    }
}
