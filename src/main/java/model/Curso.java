package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Curso{

//Atributos
private UUID CodigoCurso;
private int totalCredito;
private String NomeCurso;

//ArrayList
private ArrayList<Curso> Cursos = new ArrayList<Curso>();

//Objetos
Professor prof ;

//Construtores
public Curso(){
    this.CodigoCurso = UUID.randomUUID();
    prof = new Professor();
}


int visualizarCreditosCurso(){
    this.setTotalCredito(27);
    return this.getTotalCredito();
}


public String listarProfessorCurso(){
    return prof.getNomeProfessor();
}

public void adicionarCurso(String Ncurso){
    this.setNomeCurso(Ncurso);
    
}

ArrayList<Curso> ListarCurso(){
    for(Curso s : getCursos()){
        System.out.println(s);
    }
    return this.getCursos();
}


//Getters and Setters

    public String getNomeCurso() {
        return NomeCurso;
    }
    
    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }



    public int getTotalCredito() {
        return totalCredito;
    }

    public void setTotalCredito(int totalCredito) {
        this.totalCredito = totalCredito;
    }

    public UUID getCodigoCurso() {
        return CodigoCurso;
    }




    public ArrayList<Curso> getCursos() {
        return Cursos;
    }


    public void setCursos(ArrayList<Curso> Cursos) {
        this.Cursos = Cursos;
    }

}
