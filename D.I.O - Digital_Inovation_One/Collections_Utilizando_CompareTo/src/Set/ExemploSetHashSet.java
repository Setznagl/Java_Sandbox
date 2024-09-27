package Set;

import java.util.*;

public class ExemploSetHashSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d , 5.9d, 3.5d, 7.19d, 1.99d, 8.45, 10d , 10d , 10d , 10d , 10d));
        System.out.println(notas.toString()); //Set e HashSet não respeitam ordem

        System.out.println("Contém 5.9d ? " + notas.contains(5.9d));
        System.out.println("Menor " + Collections.min(notas));
        System.out.println("Maior " + Collections.max(notas));

    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
        Double next = iterator.next();
        soma += next;
    }System.out.println("Soma é de: " + soma + "\n");


    Iterator<Double> iteratorMaiorQueSete = notas.iterator();
    while (iteratorMaiorQueSete.hasNext()) {
        Double next = iteratorMaiorQueSete.next();
        if(next >= 7){
            iteratorMaiorQueSete.remove();
        }
    }System.out.println("Somente menos que sete " + notas);
    }
}

