package model;

import java.util.UUID;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author guilherme
 */

public class Professor {
    private UUID identificacaoProf;
    private int matriculaProfessor;
    private String nomeProfessor;
    ArrayList<String> ListaProfessor = new ArrayList();
    //ArrayList<Curso> cursos;
    
    public Professor() {
        this.identificacaoProf = UUID.randomUUID();
    }

    public Professor(String nomeProfessor, int matriculaProfessor) {
        this();
        //this.identificacaoProf = UUID.randomUUID();
        this.setNomeProfessor(nomeProfessor);
        this.setMatriculaProfessor(matriculaProfessor);
        this.AdicionarProfessorLista();
    }

    public UUID getIdentificacaoProf() {
        return identificacaoProf;
    }

    public int getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    
    public void AdicionarProfessorLista() {
        this.ListaProfessor.add(this.getNomeProfessor());
        
    }
    
    public void Listar() {
        System.out.println(Arrays.toString(ListaProfessor.toArray()));
    }

    @Override
    public String toString() {
        return "{Nome: " + this.getNomeProfessor()
                + ", Matricula: " + this.getMatriculaProfessor()
                + "}";
    }
    
}