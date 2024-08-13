package com.DataStructures.b_Pilhas.EXE1;

public class No {
    private int dado;
    private No refNo = null;



    public No(){

    }
    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getReNo() {
        return refNo;
    }

    public void setReNo(No reNo) {
        this.refNo = reNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
