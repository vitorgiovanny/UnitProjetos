package model;

import java.util.ArrayList;

public class Matricula {

    private int ano, semestre, codigoAluno;
    private Disciplina disciplina;
    private final ArrayList<Double> notas;
    private final ArrayList<Integer> faltas;

    public Matricula() {
        this.notas = new ArrayList<Double>();
        this.faltas = new ArrayList<Integer>();
        this.disciplina = new Disciplina();
    }

    public Matricula(int ano, int semestre, int codigoAluno) {
        this();
        this.ano = ano;
        this.semestre = semestre;
        this.codigoAluno = codigoAluno;
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

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public ArrayList<Integer> getFaltas() {
        return faltas;
    }

    public void addNota(Double nota) {
        this.notas.add(nota);
    }

    public void addFalta(Integer falta) {
        this.faltas.add(falta);
    }

}
