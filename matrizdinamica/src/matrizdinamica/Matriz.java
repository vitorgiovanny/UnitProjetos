package matrizdinamica;

import java.util.Objects;


public class Matriz<T>{
    
    T[][][] matriz;
    
    int inicial1, inicial2, inicial3;
    
    public Matriz() {
        this.inicial1 = 4;
        this.matriz = (T[][][]) new Objects[4][4][4];
    }
    
    public Matriz(int dimensao1){
        this();
        this.matriz = (T[][][]) new Objects[dimensao1][4][4];
    }
    
    public Matriz(int dimensao1, int dimensao2){
        this(dimensao1);
        this.matriz = (T[][][]) new Objects[dimensao1][dimensao2][4];
    }
    
    public Matriz(int dimensao1, int dimensao2, int dimensao3) {
        this(dimensao1, dimensao2);
        this.matriz = (T[][][]) new Objects[dimensao1][dimensao2][dimensao3];
    }
    
    public String verificarDuplicados() {
        int veri = 0;
        String a = "matriz possuia elementos duplicados";
        String b = "matriz nao possuia elementos duplicados";
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                for (int l = 0; l < this.matriz.length; l++) {
                    if (this.matriz[i][j][l] == this.matriz[i + 1][j + 1][l + 1]) {
                        veri += 1;
                        this.matriz[i + 1][j + 1][l + 1] = null;
                    }
                }
            }
        }
        if (veri > 0) {
            return a;
        }
        return b;
    }
    
    public boolean add(int key1, int key2, T element) {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                for (int l = 0; l < this.matriz.length; l++) {
                    if (i == key1 && j == key2) {
                        if (this.matriz[i][j][l].equals(null)) {
                            this.matriz[i][j][l] = element;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public void add(int key1, int key2, int key3, T element){
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                for (int l = 0; l < this.matriz.length; l++) {
                    if (i == key1 && j == key2 && l == key3) {
                        this.matriz[i][j][l] = element;
                    }
                }
            }
        }
    }
    
    public boolean contains(T element) {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                for (int l = 0; l < this.matriz.length; l++) {
                    if (this.matriz[i][j][l] == element) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean contains(int key1, int key2, int key3, T element) {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                for (int l = 0; l < this.matriz.length; l++) {
                    if (i == key1 && j == key2 && l == key3) {
                        if (this.matriz[i][j][l] == element) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public void clear(){
        this.matriz = (T[][][]) new Objects[4][4][4];
    }
    
    public T get(int key1, int key2, int index) {
        return this.matriz[key1][key2][index];
    }
    
    public int indexOf(int key1, int key2, T element) {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                for (int l = 0; l < this.matriz.length; l++) {
                    if (i == key1 && j == key2) {
                        if (this.matriz[i][j][l].equals(element)) {
                            return l;
                        }
                    }
                }
            }
        }
        return -1;
    }
    
    public int lastindexOf(int key1, int key2, T element) {
        for (int i = 0; i < this.matriz.length; i--) {
            for (int j = 0; j < this.matriz.length; j--) {
                for (int l = 0; l < this.matriz.length; l--) {
                  if (i == key1 && j == key2) {
                      if (this.matriz[i][j][l].equals(element)) {
                          return l;
                      }
                  }  
                }
            }
        }    
        return -1;
    }
    
    boolean isEmpty() {
        int cont =0;
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                for (int l = 0; l < this.matriz.length; l++) {
                    if (this.matriz[i][j][l].equals(null)) {
                        cont += 1;
                    }
                }
            }
        }
        if (cont > 0) {
            return true;
        }
        return false;
    }   
    
    
    public boolean isEmpty(int key1, int key2, int key3) {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                for (int l = 0; l < this.matriz.length; l++) {
                    if (i == key1 && j == key2 && l == key3) {
                        if (this.matriz[i][j][l].equals(null)) {
                            return true;
                        }
                    }
                }
            }
        }
       return false; 
    }
    
    T remove(int key1, int key2, int index) {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                for (int l = 0; l < this.matriz.length; l++) {
                    if(i == key1 && j == key2 && l == index) {
                        if (this.matriz[i][j][l].equals(index)) {
                            this.matriz[i][j][l] = null;
                        }
                    }
                }
            }
        }
        return this.matriz[key1][key2][index];
    }
    
    public int size() {
        int contador = 0;
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                for (int l = 0; l < this.matriz.length; l++) {
                    if (this.matriz[i][j][l] != null) {
                        contador += 1;
                    }
                }
            }
        }
        return contador;
    }
    
    public void resize(int key1, int key2, int key3, int length) {
        
    }
    
    public void print(){
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                for (int l = 0; l < this.matriz[i][j].length; l++) {
                    System.out.print(this.matriz[i][j][l] + " ");
                }
                System.out.println("");
            }
           System.out.println("");
        }
    }
    
}
