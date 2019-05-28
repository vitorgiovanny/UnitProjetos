package controller;

public class Controller {

    private ControllerAluno controllerAluno;
    private ControllerCurso controllerCurso;
    private ControllerDisciplina controllerDisciplina;
    private ControllerHistorico controllerHistorico;
    private ControllerMatricula controllerMatricula;
    private ControllerMatriz controllerMatriz;
    private ControllerPeriodoLet controllerPeriodoLet;
    private ControllerProfessor controllerProfessor;
    private ControllerTurma controllerTurma;

    public Controller() {
        this.controllerAluno = new ControllerAluno();
        this.controllerCurso = new ControllerCurso();
        this.controllerDisciplina = new ControllerDisciplina();
        this.controllerHistorico = new ControllerHistorico();
        this.controllerMatricula = new ControllerMatricula();
        this.controllerMatriz = new ControllerMatriz();
        this.controllerPeriodoLet = new ControllerPeriodoLet();
        this.controllerProfessor = new ControllerProfessor();
        this.controllerTurma = new ControllerTurma();
    }

    public ControllerAluno getControllerAluno() {
        return controllerAluno;
    }

    public void setControllerAluno(ControllerAluno controllerAluno) {
        this.controllerAluno = controllerAluno;
    }

    public ControllerCurso getControllerCurso() {
        return controllerCurso;
    }

    public void setControllerCurso(ControllerCurso controllerCurso) {
        this.controllerCurso = controllerCurso;
    }

    public ControllerDisciplina getControllerDisciplina() {
        return controllerDisciplina;
    }

    public void setControllerDisciplina(ControllerDisciplina controllerDisciplina) {
        this.controllerDisciplina = controllerDisciplina;
    }

    public ControllerHistorico getControllerHistorico() {
        return controllerHistorico;
    }

    public void setControllerHistorico(ControllerHistorico controllerHistorico) {
        this.controllerHistorico = controllerHistorico;
    }

    public ControllerMatricula getControllerMatricula() {
        return controllerMatricula;
    }

    public void setControllerMatricula(ControllerMatricula controllerMatricula) {
        this.controllerMatricula = controllerMatricula;
    }

    public ControllerMatriz getControllerMatriz() {
        return controllerMatriz;
    }

    public void setControllerMatriz(ControllerMatriz controllerMatriz) {
        this.controllerMatriz = controllerMatriz;
    }

    public ControllerPeriodoLet getControllerPeriodoLet() {
        return controllerPeriodoLet;
    }

    public void setControllerPeriodoLet(ControllerPeriodoLet controllerPeriodoLet) {
        this.controllerPeriodoLet = controllerPeriodoLet;
    }

    public ControllerProfessor getControllerProfessor() {
        return controllerProfessor;
    }

    public void setControllerProfessor(ControllerProfessor controllerProfessor) {
        this.controllerProfessor = controllerProfessor;
    }

    public ControllerTurma getControllerTurma() {
        return controllerTurma;
    }

    public void setControllerTurma(ControllerTurma controllerTurma) {
        this.controllerTurma = controllerTurma;
    }

}
