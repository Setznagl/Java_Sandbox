package com.personal.setznagl.OO.Composicao_vs_Heranca.Componentes;

import lombok.Getter;

@Getter
//Usando final na classe ela fica inábil a ser herdada
public final class Porta {
    public boolean abertoOuFechado;

    public Porta(){
        this.abertoOuFechado = true;
    }

    public void abrirPorta(){ abertoOuFechado = true;
        System.out.println("Abriu uma porta!");}
    public void fecharPorta(){ abertoOuFechado = false;
        System.out.println("Fechou uma porta!");}

    @Override
    public String toString() {
        return "PortaAberta [" + abertoOuFechado + "] ";
    }
}
