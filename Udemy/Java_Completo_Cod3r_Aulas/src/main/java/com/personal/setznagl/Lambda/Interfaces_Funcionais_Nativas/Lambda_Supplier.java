package com.personal.setznagl.Lambda.Interfaces_Funcionais_Nativas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Lambda_Supplier {
    public static void main(String[] args) {

        /**
         * Supplier não recebe argumentos e retorna oque é especificado
         */
        Supplier<List<String>> umaLista = () -> Arrays.asList("John","Duda","Petrovich");

        System.out.println(umaLista.get());
    }
}
