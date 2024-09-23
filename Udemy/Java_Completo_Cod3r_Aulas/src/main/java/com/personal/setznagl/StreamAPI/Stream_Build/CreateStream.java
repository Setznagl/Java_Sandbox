package com.personal.setznagl.StreamAPI.Stream_Build;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        Stream<String> langs = Stream.of("Java", "Lua" , "Javascript" , "PHP");
//        langs.forEach(print);

        String[] maisLangs = {"Python" , "Delphi" , "Go" , "C#"};
//        Stream.of(maisLangs).forEach(print);
//        Arrays.stream(maisLangs).forEach(print);
//        Arrays.stream(maisLangs , 0 ,1).forEach(print);

        List<String> outrasLangs = Arrays.asList("Kotlin" , "Swift" , "Typescript");
        outrasLangs.stream().forEach(print);
        //parallelStream utiliza o conceito de Threads paralelos para otimizar processamento
        outrasLangs.parallelStream().forEach(print);
    }
}
