package List;

import lombok.Getter;
import lombok.ToString;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Mes> semestre = new ArrayList<Mes>(){{
            add(new Mes("Janeiro" , 38));
            add(new Mes("Fevereiro" , 34));
            add(new Mes("Março" , 27));
            add(new Mes("Abril" , 22));
            add(new Mes("Maio" , 26));
            add(new Mes("Junho" , 20));
        }};

//        System.out.println("Min" + Collections.min(semestre));
//        System.out.println("Max" + Collections.max(semestre));
//        Collections.sort(semestre, new comparatorPeloNome());System.out.println(semestre);

        Iterator<Mes> iteratorMedia = semestre.iterator();
        Integer soma = 0;
        while (iteratorMedia.hasNext()){
            Mes mesNext = iteratorMedia.next();
            soma += mesNext.getValor();
        } Double mediaTemperatura = (double) (soma / semestre.size());
        System.out.println("A média de temperatura é de: " + mediaTemperatura);

        Iterator<Mes> IteratorAcimaDaMedia = semestre.iterator();
        while (IteratorAcimaDaMedia.hasNext()){
            Mes mesAcima = IteratorAcimaDaMedia.next();
            if (mesAcima.getValor() <= mediaTemperatura){
                IteratorAcimaDaMedia.remove();
            }
        }System.out.println(semestre);

    }
}

@Getter @ToString class Mes implements Comparable<Mes>{
    private final String nome;
    private final int valor;
    public Mes(String nome , int valor){
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public int compareTo(Mes o) {
        return Integer.compare(this.getValor() , o.getValor());
    }
}

class comparatorPeloNome implements Comparator<Mes>{
    public int compare(Mes o1, Mes o2) {
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}
