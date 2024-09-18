package com.personal.setznagl.StringBuilder;

public class mainStringBuilder {
    public static void main(String[] args) {
        /*
        Gera todas as combinações necessárias AB, BC, ABC, oque pode causar
        uso excessivo de memória
        */
        String A = "A";
        String B = "B";
        String C = "C";
        String D = A.concat(B).concat(C);
        System.out.println(D);

        /*
        Faz toda a manipulação necessária sem criar Strings intermediárias
        durante as operações
        */
        StringBuilder sb = new StringBuilder();
        sb.append(A).append(B).append(B).append(C);
        System.out.println(sb);
    }
}
