package Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("gol", 13.8); //substitui o valor
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
            put("uno", 15.6);
        }};
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);
//        System.out.println(carrosPopulares);
//        System.out.println("Contém 'tucson' ? " + carrosPopulares.containsKey("tucson\n"));
//
//        System.out.println("'Set' com os modelos " + carrosPopulares.keySet());
//        System.out.println("'Set' com os consumos " + carrosPopulares.values() + "\n");

        /*Iterando for sobre chaves e valores para capturar dados*/

//        String modeloMaisEficiente = "";
//        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
//        Set<Map.Entry<String , Double>> entries = carrosPopulares.entrySet();
//        for (Map.Entry<String , Double> entry : entries) {
//            if (entry.getValue().equals(consumoMaisEficiente)) {
//                modeloMaisEficiente = entry.getKey();
//            }
//        }System.out.println("Modelo mais eficiente " + modeloMaisEficiente + " com consumo " + consumoMaisEficiente);
//
//
//        String modeloMenosEficiente = "";
//        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
//        for (Map.Entry<String , Double> entry : entries) {
//            if (entry.getValue().equals(consumoMenosEficiente)) {
//                modeloMenosEficiente = entry.getKey();
//            }
//        }System.out.println("Modelo menos eficiente " + modeloMenosEficiente + " com consumo " + consumoMenosEficiente);
//
//        Iterator<Double> iterator = carrosPopulares.values().iterator(); //retorno de values é um 'collection'
//        Double soma = 0d;
//        while (iterator.hasNext()) {
//            soma += iterator.next();
//        }System.out.println("A soma dos consumos é " + soma);System.out.println("A média é de: " + (soma / carrosPopulares.size()) );
//
//
//        Iterator<Double> iteratorRemove = carrosPopulares.values().iterator();
//        while (iteratorRemove.hasNext()) {
//            if (iteratorRemove.next().equals(15.6)) {
//                iteratorRemove.remove();
//            }
//        }System.out.println(carrosPopulares);System.out.println("Organizado por treeMap" + carrosPopulares2);


        Map<String , Livro> meusLivros = new HashMap<>(){{
            put("Duhigg, Charles" , new Livro("O Poder do Hábito" , 408));
            put("Hawking, Stephen" , new Livro("Uma Breve História do Tempo" , 256));
            put("Dostoievski, Fiodor" , new Livro("Crime e Castigo" , 240));
            put("Platão" , new Livro("A República" , 467));
        }};for(Map.Entry<String , Livro> livro:meusLivros.entrySet())System.out.println(livro.getKey() + " - " + livro.getValue());

            System.out.println("\n");

        Map<String , Livro> meusLivrosOrdenadosPorInsercao = new LinkedHashMap<String, Livro>(){{
            putAll(meusLivros);
        }};System.out.println(meusLivrosOrdenadosPorInsercao);

            System.out.println("\n");

        Map<String , Livro> meusLivrosOrdenadosPorOrdemAlfabeticaAutores = new TreeMap<String, Livro>(meusLivrosOrdenadosPorInsercao);
        System.out.println(meusLivrosOrdenadosPorOrdemAlfabeticaAutores);

            System.out.println("\n");

        Set<Map.Entry<String , Livro>> meusLivrosOrdenadosPorOrdemAlfabeticaLivros = new TreeSet<>(new comparatorNomeLivro());
        meusLivrosOrdenadosPorOrdemAlfabeticaLivros.addAll(meusLivrosOrdenadosPorInsercao.entrySet());
        System.out.println(meusLivrosOrdenadosPorOrdemAlfabeticaLivros);

            System.out.println("\n");

        Set<Map.Entry<String , Livro>> meusLivrosOrdenadosPorQtdPaginas = new TreeSet<>(new comparatorQtdPaginas());
        meusLivrosOrdenadosPorQtdPaginas.addAll(meusLivrosOrdenadosPorInsercao.entrySet());
        System.out.println(meusLivrosOrdenadosPorQtdPaginas);
    }
}

@Getter @ToString @EqualsAndHashCode
class Livro {
    private String nome;
    private Integer qtdPaginas;
    public Livro(String nome, Integer qtdPaginas) {
        this.nome = nome;
        this.qtdPaginas = qtdPaginas;
    }
}

class comparatorNomeLivro implements Comparator<Map.Entry<String , Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class comparatorQtdPaginas implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return Integer.compare(o1.getValue().getQtdPaginas().intValue(), o2.getValue().getQtdPaginas().intValue());
    }
}