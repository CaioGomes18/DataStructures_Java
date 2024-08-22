package com.DataStructures.d_ListasEncadeadas.EXE1;

public class Listaencadeada <T>{

    No<T> referenciaEntrada;
    public Listaencadeada(){
        this.referenciaEntrada = null;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true: false;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProxNo() != null){
                    referenciaAux = referenciaAux.getProxNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAux = referenciaEntrada;
        for(int i = 0; i < this.size() - 1 ; i++){
            noAux = noAux.getProxNo();
        }

        noAux.setProxNo(novoNo);

    }

    private No<T> getNo(int index){

        validaIndice(index);

        No<T> noAux = referenciaEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i <= index; i++){
            noRetorno = noAux;
            noAux = noAux.getProxNo();
        }

        return noRetorno;
    }


    private void validaIndice(int index){
        if(index >= this.size()){

            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("não existe conteúdo no indece " + index + "dessa lista, essa lista só vai até o tamanho" + ultimoIndice);
        }
    }

    public T get(int index){
        return getNo(index).getDado();
    }

    public T remove(int index){
        validaIndice(index);
        No<T> noAlvo = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noAlvo.getProxNo();
            return noAlvo.getDado();
        }

        No<T> noAnterior = getNo(index -1);

        noAnterior.setProxNo(noAlvo.getProxNo());
        return noAlvo.getDado();
    }

    @Override
    public String toString() {

        String strRetorno = "";

        No<T> noAux = referenciaEntrada;

        for(int i = 0; i< this.size(); i++){
            strRetorno += "No{" + "conteúdo=" + noAux.getDado() + "}----> ";
            noAux = noAux.getProxNo();
        }

        strRetorno += "null";
        return strRetorno;
    }
}
