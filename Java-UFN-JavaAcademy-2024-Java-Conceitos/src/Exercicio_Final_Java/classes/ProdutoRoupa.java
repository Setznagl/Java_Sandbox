package Exercicio_Final_Java.classes;
import Exercicio_Final_Java.interfaces.ProdutoBase;

protected class ProdutoRoupa extends ProdutoBase {
    private String tamanho;
    private String cor;

    public ProdutoRoupa(){};
    public ProdutoRoupa(String nome, double preco, String tamanho, String cor, int quantidade){}

    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanhoParametro) {
        this.tamanho = tamanhoParametro;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String corParametro) {
        this.cor = corParametro;
    }
    @Override
    public String ExibirDetalhes(){
        return "a";
    }

}
