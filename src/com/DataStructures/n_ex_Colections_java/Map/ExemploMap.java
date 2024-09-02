package com.DataStructures.n_ex_Colections_java.Map;


import java.util.*;
public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os veiculos ao seu respectivo consumo");
        
        //O Map não tem o método add então utilizamos o put
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);


        System.out.println("Substitua o consumo do gol por 15.2km/L");
        
        //Para fazer alterações é só colocar a chave de troca e o valor que isso acontece normalmente
        carrosPopulares.put("gol", 15.2);

        System.out.println(carrosPopulares);
        
        
        //Para verificar se alguma key está constida no meu dicionario eu utilizo o containsKey, porque ele verifica a key
        System.out.println("Confira se o modelo tucson está no dicionário" + carrosPopulares.containsKey("tucson"));
        System.out.println("Confira se o modelo tucson está no dicionário" + carrosPopulares.containsKey("uno"));
        
        
        //O método get faz com que se retorne os valores na key informada.
        System.out.println("Exiba o consumo do uno = " + carrosPopulares.get("uno"));

        System.out.println("Exiba o terceiro carro adicionado");

        System.out.println("Exiba os modelos = ");

        //No caso ele manda os set de keys, ou seja quais São as Keys presentes.
        Set<String> meuSet = carrosPopulares.keySet();
        System.out.println(meuSet);
        System.out.println("Exiba o consumo dos carros");
        //Métodos values retorna todos os valores dentro do dicionario
        Collection <Double> c = carrosPopulares.values();
        System.out.println(c);


        System.out.println("Exiba o carro que é mais economico : ");


        //No caso estamos pegando o carro mais economico
        Double maisEconomico = Collections.max(carrosPopulares.values());



        //No caso o entrySet pega o dicionario e coloca em uma list vamos dizer assim
        //ele retorna uma lista com os valores dentro do dicionario
        Set<Map.Entry<String, Double>> entries= carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        System.out.println("-----");
        System.out.println(entries);

        //No caso esse for é para pegar cada entry de cada vez.
        //A sintaxe Map.Entry é usada para representar uma entrada individual em um mapa (ou dicionário).
        //Cada entrada do mapa consiste em uma chave e um valor associado.
        for(Map.Entry<String, Double> entre : entries){

            //No caso desse if ele pega a entrada do valor e compara com a variavel
             if(entre.getValue().equals(maisEconomico)){
                 modeloMaisEficiente = entre.getKey();
             }
        }
        System.out.println(modeloMaisEficiente + " - " + maisEconomico);

        String modeloMenosEficiente = "";
        System.out.println("Exiba o modelo menos economico e seu consumo");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        for( Map.Entry<String, Double> entry: carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente " + modeloMenosEficiente + " Consumo   " + consumoMenosEficiente);
            }
        }

        System.out.println("Exiba a soma dos consumos");

        Iterator<Double> iterator = carrosPopulares.values().iterator();

        double soma = 0d;

        while(iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("Eiba a soma dos consumos dos carros = " + soma);

        System.out.println("Exiba a média dos consumos desse dicionario de carros = "+ (soma/carrosPopulares.size()));

        System.out.println("Remova os veiculos qual o consumo é 15,6k m/l");

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        System.out.println(carrosPopulares);

         while(iterator1.hasNext()){
             if(iterator1.next().equals(15.6)){
                 iterator1.remove();
             }
         }

        System.out.println(carrosPopulares);

        System.out.println("Eiba todos os carros na ordem que foram informados");


        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionario ordenado pelo modelo");

        Map<String, Double > treemap = new TreeMap<>(carrosPopulares1);

        System.out.println(treemap);

        System.out.println("Apague o dicionario de carros");

        carrosPopulares.clear();

        System.out.println("Confira se o dicionario está vazio : " + carrosPopulares.isEmpty());

    }
}
