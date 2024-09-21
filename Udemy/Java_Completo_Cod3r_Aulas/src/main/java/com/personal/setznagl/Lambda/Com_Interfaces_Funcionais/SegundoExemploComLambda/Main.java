package com.personal.setznagl.Lambda.Com_Interfaces_Funcionais.SegundoExemploComLambda;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };

        System.out.println(calc.apply(2.8, 95D));
    }
}
