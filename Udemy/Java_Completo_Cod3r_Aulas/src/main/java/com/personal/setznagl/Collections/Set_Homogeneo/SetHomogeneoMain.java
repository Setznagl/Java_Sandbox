package com.personal.setznagl.Collections.Set_Homogeneo;

import com.personal.setznagl.Collections.Set_Homogeneo.Objetos.Caminhao;
import com.personal.setznagl.Collections.Set_Homogeneo.Objetos.Carro;
import com.personal.setznagl.Collections.Set_Homogeneo.Objetos.Veiculo;

import java.util.HashSet;
import java.util.Set;

public class SetHomogeneoMain {
    public static void main(String[] args) {
        Set<Veiculo> ConjuntoOrganizado = new HashSet<>();

        System.out.println("Digite os parâmetros para criar o caminhão:");
        Caminhao caminhao1 = new Caminhao();

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        ConjuntoOrganizado.add(carro1);
        ConjuntoOrganizado.add(carro2);
        ConjuntoOrganizado.add(caminhao1);
        System.out.println("Set<Veiculo> " + ConjuntoOrganizado + "\n");


        Set<Carro> ConjuntoOrganizadoSomenteCarros = new HashSet<>();
        ConjuntoOrganizadoSomenteCarros.add(carro1);
        ConjuntoOrganizadoSomenteCarros.add(carro2);
        //ConjuntoOrganizadoSomenteCarros.add(caminhao1); //Não permite inserção porque o tipo requerido difere
        System.out.println("Set<Carro> " + ConjuntoOrganizadoSomenteCarros);
    }
}
