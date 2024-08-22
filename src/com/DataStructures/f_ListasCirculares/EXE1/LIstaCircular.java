package com.DataStructures.f_ListasCirculares.EXE1;

public class LIstaCircular<T> {

     No<T> cabeca;
     No<T> cauda;
     private int tamanhoLista;


    public LIstaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public boolean isEmpty(){
         return this.tamanhoLista == 0 ? true : false;
     }

     public int size(){
         return this.tamanhoLista;
     }


     private No<T> getNo(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("A lista está vazia");
        }

        if(index == 0){
            return this.cauda;
        }

        No<T> noAux = this.cauda;

        for(int i = 0 ; (i < index) && (noAux != null); i++){
            noAux = noAux.getNoRefProx();
        }

        return noAux;

     }

     public T get(int index){
        return this.getNo(index).getConteudo();
     }

     public void remove(int index){
         if(index >= this.tamanhoLista){
             throw new IndexOutOfBoundsException("O index é maior que tamanho da lista");
         }

         No<T> noAux = this.cauda;


         if(index == 0){
             this.cauda = this.cauda.getNoRefProx();
             this.cabeca.setNoRefProx(this.cauda);
         }else if(index == 1){
            this.cauda.setNoRefProx(this.cauda.getNoRefProx().getNoRefProx());
         }else{
             for(int i = 0 ; i < index -1; i++){
                 noAux = noAux.getNoRefProx();
             }
             noAux.setNoRefProx(noAux.getNoRefProx().getNoRefProx());
         }


         this.tamanhoLista--;
     }

     public void add(T conteudo){
         No<T> novoNo = new No<>(conteudo);

         if(this.isEmpty()){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoRefProx(cauda);
         }else{
             novoNo.setNoRefProx(this.cauda);
             this.cabeca.setNoRefProx(novoNo);
             this.cauda = novoNo;
         }

         this.tamanhoLista++;

     }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAux = this.cauda;

        for(int i = 0; i < this.size(); i++){
            strRetorno += "[NO{conteúdo = "+ noAux.getConteudo() + " }]----> ";
            noAux = noAux.getNoRefProx();

        }
        strRetorno += this.size() != 0 ? "(Retorna ao inicio da lista)" : "[]";

        return strRetorno;
    }
}
