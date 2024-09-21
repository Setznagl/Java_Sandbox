package com.personal.setznagl.Collections.Set_Heterogeneo;

import java.util.HashSet;
import java.util.Set;

public class SetHeterogeneoMain {
    @SuppressWarnings({"rawtypes" , "unchecked"})
    public static void main(String[] args) {
        /**
         * o Set aponta "warning" porque não é boa prática conjuntos com objetos ou wrappers diferentes
         *
         * // Não Ordenado - Não Indexado
         *
         * //
         */
        Set ConjuntoDesorganizado = new HashSet();
        System.out.println(ConjuntoDesorganizado.getClass());

            int numero01 = 1;
            ConjuntoDesorganizado.add(numero01);

            Integer numero02 = 1;
            ConjuntoDesorganizado.add(numero02);

            String string01 = "Tijolo"; ConjuntoDesorganizado.add(string01);
            boolean boolean01 = true; ConjuntoDesorganizado.add(boolean01);

        System.out.println("""
                Existe o 'int' = 1 e o 'Integer' = 1, porém como o Set não possui
                índice ou chaves os valores duplicados serão ignorados
                """);
        System.out.println(ConjuntoDesorganizado);

    }
}
