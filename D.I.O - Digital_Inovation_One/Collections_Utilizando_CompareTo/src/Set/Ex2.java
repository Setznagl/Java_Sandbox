package Set;

import lombok.Getter;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Set<linguagemFavorita> conjuntoLinguagens = new LinkedHashSet<linguagemFavorita>(){{
            add(new linguagemFavorita("Java" , 1995 , "InteliJ"));
            add(new linguagemFavorita("Kotlin" , 2011 , "InteliJ"));
            add(new linguagemFavorita("Javascript" , 1996 , "VScode"));
            add(new linguagemFavorita("Kotlin" , 2011 , "Eclipse"));
            add(new linguagemFavorita("Java" , 1995 , "VScode"));
            add(new linguagemFavorita("HTML" , 1989 , "VScode"));
            add(new linguagemFavorita("CSS" , 1995 , "VScode"));
            add(new linguagemFavorita("Java" , 1995 , "Eclipse"));
            add(new linguagemFavorita("Kotlin" , 2011 , "VScode"));
            add(new linguagemFavorita("Java" , 1995 , "Jetbeans"));
        }};
//        System.out.println(conjuntoLinguagens);

        List<linguagemFavorita> listaLinguagens = new ArrayList<>(conjuntoLinguagens);
        Collections.shuffle(listaLinguagens);
        listaLinguagens.sort(new comparatorNome()); System.out.println("---------Pelo nome---------\n" + listaLinguagens);
        listaLinguagens.sort(new comparatorIDE()); System.out.println("---------Por IDE---------\n" + listaLinguagens);
        listaLinguagens.sort(new comparatorAnoNome()); System.out.println("---------Por Ano e Nome---------\n" + listaLinguagens);
        listaLinguagens.sort(new comparatorAnoNomeIDEA()); System.out.println("---------Por Ano, Nome e IDEA---------\n" + listaLinguagens);
    }
}

@Getter class linguagemFavorita implements Comparable<linguagemFavorita> {
    private String nome;
    private int anoCriacao;
    private String IDE;
        public linguagemFavorita(String nome, int anoCriacao, String IDE) {
            this.nome = nome;
            this.anoCriacao = anoCriacao;
            this.IDE = IDE;
        }
    @Override
    public int compareTo(linguagemFavorita o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }

    @Override
    public String toString() {
        return '[' + nome + " (anoCriacao) " + anoCriacao + " (IDE) " + IDE + ']' + "\n";
    }
}

class comparatorNome implements Comparator<linguagemFavorita> {
    @Override
    public int compare(linguagemFavorita o1, linguagemFavorita o2) {
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}

class comparatorIDE implements Comparator<linguagemFavorita> {
    @Override
    public int compare(linguagemFavorita o1, linguagemFavorita o2) {
        return o1.getIDE().compareToIgnoreCase(o2.getIDE());
    }
}

class comparatorAnoNome implements Comparator<linguagemFavorita> {
    @Override
    public int compare(linguagemFavorita o1, linguagemFavorita o2) {
        if (Integer.compare(o1.getAnoCriacao(), o2.getAnoCriacao()) != 0) {
            return Integer.compare(o1.getAnoCriacao(), o2.getAnoCriacao());
        }
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}

class comparatorAnoNomeIDEA implements Comparator<linguagemFavorita> {
    @Override
    public int compare(linguagemFavorita o1, linguagemFavorita o2) {
        if (Integer.compare(o1.getAnoCriacao(), o2.getAnoCriacao()) != 0) {
            return Integer.compare(o1.getAnoCriacao(), o2.getAnoCriacao());
        }
        if (o1.getNome().compareToIgnoreCase(o2.getNome()) != 0) {
            return o1.getNome().compareToIgnoreCase(o2.getNome());
        }
        return o1.getIDE().compareToIgnoreCase(o2.getIDE());
    }
}
