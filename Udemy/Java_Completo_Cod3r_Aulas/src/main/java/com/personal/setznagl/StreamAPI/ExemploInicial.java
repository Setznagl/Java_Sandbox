package com.personal.setznagl.StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploInicial {
    public static void main(String[] args) {
        List<String> listaExemplo = Arrays.asList("Daniela","Marcia","Teodoro");

        for (String nome : listaExemplo) {  System.out.println(nome); }
            System.out.println("\n");

        Iterator<String> it = listaExemplo.iterator();
        while (it.hasNext()) { System.out.println(it.next());}
            System.out.println("\n");

        //Stream abstraiu toda a necessidade de implementação do laço for
        Stream<String> st = listaExemplo.stream();
        st.forEach(System.out::println);
    }
}
