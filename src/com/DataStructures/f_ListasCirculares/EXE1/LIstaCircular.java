package com.DataStructures.f_ListasCirculares.EXE1;

public class LIstaCircular<T> {

     No<T> cabeca;
     No<T> cauda;
     private int tamanhoLista;

     public boolean isEmpty(){
         return this.tamanhoLista == 0 ? true : false;
     }

     public int size(){
         return this.tamanhoLista;
     }
}
