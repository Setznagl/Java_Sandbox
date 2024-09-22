package com.personal.setznagl.Lambda.Interfaces_Funcionais_Nativas;

import com.personal.setznagl.Lambda.Interfaces_Funcionais_Nativas.Object.Produto;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio_Lambda {
    public static void main(String[] args) {
        Produto produtoDesafio = new Produto("Motorola Edge 20" , 2199.99 , 0.1);
        /*
         * 1 - A partir do produto calcular o preco real (com desconto)
         * 2 - Imposto municipal >= 2500 (8,5%)
         * 3 - Arredondar para duas casas decimais
         * 4 - Formatar R$0000,00
         */
        BinaryOperator<Double> precoComDesconto = (precoBase , descontoBase) -> {
            return precoBase * ( 1 - descontoBase );};
        UnaryOperator<Double> aplicarImpostoMunicipal = (precoComDescontoBase) -> {
            if(precoComDescontoBase >= 2500){ return precoComDescontoBase * 1.085;
            }return precoComDescontoBase;};
        UnaryOperator<Double> arredondar = (precoFinal) -> {
            DecimalFormat df = new DecimalFormat("#.##");
            return Double.valueOf(df.format(precoFinal));};
        Function<Double , String> formatarEmMoeda = (precoFinalFormatado) -> "R$"+precoFinalFormatado;

        System.out.println(precoComDesconto.andThen(aplicarImpostoMunicipal)
                .andThen(arredondar).andThen(formatarEmMoeda)
                .apply(produtoDesafio.preco , produtoDesafio.desconto));
    }
}
