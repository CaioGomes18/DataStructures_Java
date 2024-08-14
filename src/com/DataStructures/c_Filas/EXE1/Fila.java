package com.DataStructures.c_Filas.EXE1;

public class Fila {

    private No refEntradaFila;

    public Fila() {
        this.refEntradaFila = null;
    }

    public boolean isEmpty(){
       return refEntradaFila == null? true : false;
    }


    public void enqueue(No novoNo){
        novoNo.setRefNo(refEntradaFila);
        refEntradaFila = novoNo;
    }

    public No first(){
        if(!this.isEmpty()){
            No primeiroNO = refEntradaFila;

            while(true){
                if(primeiroNO.getRefNo() != null){
                    primeiroNO = primeiroNO.getRefNo();
                }else{
                    break;
                }
            }
        }
        return null;
    }



    public No dequeue(){
        if(!this.isEmpty()){
            No primeiroNO = refEntradaFila;
            No noAux = refEntradaFila;

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
    public String toString()
    {
        String stringReturn = "";

        No noAux = refEntradaFila;

        if(refEntradaFila != null){
            while(true){
                stringReturn += "NO { objeto = " + noAux.getObject()+ "} ----->";
                if(noAux.getRefNo() != null){
                    noAux = noAux.getRefNo();
                }else{
                    stringReturn = "null";
                    break;
                }
            }
        }else{
            stringReturn = "null";
        }
        return stringReturn;
    }
}
