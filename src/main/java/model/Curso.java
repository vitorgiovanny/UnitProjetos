package model;

import java.util.UUID;

public class Curso{

//Getters e Setters  
private int CodigoCurso;
private int totalCredito;
private String NomeCurso;

//Objetos
Professor prof = new Professor();
//Alunos alunos = new Alunos();

//Id curso
String IdCUr;

public Curso(){
    
}


int visualizarCreditosCurso(){
    return -1;
}


String listarProfessorCurso(){
    return null;
}

void adicionarCurso(){}

String ListarCurso(){
    return null;
}




//Getters and Setters

    public String getNomeCurso() {
        return NomeCurso;
    }
    
    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }

    public int getCodigoCurso() {
        return CodigoCurso;
    }

    public void setCodigoCurso(int CodigoCurso) {
        this.CodigoCurso = CodigoCurso;
    }

    public int getTotalCredito() {
        return totalCredito;
    }

    public void setTotalCredito(int totalCredito) {
        this.totalCredito = totalCredito;
    }
}
