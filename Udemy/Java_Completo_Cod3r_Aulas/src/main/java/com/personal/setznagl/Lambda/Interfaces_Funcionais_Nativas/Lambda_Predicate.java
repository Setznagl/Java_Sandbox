package com.personal.setznagl.Lambda.Interfaces_Funcionais_Nativas;

import com.personal.setznagl.Lambda.Interfaces_Funcionais_Nativas.Object.Produto;

import java.util.function.Predicate;

/**
 * Define um parâmetro e recebe um parâmetro.
 * Retorna um boolean
 */
public class Lambda_Predicate {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook T14" , 3869.99 , 0.15);

        Predicate<Produto> isExpensive = (produtoParametro -> {
            return (produtoParametro.preco *(1 - produtoParametro.desconto))  >= 750.0;
        });

        System.out.println(isExpensive.test(produto1));
    }

}
