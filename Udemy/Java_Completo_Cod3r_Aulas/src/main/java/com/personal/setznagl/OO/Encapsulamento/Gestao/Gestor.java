package com.personal.setznagl.OO.Encapsulamento.Gestao;

import com.personal.setznagl.OO.Encapsulamento.Funcionario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Gestor extends Funcionario {
        public Gestor(){this.nome = "Marcos Figueiredo";}

    public String KPIsDaGestao = " Reduzir as faltas da equipe, Aumentar a produtividade em 35% ";
    private String problemasPessoaisGestor = " Possui ansiedade e toma medicações fortes. ";

    @Override
    public String toString() {
        return "Gestor[ " + " nome " + nome + " KPIsDaGestao " + KPIsDaGestao + " problemasPessoaisGestor "
                + problemasPessoaisGestor + ']';
    }

}
