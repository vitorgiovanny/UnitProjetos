package model;

import java.util.UUID;

public class Curso {

int CodigoCurso;
private String NomeCurso;

String profID = UUID.randomUUID().toString();

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }
}
