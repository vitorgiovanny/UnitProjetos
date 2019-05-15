/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacadêmico;

/**
 *
 * @author Roberto
 */

public class Matricula {
    //Disciplina disciplina = new Disciplina();
    private int ano;
    private int semestre;
    private int codigoAluno;
    private int Disciplina;
    private double nota01;
    private double nota02;
    private double nota03;
    private int falta01;
    private int falta02;
    private int falta03;
    
    
    public void Matricula(int ano, int semestre, int codigoAluno){
        this.setAno(ano);
        this.setSemestre(semestre);
        this.setCodigoAluno(codigoAluno);
    }
    
    public double verificarNota(double nota){
        if (this.nota01 < 0 & this.nota01 > 10) {
            this.setNota01(0);     
            nota = this.getNota01();
        }
        if (this.nota02 < 0 & this.nota02 > 10) {
            this.setNota02(0);
            nota = this.getNota02();
        }
        if (this.nota03 < 0 & this.falta03 > 10) {
            this.setNota03(0);
            nota = this.getNota03();
        }
        return nota;       
    }
    
    public int verificarFalta(int falta){
        
        return falta;
    }
    
    public void verSituacaoMatricula(){
    
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public int getCodigoAluno(){
        return codigoAluno;
    }
    
    public void setCodigoAluno(int codigoAluno){
        this.codigoAluno = codigoAluno;
    }

    public double getNota01() {
        return nota01;
    }

    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }

    public double getNota03() {
        return nota03;
    }

    public void setNota03(double nota03) {
        this.nota03 = nota03;
    }

    public int getFalta01() {
        return falta01;
    }

    public void setFalta01(int falta01) {
        this.falta01 = falta01;
    }

    public int getFalta02() {
        return falta02;
    }

    public void setFalta02(int falta02) {
        this.falta02 = falta02;
    }

    public int getFalta03() {
        return falta03;
    }

    public void setFalta03(int falta03) {
        this.falta03 = falta03;
    }
    
    
}
