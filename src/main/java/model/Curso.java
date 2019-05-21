package model;

import java.util.ArrayList;
import java.util.UUID;

public class Curso{

//Getters e Setters  
private UUID CodigoCurso;
private int totalCredito;
private String NomeCurso;

//ArrayList
private ArrayList<String> Cursos = new ArrayList<String>();

//Objetos
Professor prof = new Professor();

//Construtores
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
        getCursos().add(this.getNomeCurso());
}

ArrayList<String> ListarCurso(){
    for(String s : getCursos()){
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

    /**
     * @return the Cursos
     */
    public ArrayList<String> getCursos() {
        return Cursos;
    }

    /**
     * @param Cursos the Cursos to set
     */
    public void setCursos(ArrayList<String> Cursos) {
        this.Cursos = Cursos;
    }
}
