
package matrizdinamica;

import java.util.Objects;

public class VetorDinamico<T> {
    
    T[] Vetor;
    int inicial;
    
    public VetorDinamico(){
        this.inicial = 8;
        this.Vetor = (T[]) new Objects[this.inicial];
    }
    
    public VetorDinamico (int tamanho){
        this();
        this.Vetor = (T[]) new Objects[tamanho];
    }
    
    public VetorDinamico(boolean permitir, int tamanho){
        this(tamanho);
        if (permitir != false) {
            
            for (int i = 0; i < this.Vetor.length; i++) {
                for (int j = 0; j < this.Vetor.length - 1; j++){
                    if (this.Vetor.equals(this.Vetor[j + 1])) {
                        System.out.println("permitindo elementos duplicados");
                    }
                }
                
            }
        }
    }
    
    public boolean add(T element) {
        for (int i = 0; i < this.Vetor.length; i++) {
            if (this.Vetor[i].equals(null)){
                this.Vetor[i] = element;
                return true;
            }
        }
        return false;
    }
    
    public boolean conteins(T elements) {
        for (int i = 0; i< this.Vetor.length; i ++) {
            if ( this.Vetor[i].equals(elements)) {
                return true;
            }
        }
        return false;
    }
    
    T get(int index) {
        return this.Vetor[index];
    }
    
    public void clear(){
        this.Vetor = (T[]) new Objects[8];
    }
    
    public int indexOf(T element) {
       for (int i = 0; i < this.Vetor.length; i ++) {
           if (this.Vetor[i].equals(element)) {
               return i;
           }
       }
       return -1;
    }
    
       public boolean isEmpty(){
          int a = 0;
           for (int i = 0; i < this.Vetor.length; i ++) {
               if (this.Vetor[i].equals(null)) {
                   a += 1;
               }
           }
           if (a != 0) {
               return false;
           }
           return true;
       }
       
       public int LastIndexOf(T element) {
           for (int i = this.Vetor.length; i > 0; i--) {
               if (this.Vetor[i].equals(element)) {
               return i;
               }
        }
           return -1;
       }
       
      T remove(int index){
          for (int i = 0; i < this.Vetor.length; i++) {
              if (this.Vetor[i].equals(index)) {
                  this.Vetor[i] = null;
              }
              
              T[] vetorauxiliar = (T[]) new Objects[this.Vetor.length - 1];
              
              for (int u = 0; u < vetorauxiliar.length; u++) {
                  if (this.Vetor[u] != null){
                    vetorauxiliar[u] = this.Vetor[u];
                    }
              }
              for (int p = 0; p < vetorauxiliar.length; p ++) {
                  this.Vetor[p] = vetorauxiliar[p];
              }
          }
         return this.Vetor[index];
       }
      
      public int size(){
          int tamanhoElementos = 0;
          for (int i = 0; i < this.Vetor.length; i ++) {
              tamanhoElementos += 1;
          }
          return tamanhoElementos;
      }
       
       public void resize(int length) {
           T[] vetorauxiliar = (T[])new Objects[this.Vetor.length + length];
           for (int i = 0; i < vetorauxiliar.length; i++) {
               vetorauxiliar[i] = this.Vetor[i];
           }
           
           this.Vetor = (T[]) new Objects[vetorauxiliar.length];
           for (int u = 0; u < this.Vetor.length; u++) {
               this.Vetor[u] = vetorauxiliar[u];
           }
       }
}