package com.personal.setznagl.Lambda.Interfaces_Funcionais_Nativas;

import com.personal.setznagl.Lambda.Interfaces_Funcionais_Nativas.Object.Produto;

import java.util.function.Consumer;

/**
 * Recebe um parâmetro e não possui retorno
 * Pode ser utilizada dentro de um 'Foreach'
 */
public class Lambda_Consumer {
    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto produto1 = new Produto("Caneta" , 1.99 , 0.1);

        imprimir.accept(produto1);
    }
}
