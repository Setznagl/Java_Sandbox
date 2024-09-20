package com.personal.setznagl.Collections.Set_Homogeneo.Objetos;

import com.personal.setznagl.Collections.Set_Homogeneo.Motorizado;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public abstract class Veiculo implements Motorizado {
    protected String placa;
    protected String modelo;
    protected String cor;
    protected Integer velocidade;
    private final Scanner input = new Scanner(System.in);

    public Veiculo() {
        this.modelo = input.nextLine();
        this.placa = input.nextLine();
        this.cor = input.nextLine();
        this.velocidade = input.nextInt();
    }

    public Veiculo(String modeloParametro, String placaParametro, String corParametro, int velocidadeParametro) {
        this.placa = placaParametro;
        this.modelo = modeloParametro;
        this.cor = corParametro;
        this.velocidade = velocidadeParametro;
    }

}
