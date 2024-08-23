package com.DataStructures.g_Arvores;

public class NoArvore<T extends Comparable<T>>{
    private T conteudo;
    private NoArvore<T> NoEsq;
    private NoArvore<T> NoDir;

    public NoArvore(T conteudo) {
        this.conteudo = conteudo;
        NoEsq = NoDir = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoArvore<T> getNoEsq() {
        return NoEsq;
    }

    public void setNoEsq(NoArvore<T> noEsq) {
        NoEsq = noEsq;
    }

    public NoArvore<T> getNoDir() {
        return NoDir;
    }

    public void setNoDir(NoArvore<T> noDir) {
        NoDir = noDir;
    }


    @Override
    public String toString() {
        return "NoArvore{" +
                "conteudo=" + conteudo +
                '}';
    }
}
