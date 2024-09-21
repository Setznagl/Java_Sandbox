package com.personal.setznagl.OO.Composicao_vs_Heranca.Veiculo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
public abstract class Veiculo {
    private boolean ligadoOuDesligado;
    private String placa;
    private String modelo;
    private String cor;
    private int velocidadeAtual = 0;

    Veiculo(){

    }

    protected abstract void ligar();
    protected abstract void desligar();

}
