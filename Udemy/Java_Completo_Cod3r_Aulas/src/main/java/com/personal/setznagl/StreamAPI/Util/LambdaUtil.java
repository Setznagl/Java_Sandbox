package com.personal.setznagl.StreamAPI.Util;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaUtil {
    private LambdaUtil(){
        //Impede que a classe seja instanciada, visto que nesse
        //caso não é necessário, servirá somente para consulta
    }
    public static final Predicate<Aluno> aprovado = a -> a.nota >= 7;
    public static final Consumer<String> print = System.out::println;
    public static final UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    public static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+"";
    public static final UnaryOperator<String> grito = n -> n + "!!!";
}
