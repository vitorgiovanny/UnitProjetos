
package model.magister;

import model.Disciplina;

public interface iCurso {
    public Disciplina handler(Disciplina disciplina);
    public void NomeCurso(String nNome);
    public void InsertCodigoCurso(int codigo);
}
