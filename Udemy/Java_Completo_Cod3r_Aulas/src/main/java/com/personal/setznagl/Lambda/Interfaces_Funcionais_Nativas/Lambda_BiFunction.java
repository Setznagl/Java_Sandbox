package com.personal.setznagl.Lambda.Interfaces_Funcionais_Nativas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Lambda_BiFunction {
    public static void main(String[] args) {
        BinaryOperator<Double> average =
                (n1, n2) -> (n1 + n2)/2;
        System.out.println(average.apply(9.7 , 8.1));

        BiFunction<Double,Double,String> status =
                (n1 , n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(status.apply(6.23 , 9.73));
    }
}
