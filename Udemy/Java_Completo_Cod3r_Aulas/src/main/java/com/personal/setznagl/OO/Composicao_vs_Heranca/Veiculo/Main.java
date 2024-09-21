package com.personal.setznagl.OO.Composicao_vs_Heranca.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo carro01 = new Carro();
        //carro01.modelo = "Corola";
        carro01.setModelo("Fiat Mobi");
        System.out.println(carro01);

        Carro carro02 = new Carro();
        carro02.setModelo("Jeep Renegade");
        System.out.println(carro02);

        //carro01.acelerar(); //'Veiculo' não possue acelerar(), quem possue é a classe concreta 'Carro'

        for (int i = 0; i < carro02.getPortas().length; i++) {
            carro02.getPortas()[i].fecharPorta();
        }
        carro02.ligar(); //definimos que para ligar somente com as portas fechadas
        System.out.println("O carro ligou? " + carro02.isLigadoOuDesligado());
        for (int i = 0; i < 30; i++) {
            carro02.acelerar();
        }
        System.out.println("Velocidade Atual: " + carro02.getVelocidadeAtual());
    }
}
