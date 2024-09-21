package com.personal.setznagl.OO.Composicao_vs_Heranca.Componentes;

import lombok.Getter;

@Getter
public class Motor implements Combustao {
    private final TiposDeCombustivel Combustivel = TiposDeCombustivel.GASOLINA;

    @Override
    public int acelerandoAtravesDoMotor(TiposDeCombustivel combustivelParametro, int velocidadeAtualParametro) {
        if (velocidadeAtualParametro + 20 <= 200) {
            return (velocidadeAtualParametro + 20);
        }
        return velocidadeAtualParametro;
    }

    @Override
    public String toString() {
        return "[ Motor - Combustivel " + Combustivel + ']';
    }
}
