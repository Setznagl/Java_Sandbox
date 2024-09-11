package Exercicios_29_05_POO_Conceitos.ex_03;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    protected static List<Produto> Carrinho = new ArrayList<>();
    protected static double Subtotal;

    protected static void AdicionarProduto(Produto produtoRecebido){
        Carrinho.add(produtoRecebido);
    }
    protected static void exibirCarrinho() {
        for (Produto produtoDuranteLoop : Carrinho) {
            double iteracaoParaSubtotal = Produto.CalcularSubtotal(produtoDuranteLoop);
            Subtotal += iteracaoParaSubtotal;

            System.out.println(produtoDuranteLoop);
        }
        System.out.println("O Subtotal de todos os items é de: R$ " + Subtotal);
    }

}
