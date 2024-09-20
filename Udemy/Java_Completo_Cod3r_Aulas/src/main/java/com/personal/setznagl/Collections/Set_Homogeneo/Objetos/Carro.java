package com.personal.setznagl.Collections.Set_Homogeneo.Objetos;

public class Carro extends Veiculo{
    public Carro(){
        super();
    }

    @Override
    public void acelerar(int deltaVelocidade) {

    }


    @Override
    public String toString() {
        return "Carro [" + modelo + " ( placa ) " + placa + " ( cor ) " + cor +  ']';
    }
}
