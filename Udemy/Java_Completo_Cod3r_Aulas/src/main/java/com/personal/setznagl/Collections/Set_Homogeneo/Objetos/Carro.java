package com.personal.setznagl.Collections.Set_Homogeneo.Objetos;

public class Carro extends Veiculo{
    public Carro(){
        //super() é chamado implicitamente, mas ignorado porque o this() foi definido
        //Chama o construtor com parâmetro boolean abaixo abaixo
        this(true);}
    private Carro(boolean construindoNaPropriaClasse){
        if (construindoNaPropriaClasse){
            this.modelo = "Sedã";
            this.placa = "E4B2E25";
            this.cor = "Verde";
            this.velocidade = 20;
        }
    }

    public Carro(String modeloParametro, String placaParametro, String corParametro, int velocidadeParametro){
        super(modeloParametro, placaParametro, corParametro, velocidadeParametro);
    }

    @Override
    public void acelerar(int deltaVelocidade) {

    }


    @Override
    public String toString() {
        return "Carro [" + modelo + " (placa) " + placa + " (cor) " + cor + ']';
    }
}
