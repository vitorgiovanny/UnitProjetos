package model;

import java.util.ArrayList;
import java.util.UUID;

public class Curso {

    //Atributos
    private final UUID codigoCurso;
    private String NomeCurso;
    private final int totalCredito;

    //ArrayList
    private final ArrayList<Aluno> alunos;
    private final ArrayList<Matriz> matrizes;
    private final ArrayList<Professor> professores;

    //Construtores
    public Curso() {
        this.totalCredito = 27;
        this.codigoCurso = UUID.randomUUID();
        this.alunos = new ArrayList<Aluno>();
        this.matrizes = new ArrayList<Matriz>();
        this.professores = new ArrayList<Professor>();
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
        return codigoCurso;
    }

    public void addMatriz(Matriz matriz) {
        this.getMatrizes().add(matriz);
    }

    public ArrayList<Matriz> getMatrizes() {
        return matrizes;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
