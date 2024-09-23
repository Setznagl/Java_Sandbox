package com.personal.setznagl.StreamAPI.Stream_Operation;

import com.personal.setznagl.StreamAPI.Util.LambdaUtil;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Stream_Map_Example {
    public static void main(String[] args) {
        List<String> marcas = Arrays.asList("bmw" , "audi" , "honda");
        //Utilizando Streams e lambdas para transformar as collections
        Consumer<String> print = System.out::println;
        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!!";

        marcas.forEach(print);
        //.stream builda a stream, que é trabalhada posteriormente até ser encerrada em um operação terminal, como forEach()
        //marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println("\nUsando o Lambda em um único elemento! ");
        System.out.println(primeiraLetra.andThen(maiuscula).andThen(grito).apply("bmw"));

        /**
         * Aplica os lambdas enquanto o map percorre a lista
         */
        System.out.println("\nUsando as funções Lambda enquanto o map percorre os elementos (composição)");
        marcas.stream()
                .map(LambdaUtil.maiuscula)
                .map(LambdaUtil.primeiraLetra)
                .map(LambdaUtil.grito) //Referenciando a outra classe que foi feita para armazenar as Lambdas
                .forEach(print);
    }
}
