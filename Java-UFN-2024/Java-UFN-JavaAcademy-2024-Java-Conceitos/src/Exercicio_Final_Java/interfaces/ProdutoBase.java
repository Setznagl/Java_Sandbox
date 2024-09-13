package Exercicio_Final_Java.interfaces;

public abstract class ProdutoBase implements Produto {
    private String nome;
    private String preco;
    private int qtd;

    @Override
    public String getTipo() {
        return "";
    }

    ;

    @Override
    public String getNome() {
        return "";
    }

    ;

    @Override
    public double getPreco() {
        return 0;
    }

    ;

    @Override
    public int getQuantidade() {
        return 0;
    }

    ;

    @Override
    public void setNome(String nome) {
    }

    ;

    @Override
    public void setPreco(double preco) {
    }

    ;

    @Override
    public void setQtde(int qtde) {
    }

    ;

    @Override
    public abstract String exibirDetalhes();
}
