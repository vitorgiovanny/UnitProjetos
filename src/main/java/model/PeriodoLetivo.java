package SistemaDeMatricula;

public class PeriodoLetivo {

    //Atributos e Variaveis
    private int ano;
    private int semestre;
    private String dataInicial;
    private String dataFinal;
    private Turma turmas;
    private Matricula matriculas;
    private Historico historicos;

    //Metodos
    public String addDataInicio(String data) {
        return this.dataInicial = data;
    }

    public String addDataFinal(String data) {
        return this.dataFinal = data;
    }

    public String verDataInical() {
        return this.dataInicial;
    }

    public String verDataFinal() {
        return this.dataFinal;
    }

    public void addTurma() {

    }

    public void addMatricula() {

    }

    public void addHistorico() {

    }
}
