package model;

import java.util.UUID;
import java.util.ArrayList;

public class Professor {

    private UUID identificacaoProf;
    private String nomeProfessor;
    private Curso cursoProfessor;

    public Professor() {
        this.identificacaoProf = UUID.randomUUID();
        this.cursoProfessor = new Curso();
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

    public Curso getCursosProfessor() {
        return this.cursoProfessor;
    }


    @Override
    public String toString() {
        return "Professor{" + "identificacaoProf=" + identificacaoProf + ", \nnomeProfessor=" + nomeProfessor + ", \ncursosProfessor=" + cursoProfessor + '}';
    }

}
