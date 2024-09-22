package com.personal.setznagl.Lambda.Interfaces_Funcionais_Nativas;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Lambda_BinaryOperator {
    public static void main(String[] args) {
        //Concetenando saída do operador binario no operador unário;
        BinaryOperator<Integer> average = (a, b) -> (a + b)/2;
        UnaryOperator<Integer> powByFive = (a) -> (int) Math.pow(a , 2);

        System.out.println(average.andThen(powByFive).apply(8 , 6));
    }
}
