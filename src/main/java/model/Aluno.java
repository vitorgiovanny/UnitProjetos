package UnitProjetos.src.main.java.model;

import java.util.UUID;

public class Aluno {
	//private String matriculas;
	private String nomeAluno;
	private int totalCreditos;
	private String dataNascimento;
	private double mediaGeral;
	private int codigoAluno;
	//private Historico historico;

	public Aluno(String nomeAluno, int totalCreditos, String dataNascimento, double mediaGeral, int codigoAluno) {
		
	    this();
	    //this.matriculas = matriculas;
	    this.nomeAluno = nomeAluno;
	    this.totalCreditos = totalCreditos;
	    this.dataNascimento = dataNascimento;
	    this.mediaGeral = mediaGeral;
	    this.codigoAluno = codigoAluno;
	    
	}


public Aluno(){
    
}


public String getNomeAluno() {
	return nomeAluno;
}
public void setNomeAluno(String nomeAluno) {
	this.nomeAluno = nomeAluno;
}
public int getTotalCreditos() {
	return totalCreditos;
}
public void setTotalCreditos(int totalCreditos) {
	this.totalCreditos = totalCreditos;
}
public String getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public double getMediaGeral() {
	return mediaGeral;
}
public void setMediaGeral(double mediaGeral) {
	this.mediaGeral = mediaGeral;
}
public int getCodigoAluno() {
	return codigoAluno;
}
public void setCodigoAluno(int codigoAluno) {
	this.codigoAluno = codigoAluno;
}

}

