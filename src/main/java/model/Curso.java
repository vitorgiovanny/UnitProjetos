package model;

import java.util.ArrayList;
import java.util.UUID;

public class Curso{

//Getters e Setters  
private UUID CodigoCurso;
private int totalCredito;
private String NomeCurso;

//ArrayList
ArrayList Curso = new ArrayList();

//Objetos
Professor prof = new Professor();

//Teste
public Curso(){
    this.CodigoCurso = UUID.randomUUID();
}


int visualizarCreditosCurso(){
    return -1;
}


ArrayList listarProfessorCurso(){
    ArrayList nomesProfessores = new ArrayList();
    nomesProfessores.add(prof.getNomeProfessor());
    return nomesProfessores;
}

void adicionarCurso(String Ncurso){
    this.setNomeCurso(Ncurso);
    Curso.add(this.getNomeCurso());
}

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



    public int getTotalCredito() {
        return totalCredito;
    }

    public void setTotalCredito(int totalCredito) {
        this.totalCredito = totalCredito;
    }

    public UUID getCodigoCurso() {
        return CodigoCurso;
    }


    public void setCodigoCurso(UUID CodigoCurso) {
        this.CodigoCurso = CodigoCurso;
    }
}
