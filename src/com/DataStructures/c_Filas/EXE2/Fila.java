package com.DataStructures.c_Filas.EXE2;



public class Fila<T> {
    private No<T> refentryFila1;

    public Fila() {
        this.refentryFila1 = null;
    }

    public boolean vazio(){
        return refentryFila1 == null? true : false;
    }


    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refentryFila1);
        refentryFila1 = novoNo;
    }

    public T first(){
        if(!this.vazio()){
            No primeiroNO = refentryFila1;

            while(true){
                if(primeiroNO.getRefNo() != null){
                    primeiroNO = primeiroNO.getRefNo();
                }else{
                    break;
                }
            }
            return (T)primeiroNO.getObject();
        }
        return null;
    }



    public T dequeue(){
        if(!this.vazio()){
            No primeiroNO = refentryFila1;
            No noAux = refentryFila1;

            while(true){
                if(primeiroNO.getRefNo() != null){
                    noAux = primeiroNO;
                    primeiroNO = primeiroNO.getRefNo();
                }else{
                    noAux.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNO.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refentryFila1;

        if(refentryFila1 != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject() +"}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
