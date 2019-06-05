package controller;

import controller.Controller;
import java.util.ArrayList;
import model.Curso;

public class ControllerCurso {

    private Controller controllerGeral;
    private ArrayList<Curso> Curso;
    
    public ControllerCurso() {
        this.Curso = new ArrayList<Curso>();
    }

    public Controller getControllerGeral() {
        return controllerGeral;
    }

    public void setControllerGeral(Controller controllerGeral) {
        this.controllerGeral = controllerGeral;
    }
    

    
    public ArrayList<Curso> getprofessor() {
        return Curso;
    }
    
    public void AddProfessor(Curso curso) {
        this.Curso.add(curso);
    }
}
