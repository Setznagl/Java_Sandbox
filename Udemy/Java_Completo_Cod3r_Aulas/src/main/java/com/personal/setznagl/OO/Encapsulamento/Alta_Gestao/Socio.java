package com.personal.setznagl.OO.Encapsulamento.Alta_Gestao;

import com.personal.setznagl.OO.Encapsulamento.Funcionario;
import com.personal.setznagl.OO.Encapsulamento.Gestao.Gestor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Socio extends Funcionario {
        public Socio(){this.nome = "Dalaghar Petrovitch";}

    public String KPI_Investidores = "Aumentar o valor das ações em 15% no próximo trimestre.";
    private String problemasPessoaisSocio = "Está próximo de se divorciar.";
    public Gestor GestorSubalterno;

    @Override
    public String toString() {
        return " Socio [\n" +
                " nome " + nome + "\n" +
                " KPI_Investidores " + KPI_Investidores + "\n" +
                " problemasPessoaisSocio " + problemasPessoaisSocio + "\n" +
                " GestorSubalterno  " + GestorSubalterno + "\n" + ']';
    }

}
