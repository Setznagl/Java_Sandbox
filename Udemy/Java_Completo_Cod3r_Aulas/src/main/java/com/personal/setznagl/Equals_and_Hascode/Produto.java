package com.personal.setznagl.Equals_and_Hascode;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
class Produto {
    private String nome;
    private String codigoDeBarras;
    private Date dataDeFabricacao;

        Produto(String nomeParametro, String codigoDeBarrasParametro, Date dataDeFabricacaoParametro) {
            nome = nomeParametro;
            codigoDeBarras = codigoDeBarrasParametro;
            dataDeFabricacao = dataDeFabricacaoParametro;
        }
    /* Implementa uma comparação customizada para objetos, ao invés de ponteiro de endereço de memória
    irá retornar verdadeiro com base em nossas regras definidas*/

    /* Para ser verdadeiro aqui o nome e código de barras devem ser iguais */
    @Override
    public boolean equals(Object parameter) {
        if (this == parameter) return true;
        if (!(parameter instanceof Produto produto)) return false;
        return Objects.equals(getNome(), produto.getNome()) && Objects.equals(getCodigoDeBarras(), produto.getCodigoDeBarras());
    }

    /* Para verificação rápida em massa será utilizado o código de barras como qualificador */
    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoDeBarras().length());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigoDeBarras='" + codigoDeBarras + '\'' +
                ", dataDeFabricacao=" + dataDeFabricacao +
                '}';
    }
}
