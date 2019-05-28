package model;

import java.util.ArrayList;

public class Historico {

    private int ano;
    private int semestre;
    private String situacao;
    private double media;
    private int faltas;
    private final ArrayList<Matricula> matriculasAluno;

    public Historico() {
        this.matriculasAluno = new ArrayList<Matricula>();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public ArrayList<Matricula> getMatriculasAluno() {
        return matriculasAluno;
    }

    public void addMatriculaAluno(Matricula matricula) {
        this.matriculasAluno.add(matricula);
    }
}
