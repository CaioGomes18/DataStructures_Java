package com.DataStructures.g_Arvores;

public class ArvoreBinaria<T extends Comparable<T>> {


    private NoArvore<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        NoArvore<T> novoNo = new NoArvore<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private NoArvore<T>inserir(NoArvore<T> atual,NoArvore<T> novoNo){
        if(atual == null){
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;

    }




}
