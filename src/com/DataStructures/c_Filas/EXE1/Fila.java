package com.DataStructures.c_Filas.EXE1;

public class Fila {

    private No refentryFila1;

    public Fila() {
        this.refentryFila1 = null;
    }

    public boolean vazio(){
       return refentryFila1 == null? true : false;
    }


    public void enqueue(No novoNo){
        novoNo.setRefNo(refentryFila1);
        refentryFila1 = novoNo;
    }

    public No first(){
        if(!this.vazio()){
            No primeiroNO = refentryFila1;

            while(true){
                if(primeiroNO.getRefNo() != null){
                    primeiroNO = primeiroNO.getRefNo();
                }else{
                    break;
                }
            }
            return primeiroNO;
        }
        return null;
    }



    public No dequeue(){
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
            return primeiroNO;
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
