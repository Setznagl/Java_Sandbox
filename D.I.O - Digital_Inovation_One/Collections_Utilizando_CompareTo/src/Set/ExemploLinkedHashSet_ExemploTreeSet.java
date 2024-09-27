package Set;

import lombok.Getter;

import java.util.*;

public class ExemploLinkedHashSet_ExemploTreeSet {
    public static void main(String[] args) {
        Set<Double> notas = new LinkedHashSet<>(Arrays.asList(7d , 5.9d, 3.5d, 7.19d, 1.99d, 8.45, 10d , 10d , 10d , 10d));
        System.out.println(notas.toString()); //LinkedHashSet consegue lidar com ordem de inserção

        Set<Serie> series = new LinkedHashSet<Serie>(){{
            add(new Serie("GOT" , "Fantasia" , 60));
            add(new Serie("Arcane" , "Fantasia" , 50));
            add(new Serie("Rick And Morty" , "Ficcao" , 20));
            add(new Serie("Black Mirror" , "Critica" , 60));
            add(new Serie("Code Geass" , "Ficcao" , 20));
        }};System.out.println("\n");

        Set<Serie> seriesTreeByEpTime = new TreeSet<Serie>(series);
        //Não permite registros repetidos, se somente tempoEpisodio for implementado
        //no compareTo um registro 'tempoEpisodio: 60' será perdido
        System.out.println(seriesTreeByEpTime + "\n");

        Set<Serie> seriesTreeFullCompareRules = new TreeSet<Serie>(new comparatorNomeGeneroTempoEpisodio(){});
        seriesTreeFullCompareRules.addAll(series);
        System.out.println(seriesTreeFullCompareRules);
    }
}

@Getter class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;
        public Serie(String nome, String genero, Integer tempoEpisodio) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEpisodio = tempoEpisodio;
        }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie serie)) return false;

        return getNome().equals(serie.getNome()) && getGenero().equals(serie.getGenero()) && getTempoEpisodio().equals(serie.getTempoEpisodio());
    }

    @Override
    public int hashCode() {
        int result = getNome().hashCode();
        result = 31 * result + getGenero().hashCode();
        result = 31 * result + getTempoEpisodio().hashCode();
        return result;
    }

    @Override
    public int compareTo(Serie o) {
        return Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
    };

    @Override
    public String toString() {return "[" + nome + " (genero)" + genero + " (tempoEpisodio)" + tempoEpisodio + ']' + "\n";}
}

class comparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
    @Override public int compare(Serie o1, Serie o2) {
        int tempoEpisodio = Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        int genero = o1.getGenero().compareTo(o2.getGenero());
        if (genero != 0) return genero;

        return o1.getNome().compareTo(o2.getNome());
    }
}
