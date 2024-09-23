package com.personal.setznagl.StreamAPI.Stream_Operation;

import com.personal.setznagl.StreamAPI.Util.Aluno;
import com.personal.setznagl.StreamAPI.Util.LambdaUtil;

import java.util.Arrays;
import java.util.List;

public class Stream_Filter_Example {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 7.2);
        Aluno aluno2 = new Aluno("Carlos", 8.5);
        Aluno aluno3 = new Aluno("Beatriz", 6.3);
        Aluno aluno4 = new Aluno("Daniel", 9.1);
        Aluno aluno5 = new Aluno("Elisa", 5.7);
        Aluno aluno6 = new Aluno("Fabio", 7.8);
        Aluno aluno7 = new Aluno("Gabriela", 8.0);
        Aluno aluno8 = new Aluno("Henrique", 6.9);
        Aluno aluno9 = new Aluno("Isabela", 9.4);
        Aluno aluno10 = new Aluno("Juliana", 5.3);
        //Arrays.asList é uma lista fixa
        List<Aluno> alunos = Arrays.asList(aluno1 , aluno2 , aluno3 , aluno4
                , aluno5 , aluno6 , aluno7 , aluno8 , aluno9, aluno10);

        alunos.stream()
                .filter(LambdaUtil.aprovado)
                .map(a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!")
                .forEach(LambdaUtil.print);
    }
}
