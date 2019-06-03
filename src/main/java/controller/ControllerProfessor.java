package controller;

import java.util.ArrayList;
import model.Professor;

public class ControllerProfessor {

    private Controller controllerGeral;
    private ArrayList<Professor> professores;
    
    public ControllerProfessor() {
        this.professores = new ArrayList<Professor>();
    }

    public Controller getControllerGeral() {
        return controllerGeral;
    }

    public void setControllerGeral(Controller controllerGeral) {
        this.controllerGeral = controllerGeral;
    }
    
    public ArrayList<Professor> getprofessor() {
        return professores;
    }
    
    public void AddProfessor(Professor professor) {
        this.professores.add(professor);
    }

}
