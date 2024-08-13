package com.DataStructures.b_Pilhas.EXE1;

public class Pilha {


    private No refNoEntradaPilha;


    public Pilha(){
        this.refNoEntradaPilha =  null;
    }
    public void push(No novoNo){
        No refAux = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAux);
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReNo();
        }

        return null;
    }


    public boolean isEmpty(){

        if(refNoEntradaPilha == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String stringReturn = "---------------------------\n";
        stringReturn +=  "        pilha\n";
        stringReturn += "---------------------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringReturn += "NO[dado = " +  noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReNo();
            }else{
                break;
            }
        }

        stringReturn += "---------------------------\n";
        return stringReturn;
    }
}
