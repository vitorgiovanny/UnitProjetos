package model;

import java.util.UUID;
import java.util.ArrayList;

public class Professor {

    private UUID identificacaoProf;
    private String nomeProfessor;
    private ArrayList<Curso> cursosProfessor;

    public Professor() {
        this.identificacaoProf = UUID.randomUUID();
        this.cursosProfessor = new ArrayList<Curso>();
    }

    public Professor(String nomeProfessor) {
        this();
        this.nomeProfessor = nomeProfessor;
    }

    public UUID getIdentificacaoProf() {
        return identificacaoProf;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public ArrayList<Curso> getCursosProfessor() {
        return this.cursosProfessor;
    }

    public void addCursoProfessor(Curso curso) {
        this.cursosProfessor.add(curso);
    }

}
