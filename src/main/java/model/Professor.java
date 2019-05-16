package model;

import java.util.UUID;
import java.util.ArrayList;

/**
 * @author guilherme
 */

public class Professor {
    private UUID identificacaoProf;
    private int matriculaProfessor;
    private String nomeProfessor;
    ArrayList<String> ListaProfessor;
  
    
    public Professor() {
		
    }

    public Professor(String nomeProfessor, int matriculaProfessor) {
        this();
        this.identificacaoProf = UUID.randomUUID();
        this.setNomeProfessor(nomeProfessor);
        this.setMatriculaProfessor(matriculaProfessor);
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
        this.ListaProfessor = new ArrayList<String>();
        this.ListaProfessor.add(this.getNomeProfessor());
    }
    
    public void Listar() {
        for (int i = 0; i < this.ListaProfessor.size(); i++) {
            System.out.print(this.ListaProfessor.get(i) + " ");
        }
    }

    @Override
    public String toString() {
        return "{Nome: " + this.getNomeProfessor()
                + ", Matricula: " + this.getMatriculaProfessor()
                + ", ID professor: " + this.getIdentificacaoProf() + "}";
    }
    
}
