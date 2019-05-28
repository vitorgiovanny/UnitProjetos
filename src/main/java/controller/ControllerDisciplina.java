package controller;

import java.util.ArrayList;
import model.Disciplina;

public class ControllerDisciplina {

    private Controller controllerGeral;
    private final ArrayList<Disciplina> disciplinas;

    public ControllerDisciplina() {
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public Controller getControllerGeral() {
        return controllerGeral;
    }

    public void setControllerGeral(Controller controllerGeral) {
        this.controllerGeral = controllerGeral;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

}
