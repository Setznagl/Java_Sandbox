package Exercicios_29_05_POO_Conceitos.ex_01;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    protected static List<Livro> Estante = new ArrayList<>();

    protected static void AdicionarLivro(Livro livroRecebido){
        Estante.add(livroRecebido);
    }
    protected static void exibirLivros() {
        for (Livro livroDuranteLoop : Estante) {
            System.out.println(livroDuranteLoop);
        }
    }
}
