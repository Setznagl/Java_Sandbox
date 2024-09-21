package com.personal.setznagl.Lambda.Com_Interfaces_Funcionais.Foreach_com_lambda;

import java.util.Arrays;
import java.util.List;

public class Main {
    @SuppressWarnings("StreamToLoop")
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Ana", "Marcos", "Samuel");

        System.out.println("Vanilla Java...");
            for (String elemento : lista) {System.out.println(elemento);}System.out.println("\n");
        System.out.println("Lambda #01...");
            lista.forEach( (elemento) -> {System.out.println(elemento);});System.out.println("\n");
        System.out.println("Lambda #02 - Referencia por método 'println'...");
            lista.forEach(System.out::println);System.out.println("\n");
        System.out.println("Lambda #03 - Referencia por método 'meuImprimir'...");
            lista.forEach(element -> meuImprimir(element));System.out.println("\n");
        System.out.println("Lambda #04...Referencia refinada por método 'meuImprimir'");
            lista.forEach(Main::meuImprimir);System.out.println("\n");
    }

    static void meuImprimir(String nomeParametro){
        System.out.println("Meu nome é : " + nomeParametro);
    }
}
