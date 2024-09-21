package com.personal.setznagl.Collections.Set_Homogeneo.Objetos;

public class Caminhao extends Veiculo{
    public Caminhao(){
       //super() é chamado implicitamente a menos que seja sobrescrito por outro super( outro ) ou this()
       super(true);
    }

    @Override
    public void acelerar(int deltaVelocidade) {

    }

    @Override
    public String toString() {
        return  "Caminhao [" + modelo + " (placa) " + placa + " (cor) " + cor + ']';
    }
}
