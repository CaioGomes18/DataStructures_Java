package com.DataStructures.a_Introducao.EX2.ConceitoNO;

public class Main {
    public static void main(String[] args) {

        No no1 = new No("Conteúdo no 1");

        No no2 =  new No("Conteúdo no 2");
        no1.setProximoNo(no2);

        No no3 = new No("Conteúdo no 3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteúdo no 4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


        // Esse sisteminha demonstra o funcionamento de um no onde ele gurada um tipo de dado e a referencia para o proximo no,
        // o que é armazenado é o enderço, ou seja caso as coisas se modifiquem, o programa irá acompanhar as modificações

    }
}
