package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Curso{

//Atributos
private UUID CodigoCurso;
private final int totalCredito;
private String NomeCurso;

//ArrayList
private ArrayList<Matriz> matrizes;
private ArrayList<Professor> prof;


//Construtores
public Curso(){
    matrizes = new ArrayList<>();
    prof = new ArrayList<>();
    
    this.totalCredito = 27;
    this.CodigoCurso = UUID.randomUUID();
}

int visualizarCreditosCurso(){
    return this.getTotalCredito();
}

//////////////////GETTERS AND SETTERS///////////////////////////

    public String getNomeCurso() {
        return NomeCurso;
    }
    
    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }

    public int getTotalCredito() {
        return totalCredito;
    }

    public UUID getCodigoCurso() {
        return CodigoCurso;
    }

    public void addMatriz(Matriz matrizes) {
        this.getMatrizes().add(matrizes);
    }

    public ArrayList<Matriz> getMatrizes() {
        return matrizes;
    }

    public ArrayList<Professor> getProf() {
        return prof;
    }

    public void addProf(Professor prof) {
        this.getProf().add(prof);
    }
}
