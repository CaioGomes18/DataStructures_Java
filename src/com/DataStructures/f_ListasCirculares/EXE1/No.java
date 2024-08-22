package com.DataStructures.f_ListasCirculares.EXE1;

public class No<T> {
    private T conteudo;
    private No<T> noRefProx;


    public No(T conteudo) {
        this.noRefProx = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoRefProx() {
        return noRefProx;
    }

    public void setNoRefProx(No<T> noRefProx) {
        this.noRefProx = noRefProx;
    }


    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
