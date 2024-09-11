package Exercicio_Final_Java.interfaces;

public interface Produto {
    // Getters
    public String getTipo();
    public String getNome();
    public double getPreco();
    public int getQuantidade();

    // Setters
    public void setNome(String nome);
    public void setPreco(double preco);
    public void setQtde(int qtde);

    public String exibirDetalhes();

}
