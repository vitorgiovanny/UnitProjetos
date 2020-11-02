
package model.magister;

import java.util.Date;
import model.Disciplina;


public class Aluno implements iCurso, iPessoa{
    private String cpf;
    private String nome;
    private Date DataDeNascimento;
    private int id;
    
    public Aluno(int id, Date dataNascimento, String nome, String cpf){
        this.id = id;
        this.DataDeNascimento = dataNascimento;
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void NomeCurso(String nNome) {
    
    }

    public void InsertCodigoCurso(int codigo) {
    
    }

    public void setNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCpf(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
