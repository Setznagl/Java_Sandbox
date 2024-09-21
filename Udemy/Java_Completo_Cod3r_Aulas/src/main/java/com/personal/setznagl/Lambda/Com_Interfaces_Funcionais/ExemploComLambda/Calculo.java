package com.personal.setznagl.Lambda.Com_Interfaces_Funcionais.ExemploComLambda;

/**
 * Uma interface funcional traz a ideia de que para utilizar a função não será necessário
 * Que seja sobrescrita ou herdada por alguma classe, através da ASSINATURA DO MÉTODO
 * que são os PARÂMETROS e RETORNO é possível armazenar uma lógica própria em uma
 * função Lambda
 *
 * Interfaces funcionais permitem SOMENTE UM método ('Default' não é contabilizado).
 */
@FunctionalInterface
public interface Calculo {
    public abstract double executar(double number01, double number02);

    default String validacao(){return "Qualquer coisa";}
    static String confirmacao(){return "Mais qualquer coisa";}
}
