package com.DataStructures.e_ListasDuplamenteEcadeadas.EXE1;

public class NoDuplo<T> {
    private T conteudo;
    private NoDuplo<T> Noprox;
    private NoDuplo<T> NoAnt;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoprox() {
        return Noprox;
    }

    public void setNoprox(NoDuplo<T> noprox) {
        Noprox = noprox;
    }

    public NoDuplo<T> getNoAnt() {
        return NoAnt;
    }

    public void setNoAnt(NoDuplo<T> noAnt) {
        NoAnt = noAnt;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
