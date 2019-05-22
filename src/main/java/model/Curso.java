package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Curso{

//Atributos
private UUID CodigoCurso;
private int totalCredito;
private String NomeCurso;

public int creditos;
    
//SorteioNumero
Random ran = new Random();

//ArrayList
private ArrayList<Curso> Cursos = new ArrayList<Curso>();

//Objetos
Professor prof = new Professor();

//Construtores
public Curso(){
    this.creditos = ran.nextInt(4);
    this.CodigoCurso = UUID.randomUUID();
}


int visualizarCreditosCurso(){
    this.setTotalCredito(27);
    return this.getTotalCredito();
}


ArrayList listarProfessorCurso(){
    ArrayList nomesProfessores = new ArrayList();
    nomesProfessores.add(prof.getNomeProfessor());
    return nomesProfessores;
}

void adicionarCurso(String Ncurso){

    this.setNomeCurso(Ncurso);
    this.setTotalCredito(this.creditos);
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


    public void setCodigoCurso(UUID CodigoCurso) {
        this.CodigoCurso = CodigoCurso;
    }


    public ArrayList<Curso> getCursos() {
        return Cursos;
    }


    public void setCursos(ArrayList<Curso> Cursos) {
        this.Cursos = Cursos;
    }

}
