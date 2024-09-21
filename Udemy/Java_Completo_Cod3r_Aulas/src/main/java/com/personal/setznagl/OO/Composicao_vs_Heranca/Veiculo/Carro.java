package com.personal.setznagl.OO.Composicao_vs_Heranca.Veiculo;

import com.personal.setznagl.OO.Composicao_vs_Heranca.Componentes.Motor;
import com.personal.setznagl.OO.Composicao_vs_Heranca.Componentes.Porta;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter(AccessLevel.PUBLIC)
@Setter
/**
 * Carro herda de 'Veiculo' 'Carro (É UM) Veiculo'
 * Motor e Porta são Componentes de carro 'Carro (TEM UM) Motor' , 'Carro (TEM UMA) Porta'
*/
public class Carro extends Veiculo {
    /* --- Para burlar possiveis acessos indevidos devido a herança os atributos são private
       --- em ambos e são acessados na classe filha através do super.getAtributo()        */
    private boolean ligadoOuDesligado = super.isLigadoOuDesligado();
    private String placa = super.getPlaca();
    private String modelo = super.getModelo();
    private String cor = super.getCor();
    private int velocidadeAtual = 0;

    private final Motor MeuMotor = new Motor();
    private final Porta[] Portas = new Porta[4];

    public Carro() {
        Portas[0] = new Porta();
        Portas[1] = new Porta();
        Portas[2] = new Porta();
        Portas[3] = new Porta();
        this.setLigadoOuDesligado(false);
        this.setPlaca("#H5E02C");
        this.setModelo("Fiat Mobi");
        this.setCor("Azul");
        this.setVelocidadeAtual(0);
    }

    public void acelerar() {
        if (ligadoOuDesligado) {
            int velocidadeAtualParametro = this.velocidadeAtual;
            this.velocidadeAtual = MeuMotor.acelerandoAtravesDoMotor(this.MeuMotor.getCombustivel(), velocidadeAtualParametro);
        } else {
            throw new RuntimeException("Não é possível acelerar um carro desligado!");
        }
    }

    @Override
    public void ligar() {
        int contadorPortasFechadas = 0;
        for (Porta p : Portas) {
            if (!p.abertoOuFechado) {
                contadorPortasFechadas++;
            }
        }
        if (contadorPortasFechadas == 4) {
            setLigadoOuDesligado(true);
        } else {
            throw new RuntimeException("Você não pode ligar o carro sem fechar as portas!");
        }
    }

    @Override
    public void desligar() {
        setLigadoOuDesligado(false);
    }

    Carro(String placaParametro, String modeloParametro, String corParametro, int VelocidadeAtualParametro) {
        this.setPlaca(placaParametro);
        this.setModelo(modeloParametro);
        this.setCor(corParametro);
        this.setVelocidadeAtual(VelocidadeAtualParametro);
    }

    @Override
    public String toString() {
        return "Carro [" + MeuMotor + "] [" + Arrays.toString(Portas) + "] ( ligadoOuDesligado ) " + ligadoOuDesligado +
                " ( placa ) " + placa + " ( modelo ) " + modelo + " ( cor ) " + cor + " ( velocidadeAtual ) "
                + velocidadeAtual + ']';
    }
}
