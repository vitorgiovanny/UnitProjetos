package model;

import java.util.UUID;

public class Curso{

//Novo    
private int CodigoCurso;
private int totalCredito;

private String NomeCurso;

//Objetos
Professor prof = new Professor();
Alunos alunos = new Alunos();


//Matriz matriz = new Matriz(0);

String profID;

public Curso(){
    
}

int visualizarCreditosCurso(){
   
    return -1;
}

void adicionarCurso(){}


    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }

    /**
     * @return the CodigoCurso
     */
    public int getCodigoCurso() {
        return CodigoCurso;
    }

    /**
     * @param CodigoCurso the CodigoCurso to set
     */
    public void setCodigoCurso(int CodigoCurso) {
        this.CodigoCurso = CodigoCurso;
    }

    /**
     * @return the totalCredito
     */
    public int getTotalCredito() {
        return totalCredito;
    }

    /**
     * @param totalCredito the totalCredito to set
     */
    public void setTotalCredito(int totalCredito) {
        this.totalCredito = totalCredito;
    }
}
