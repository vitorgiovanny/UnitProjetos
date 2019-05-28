package model;

import java.util.ArrayList;

public class Matriz {

    private Curso curso;
    private PeriodoLetivo periodoLetivo;
    private final ArrayList<Disciplina> disciplinas;

    public Matriz() {
        this.disciplinas = new ArrayList<Disciplina>();
        this.curso = new Curso();
        this.periodoLetivo = new PeriodoLetivo();
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public PeriodoLetivo getPeriodoLetivo() {
        return periodoLetivo;
    }

    public void setPeriodoLetivo(PeriodoLetivo periodoLetivo) {
        this.periodoLetivo = periodoLetivo;
    }

}
