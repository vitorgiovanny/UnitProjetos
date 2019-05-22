package model;

import java.util.ArrayList;

public class Matriz {

    ArrayList<Disciplina> disciplinas;
    Curso cursos;
    PeriodoLetivo periodoLetivo;
    
    public Matriz() {
        disciplinas = new ArrayList<>();
        cursos = new Curso();
        periodoLetivo = new PeriodoLetivo();
    }
\\uyuhhh
    public void addDisciplina(Disciplina disc){
        disciplinas.add(disc);
    }
    public void removerDisciplina(Disciplina disc){
        disciplinas.remove(disc);
    }
    
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Curso getCursos() {
        return cursos;
    }

    public PeriodoLetivo getPeriodo() {
        return periodoLetivo;
    }

}
