
package model.magister;

import model.interfaces.iPessoa;
import model.interfaces.iCurso;
import java.util.Date;
import java.util.Random;
import model.Disciplina;


public class Aluno implements iCurso, iPessoa{
    private String cpf;
    private String nome;
    private Date DataDeNascimento;
    private int id;
    private int codigo;
    
    public Aluno(int id, Date dataNascimento, String nome, String cpf){
        this.id = id;
        this.DataDeNascimento = dataNascimento;
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = 0;
    }
    
    public void NomeCurso(String nNome) {
        this.nome = nNome;
    }

    public void InsertCodigoCurso() {
        Random ncodigo = new Random();
        //Cria Logica para o Coordenador, Diretor e o Ceo LIMITAR OU AUMENTAR a quantidade de Codigos
        this.codigo = ncodigo.nextInt(5000);
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
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public Estado estado(Estado estado){
        return estado;
    }
    
    public Nota nota(Nota nota){
        return nota;
    }
}
