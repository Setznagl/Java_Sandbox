package com.personal.setznagl.OO.Abstract_vs_Interface;

import lombok.Getter;
import lombok.Setter;

/** Uma classe abstrata é um meio termo entre uma classe concreta e uma interface,
 * Supondo que existam 10 métodos, ela pode implementar 5, os 10 ou ainda nenhum
 * Por isso é uma "Classe Inacabada" um molde que não está completamente implementado
 * e por isso uma classe Abstrata jamais poderá ser instanciada
 *-
 * Não receberemos nenhum aviso para implementar o método em "respirar()" porque a classe abstrata
 * de fato não tem obrigação de implementa-lo, somente será exigido da classe concreta para que ela possa
 * ser instanciada
*/
@Getter
@Setter
public abstract class AnimalAbstract implements SerVivoInterface {
    protected Boolean emMovimento;
    protected String nome;
    protected int idade;
    protected String deOndeEuVim;

    // apesar da classe abstrata não poder instanciar ela pode construir através do construtor
    AnimalAbstract(){

    }
    AnimalAbstract(String nome, int idade , Boolean emMovimento){
        this.nome = nome;
        this.idade = idade;
        this.emMovimento = emMovimento;
        this.deOndeEuVim = "Construtor classe abstrata Animal";
    }
    /**
     * Métodos abstratos não podem ter braços com lógica e devem ser obrigatoriamente sobrescritos.
     */
    public abstract void move();
}
