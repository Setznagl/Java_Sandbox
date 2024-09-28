package Set;

import lombok.Getter;
import lombok.ToString;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Set<cores> conjuntoCores = new LinkedHashSet<>(){{
            add(new cores("Vermelho"));
            add(new cores("Laranja"));
            add(new cores("Amarelo"));
            add(new cores("Verde"));
            add(new cores("Azul"));
            add(new cores("Índigo"));
            add(new cores("Violeta"));
        }};
        for (cores cor : conjuntoCores) {System.out.println(cor);}
        System.out.println("Tamanho: " + conjuntoCores.size());


        List<cores> listaOrdenada = new ArrayList<>(conjuntoCores);
        listaOrdenada.sort(new compareByColor());System.out.println(listaOrdenada);
        listaOrdenada.sort(new compareByColor().reversed());System.out.println(listaOrdenada + "\n");

        Iterator<cores> somenteV = listaOrdenada.iterator();
        while (somenteV.hasNext()) {
            cores c = somenteV.next();
            if (!(c.getNome().charAt(0) == 'V')){
                somenteV.remove();
            }
        }System.out.println(listaOrdenada);

        listaOrdenada.clear();
        System.out.println("A lista está vazia? : " + listaOrdenada.isEmpty());
    }
}

@Getter @ToString
class cores implements Comparable<cores>{
    private final String nome;
        public cores(String nome){
            this.nome = nome;
        }

    @Override
    public int compareTo(cores o) {
        return this.nome.compareToIgnoreCase(o.getNome());
    }
}

class compareByColor implements Comparator<cores>{
    @Override
    public int compare(cores o1, cores o2) {
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}