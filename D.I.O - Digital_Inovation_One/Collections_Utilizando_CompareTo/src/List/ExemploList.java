package List;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> listaNotaVariavel = new ArrayList<Double>();listaNotaVariavel.add(7d);listaNotaVariavel.add(2.8d);listaNotaVariavel.add(3.75d);listaNotaVariavel.add(4.85d);listaNotaVariavel.add(5.9d);listaNotaVariavel.add(6.87d);
        List<Double> listaNotaFixa = Arrays.asList(7d, 2.8d, 3.75d, 4.85d, 5.9d, 6.87d);
        //listaNotaFixa.add(4d); //UnsupportedOperationException
        listaNotaVariavel.add(5, 9.85);
        listaNotaVariavel.set(3, 8.6);


        System.out.println("Lista Variável: " + listaNotaVariavel);
        System.out.println("Lista Fixa" + listaNotaFixa + "\n");
        System.out.println("Menor nota Lista Variável " + Collections.min(listaNotaVariavel)
                + " , Menor nota Lista Fixa " + Collections.min(listaNotaFixa) + "\n");


        Iterator<Double> iterator = listaNotaVariavel.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next(); soma += next;
        }
        System.out.println("Soma Lista Variável: " + soma);
        System.out.println("Média em Lista Variável é: " + soma / listaNotaVariavel.size());


        Iterator<Double> iteratorRemove = listaNotaVariavel.iterator();
        while (iteratorRemove.hasNext()) {
            Double next = iteratorRemove.next();
            if (next < 7) { iteratorRemove.remove();}
        }System.out.println("<7 em Lista Variável: " + listaNotaVariavel);

    }
}

