package model;

import java.util.ArrayList;

public class Disciplina {

    private int codigoDisciplina;
    private String nomeDisciplina;
    private int qtdCreditos;
    private String tipoDisciplina;
    private int horasObrigatorias;
    private int limiteFaltas;
    private ArrayList<Historico> historicos;
    private Matriz matriz;
    private ArrayList<Matricula> matriculas;
    private ArrayList<Turma> turmas;

    public Disciplina() {
        this.historicos = new ArrayList<Historico>();
        this.matriculas = new ArrayList<Matricula>();
        this.turmas = new ArrayList<Turma>();
    }

    public Disciplina(int codigoDisciplina) {
        this();
        this.codigoDisciplina = codigoDisciplina;
    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getQtdCreditos() {
        return qtdCreditos;
    }

    public void setQtdCreditos(int qtdCreditos) {
        this.qtdCreditos = qtdCreditos;
    }

    public String getTipoDisciplina() {
        return tipoDisciplina;
    }

    public void setTipoDisciplina(String tipoDisciplina) {
        this.tipoDisciplina = tipoDisciplina;
    }

    public int getHorasObrigatorias() {
        return horasObrigatorias;
    }

    public void setHorasObrigatorias(int horasObrigatorias) {
        this.horasObrigatorias = horasObrigatorias;
    }

    public int getLimiteFaltas() {
        return limiteFaltas;
    }

    public void setLimiteFaltas(int limiteFaltas) {
        this.limiteFaltas = limiteFaltas;
    }

    public ArrayList<Historico> getHistoricos() {
        return historicos;
    }

    public void addHistorico(Historico historico) {
        this.historicos.add(historico);
    }

    public Matriz getMatriz() {
        return matriz;
    }

    public void setMatriz(Matriz matriz) {
        this.matriz = matriz;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void addMatricula(Matricula matricula) {
        this.matriculas.add(matricula);
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }

    @Override
    public String toString() {
        return "Disciplina{" + "codigoDisciplina=" + codigoDisciplina + ", nomeDisciplina=" + nomeDisciplina + ", qtdCreditos=" + qtdCreditos + ", tipoDisciplina=" + tipoDisciplina + ", horasObrigatorias=" + horasObrigatorias + ", limiteFaltas=" + limiteFaltas + ", historicos=" + historicos + ", matriz=" + matriz + ", matriculas=" + matriculas + ", turmas=" + turmas + '}';
    }

}
