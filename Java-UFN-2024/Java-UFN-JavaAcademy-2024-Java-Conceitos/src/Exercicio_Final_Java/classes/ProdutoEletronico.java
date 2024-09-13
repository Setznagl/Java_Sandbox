package Exercicio_Final_Java.classes;
import Exercicio_Final_Java.interfaces.ProdutoBase;

protected class Eletronico extends ProdutoBase {
    private int garantiaMeses;
    public Eletronico(){};
    public Eletronico(String nome, double preco, int garantiaMeses, int quantidade){}

    public int getGarantiaMeses(){
        return garantiaMeses;
    };
    public void setGarantiaMeses(int garantiaMesesParametro){
        this.garantiaMeses = garantiaMesesParametro;
    };


    @Override
    public String exibirDetalhes() {
        return "";
    }
    @Override
    public String getTipo(){
        return "Eletronico";
    }
}
