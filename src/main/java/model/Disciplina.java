package model;

public class Disciplina {

    private int codigoDisciplina;
    private String nomeDisciplina;
    private int qtdCreditos;
    private char tipoDisciplina;
    private int horasObrigatorias;
    private int limiteFaltas;
    // private ArrayList<Matricula> matriculas;
    // private ArrayList<Historico> historicos;
    // private Matriz matriz;
    // private ArrayList<Turma> turmas;

    public Disciplina() {
        // this.matriculas = new ArrayList<>();
        // this.historicos = new ArrayList<>();
        // this.turmas = new ArrayList<>();
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

    public char getTipoDisciplina() {
        return tipoDisciplina;
    }

    public void setTipoDisciplina(char tipoDisciplina) {
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
}
