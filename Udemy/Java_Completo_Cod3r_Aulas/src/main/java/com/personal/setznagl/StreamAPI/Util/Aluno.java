package com.personal.setznagl.StreamAPI.Util;

public class Aluno {
    public String nome;
    public Double nota;
    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "[" + nome + " ( nota ) " + nota + ']';
    }
}
