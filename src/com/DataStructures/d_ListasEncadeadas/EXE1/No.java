package com.DataStructures.d_ListasEncadeadas.EXE1;

public class No<T> {
    private T dado;
    private No proxNo;


    public No (){
        this.proxNo = null;
    }

    public No(T dado) {
        this.dado = dado;
        this.proxNo = null;
    }

    public No(T dado, No proxNo) {
        this.dado = dado;
        this.proxNo = proxNo;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No getProxNo() {
        return proxNo;
    }

    public void setProxNo(No proxNo) {
        this.proxNo = proxNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }

    public String toStringEncadeado(){
        String str = "No{" +
                "dado=" + dado +
                '}';

        if(proxNo != null){
            str += "->" + proxNo.toString();
        }else{
            str += "-> null";
        }

        return str;
    }
}
