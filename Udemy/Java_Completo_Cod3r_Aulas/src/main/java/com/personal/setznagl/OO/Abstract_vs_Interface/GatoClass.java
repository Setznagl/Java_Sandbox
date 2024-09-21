package com.personal.setznagl.OO.Abstract_vs_Interface;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GatoClass extends AnimalAbstract {
    /**
     * A classe Animal envia por herança os atributos, então eles podem ser acessados diretamente
     * em tempo de execução, oque é muito ruim, para lidar com isso definimos os atributos locais privados
     * referenciamos o valor inicial como o getValor() dos atributos protected da classe abstrata
     */
    private Boolean emMovimento = super.getEmMovimento();
    private String nome = super.getNome();
    private int idade = super.getIdade();
    private String deOndeEuVim = super.getDeOndeEuVim();

    GatoClass() {
        super("Nome Padrão de Animal - Astolfo", 10, false);
    }

    GatoClass(String nomeParametro, int idadeParametro, boolean emMovimentoParametro) {
        //this(); Através do this() um construtor pode referenciar outro desde que a chamada não seja recursiva
        this.emMovimento = emMovimentoParametro;
        this.nome = nomeParametro;
        this.idade = idadeParametro;
        this.deOndeEuVim = "Construtor classe Gato";
    }

    @Override
    public void move() {
        System.out.println("O gato de movimenta com suas patas!");
    }

    @Override
    public String respirar() {
        return "O gato respira inalando oxigênio!";
    }

    @Override
    public String toString() {
        return "[ " + nome +
                " ( idade ) = " + idade +
                " ( em Movimento ) = " + emMovimento +
                " ( de Onde Esse Gato Veio? ) = " + deOndeEuVim + '\'' +
                ']';
    }

    //O gato também possui o método "ver()", que veio da interface
}
