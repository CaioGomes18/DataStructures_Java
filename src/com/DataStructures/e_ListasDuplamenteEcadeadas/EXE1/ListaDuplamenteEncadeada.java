package com.DataStructures.e_ListasDuplamenteEcadeadas.EXE1;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> referenciaEntradaNO;
    private NoDuplo<T> referenciaUltimoNO;
    private int tamanhoLista;




    public ListaDuplamenteEncadeada(){
        referenciaEntradaNO = null;
        referenciaUltimoNO = null;
        this.tamanhoLista = 0;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAux = referenciaEntradaNO;

        for(int i= 0; (i < index) && (noAux != null) ;i++){
            noAux = noAux.getNoprox();
        }

        return noAux;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public int size(){
        return tamanhoLista;
    }


}
