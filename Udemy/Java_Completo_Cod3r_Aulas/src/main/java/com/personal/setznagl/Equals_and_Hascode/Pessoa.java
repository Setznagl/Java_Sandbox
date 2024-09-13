package com.personal.setznagl.Equals_and_Hascode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    private String nome;
    private int idade;
    private String RG;

        Pessoa(String nomeParametro, int idadeParametro, String RG_Parametro) {
            this.nome = nomeParametro;
            this.idade = idadeParametro;
            this.RG = RG_Parametro;
        }

    /* Como não possui Equals e Hashcode sobrescritos a comparação se a instancia é igual ou não
    será feita da mesma forma que "==" comparando o endereço de memória entre os dois objetos */

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", RG='" + RG + '\'' +
                '}';
    }


}
