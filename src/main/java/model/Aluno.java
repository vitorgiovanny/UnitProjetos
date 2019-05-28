package model;

import java.util.ArrayList;
import java.util.UUID;

public class Aluno {

    private ArrayList<Matricula> matriculas;
    private String nomeAluno;
    private int totalCreditos;
    private String dataNascimento;
    private double mediaGeral;
    private final UUID codigoAluno;
    private Historico historico;

    public Aluno(String nomeAluno, int totalCreditos, String dataNascimento, double mediaGeral) {
        this();
        this.nomeAluno = nomeAluno;
        this.totalCreditos = totalCreditos;
        this.dataNascimento = dataNascimento;
        this.mediaGeral = mediaGeral;
    }

    public Aluno() {
        this.codigoAluno = UUID.randomUUID();
        this.matriculas = new ArrayList<Matricula>();
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getTotalCreditos() {
        return totalCreditos;
    }

    public void setTotalCreditos(int totalCreditos) {
        this.totalCreditos = totalCreditos;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public UUID getCodigoAluno() {
        return codigoAluno;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void addMatricula(Matricula matricula) {
        this.matriculas.add(matricula);
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

}
