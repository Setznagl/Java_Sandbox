package com.personal.setznagl.Lambda.Sem_Interfaces_Funcionais;

public class Main {
    public static void main(String[] args) {
        Calculo somaInstancia = new Soma();
        Calculo multiplicacaoInstancia = new Multiplicacao();

        System.out.println(somaInstancia.executar(2.0, 5));
        System.out.println(multiplicacaoInstancia.executar(2.0, 5));
    }
}
