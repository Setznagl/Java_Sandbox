package com.personal.setznagl;

import com.personal.setznagl.Models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("Introdução a Algorítimos com Java" , "...." , 20);
        Mentoria m1 = new Mentoria("Java com Spring Cloud", "..." , LocalDate.now());
        Conteudo con1 = new Curso("Trabalhando com Collections" , "..." , 5);
        Conteudo con2 = new Mentoria("Collections com Kotlin" , "..." , LocalDate.now());

        Bootcamp boot1 = new Bootcamp("Bootcamp Java Developer" , "Fundamentals");
        boot1.getConteudos().add(c1);boot1.getConteudos().add(m1);
        boot1.getConteudos().add(con1);boot1.getConteudos().add(con2);

        Dev dev1 = new Dev("Gabriel");
        dev1.inscreverBootcamp(boot1);
        System.out.println("Conteudos inscritos : " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos concluidos : " + dev1.getConteudosConcluidos());
    }
}