package com.personal.setznagl.Lambda.Interfaces_Funcionais_Nativas;

import java.util.function.Function;

/**
 * Recebe dois parâmetros, Tipo do parâmetro de entrada e Tipo da saída
 *
 * Diferente do BinaryOperator onde os dois são do mesmo tipo nesse a saída é alterável
 *
 * Para concatenar as saídas com andThen() a saída deve ser compatível com a entrada no método seguinte
 */
public class Lambda_Function {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par" : "impar";
        Function<String , String> oResultadoE = valor -> "O resultado é: " + valor;
        Function<String , String> empolgado = valor -> valor + "!!!!!!!";

        System.out.println(parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(33));
    }
}
