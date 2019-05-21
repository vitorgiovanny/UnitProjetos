package model;

import java.util.UUID;
import java.util.ArrayList;
import java.util.Arrays;


public class Professor {
    private UUID identificacaoProf;
    private int matriculaProfessor;
    private String nomeProfessor;
    //ArrayList<String> ListaProfessor = new ArrayList();
    private ArrayList<String> cursosProfessor = new ArrayList<>();
    
    //Curso novo = new Curso();
    
    public Professor() {
        this.identificacaoProf = UUID.randomUUID();
    }

    public Professor(String nomeProfessor, int matriculaProfessor) {
        this();
        this.setNomeProfessor(nomeProfessor);
        this.setMatriculaProfessor(matriculaProfessor);
        this.AdicionarProfessorLista();
    }

    public UUID getIdentificacaoProf() {
        return identificacaoProf;
    }

    public int getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    
    public ArrayList<String> getCursosProfessor() {
        return cursosProfessor;
    }

    public void setCursosProfessor(ArrayList<String> cursosProfessor) {
        this.cursosProfessor = cursosProfessor;
    }
    
    public void AdicionarProfessorLista() {
        //this.ListaProfessor.add(this.getNomeProfessor());
    }
    
    
    public void adicionarCurso(String nomedoCurso) {
        this.cursosProfessor.add(nomedoCurso);
    }
    
    public void ListarCursoProfessor() {
        System.out.println(Arrays.toString(this.cursosProfessor.toArray()));
    }

    @Override
    public String toString() {
        return "{Nome: " + this.getNomeProfessor()
                + ", Matricula: " + this.getMatriculaProfessor()
                + "}";
    }
    
}