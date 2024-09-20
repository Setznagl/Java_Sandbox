package com.personal.setznagl.Collections.Set_Homogeneo.Objetos;

public class Caminhao extends Veiculo{
    public Caminhao(){
       super();
    }

    @Override
    public void acelerar(int deltaVelocidade) {

    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
