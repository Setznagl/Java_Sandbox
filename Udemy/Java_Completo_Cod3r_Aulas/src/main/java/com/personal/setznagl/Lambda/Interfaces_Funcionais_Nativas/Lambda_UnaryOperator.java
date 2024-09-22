package com.personal.setznagl.Lambda.Interfaces_Funcionais_Nativas;

import java.util.function.UnaryOperator;

public class Lambda_UnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> soma10 =  n -> n + 10;
        UnaryOperator<Integer> potencia2 = n -> (int) Math.pow(n , 2);
        UnaryOperator<Integer> multiplicacao2 = n -> n * 2;

        //andThen usa o número e segue sequencialmente as funções
        System.out.println(soma10.andThen(potencia2).andThen(multiplicacao2).apply(2));
        //Compose roda de trás pra frente, resolvendo o último primeiro
        System.out.println(multiplicacao2.compose(potencia2).compose(soma10).apply(2));
    }
}
