package model;

import java.util.ArrayList;

public class PeriodoLetivo {

    //Atributos e Variaveis
    private int ano;
    private int semestre;
    private String dataInicial;
    private String dataFinal;
    private final ArrayList<Turma> turmas;
    private final ArrayList<Matricula> matriculas;
    private final ArrayList<Historico> historicos;

    public PeriodoLetivo() {
        this.turmas = new ArrayList<Turma>();
        this.matriculas = new ArrayList<Matricula>();
        this.historicos = new ArrayList<Historico>();
    }

    //Metodos
    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public void addMatricula(Matricula matricula) {
        this.matriculas.add(matricula);
    }

    public void addHistorico(Historico historico) {
        this.historicos.add(historico);
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

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

}
