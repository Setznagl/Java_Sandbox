package com.personal.setznagl.Collections.Set_Homogeneo;

import com.personal.setznagl.Collections.Set_Homogeneo.Objetos.Carro;
import com.personal.setznagl.Collections.Set_Homogeneo.Objetos.Veiculo;

import java.util.HashSet;
import java.util.Set;

public class SetHomogeneoMain {
    public static void main(String[] args) {
        Set ConjuntoOrganizado = new HashSet();

        System.out.println("Digite os parâmetros para criar o carro:");
        Carro carro1 = new Carro();
        Veiculo carro2 = new Carro( "Sedã", "X5EV0" , "Azul" , 5);
        //carro1.placa    //Informa que não é possível acessar porque o atributo está como protected
        System.out.println("\n" + carro1 + "\n" + carro2);

    }
}
