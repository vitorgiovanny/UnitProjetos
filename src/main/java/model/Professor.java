package model;

import java.util.UUID;
import java.util.ArrayList;

public class Professor {

    private UUID identificacaoProf;
    private String nomeProfessor;
    private String diplomaDout;
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

    public void setDiplomaDout(String diplomaDout) {
        this.diplomaDout = diplomaDout;
    }

    public String getDiplomaDout() {
        return diplomaDout;
    }
    
    public boolean VerificarCondicao() {
        if ("sim".equals(this.getDiplomaDout())) {
            return true;
        } 
        return false;
    }
    
    @Override
    public String toString() {
        return "Professor{" + "identificacaoProf=" + identificacaoProf + ", \nnomeProfessor=" + nomeProfessor + ", \ncursosProfessor=" + cursoProfessor + '}';
    }

}
