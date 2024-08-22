package com.DataStructures.e_ListasDuplamenteEcadeadas.EXE1;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNO;
    private NoDuplo<T> referenciaUltimoNO;



    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        primeiroNO = null;
        referenciaUltimoNO = null;
        this.tamanhoLista = 0;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAux = primeiroNO;

        for(int i= 0; (i < index) && (noAux != null) ;i++){
            noAux = noAux.getNoprox();
        }

        return noAux;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public int size(){
        return this.tamanhoLista;
    }

    public void add(T conteudo){
        NoDuplo<T> novoNO = new NoDuplo<>(conteudo);

        novoNO.setNoprox(null);
        novoNO.setNoAnt(referenciaUltimoNO);
        if(primeiroNO == null){
            primeiroNO = novoNO;
        }

        if(referenciaUltimoNO != null){
            referenciaUltimoNO.setNoprox(novoNO);
        }

        referenciaUltimoNO = novoNO;
        tamanhoLista++;
    }

    public void add(int index, T conteudo) {
        NoDuplo<T> noAux = getNo(index);
        NoDuplo<T> novoNo= new NoDuplo<>(conteudo);
        novoNo.setNoprox(noAux);

        if(novoNo.getNoprox() != null){
            novoNo.setNoAnt(noAux.getNoAnt());
            novoNo.getNoprox().setNoAnt(novoNo);
        }else{
            novoNo.setNoAnt(referenciaUltimoNO);
            referenciaUltimoNO = novoNo;
        }

        if(index == 0){
            primeiroNO = novoNo;
        }else{
            novoNo.getNoAnt().setNoprox(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index){

        if(index == 0){
            primeiroNO = primeiroNO.getNoprox();

            if(primeiroNO != null){
                primeiroNO.setNoAnt(null);
            }
        }else{
            NoDuplo<T> noAux = getNo(index);
            noAux.getNoAnt().setNoprox(noAux.getNoprox());

            if(noAux != referenciaUltimoNO){
                noAux.getNoprox().setNoAnt(noAux.getNoAnt());
            }else{
                referenciaUltimoNO = noAux;
            }
        }
        this.tamanhoLista--;
    }


    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> NoAux = primeiroNO;
        for(int i = 0  ; i < size(); i++){
            strRetorno += "[NO{conteudo= " + NoAux.getConteudo() + " }]---->";
            NoAux = NoAux.getNoprox();
        }
        strRetorno += null;
        return strRetorno;
    }
}
