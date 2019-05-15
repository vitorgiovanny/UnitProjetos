package projetounit;

import java.util.UUID;

/**
 * @author guilherme
 */

public class Professor {
    private UUID identificacaoProf;
    private int matriculaProfessor;
    private String nomeProfessor;
    //private Curso[] cursos;

    public Professor() {
    }

    public Professor(String nomeProfessor, int matriculaProfessor) {
        this();
        this.identificacaoProf = UUID.randomUUID();
        this.setNomeProfessor(nomeProfessor);
        this.setMatriculaProfessor(matriculaProfessor);
        this.setIdentificacaoProf(identificacaoProf);
    }

    public UUID getIdentificacaoProf() {
        return identificacaoProf;
    }

    public void setIdentificacaoProf(UUID identificacaoProf) {
        this.identificacaoProf = identificacaoProf;
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

    @Override
    public String toString() {
        return "{Nome: " + this.getNomeProfessor()
                + ", Matricula: " + this.getMatriculaProfessor()
                + ", ID professor: " + this.getIdentificacaoProf() + "}";
    }
    
}
