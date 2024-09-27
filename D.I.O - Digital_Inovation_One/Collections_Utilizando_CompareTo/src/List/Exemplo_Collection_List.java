package List;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exemplo_Collection_List {
    public static void main(String[] args) {
        List<Gato> listaGatos = new ArrayList<Gato>(){{
            add(new Gato("Lilith" , 3 , "Pelagem Mista"));
            add(new Gato("Eris" , 1 , "Branca"));
            add(new Gato("Medeia" , 5 , "Preta"));
            add(new Gato("Medeia" , 2 , "Preta"));
            add(new Gato("Dakota" , 5 , "Branco"));
            add(new Gato("Chico" , 7 , "Branco"));
        }};
//        Collections.shuffle(listaGatos); System.out.println(listaGatos); //Bagunça a lista
//        Collections.sort(listaGatos); System.out.println(listaGatos); //Organiza em ordem alfabética

//        Passando a classe comparadora como parâmetro para o sort
//        Collections.sort(listaGatos, new ComparatorIdade()); System.out.println(listaGatos);

//        Passando comparador Medeia First para parâmetro para o sort e embaralhando com shuffle para teste
//        Collections.shuffle(listaGatos); System.out.println(listaGatos);
//        Collections.sort(listaGatos, new ComparatorMedeiaFirst()); System.out.println(listaGatos);

//        Comparando por ordem alfabética através da cor do gato
//        Collections.sort(listaGatos, new comparatorCor()); System.out.println(listaGatos);

//        Comparando por nome, cor e por fim idade
//        Collections.sort(listaGatos, new comparatorNomeCorIdade(){}); System.out.println(listaGatos);


    }
}
@Getter @Setter class Gato implements Comparable<Gato>{
    private String nome;
    private int idade;
    private String cor;
    Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    @Override
    public String toString() {
        return '[' + nome + " (idade)= " + idade + " (cor)= " + cor + ']' + "\n";
    }

    @Override
    public int compareTo(Gato outroGato) {
        return this.getNome().compareToIgnoreCase(outroGato.getNome());
    }
}

// É um COMPARADOR e não um COMPARÁVEL, essa classe define um critério de comparação
class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class ComparatorMedeiaFirst implements Comparator<Gato>{
    @Override
    public int compare(Gato o1, Gato o2) {
        if(o1.getNome().equals("Medeia")){
            return -1;
        }
        if(o1.getNome().equals(o2.getNome())){
            return 0;
        }
        else return 1;
    }
}

class comparatorCor implements Comparator<Gato>{
    public int compare(Gato o1, Gato o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}

class comparatorNomeCorIdade implements Comparator<Gato>{
    public int compare(Gato o1, Gato o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if(nome != 0){return nome;}

        int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
        if(cor != 0){return cor;};

        int idade = Integer.compare(o1.getIdade(), o2.getIdade());
        if(idade != 0){return idade;}

        return 0;
    }
}

