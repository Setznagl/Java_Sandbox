package com.personal.setznagl.Lambda.Com_Interfaces_Funcionais.ExemploComLambda;

public class Main {
    public static void main(String[] args) {
        /**
         * Interfaces funcionais não possuem o corpo de seus métodos implementado.
         * Elas declaram apenas a assinatura do método (parâmetros e tipo de retorno).
         * Usando expressões lambda, podemos atribuir a uma variável uma implementação
         * específica do método da interface, que será executada com a lógica fornecida.
         * Não é necessário que essa lógica seja vinculada ou sobrescrita em uma classe.
         */
        Calculo soma = (x1 , x2) -> { return x1 + x2; };
        Calculo multiplicar = (x1 , x2) -> { return x1 * x2; };

        System.out.println(soma.executar(5 , 6));
        System.out.println(multiplicar.executar(5 , 6));

        System.out.println(Calculo.confirmacao());
        //System.out.println(multiplicar.confirmacao());  //não pode ser acessado pela instancia, somente pela classe

        //System.out.println(Calculo.validacao()); //contexto de instancia, não pode ser referenciado pela classe
        System.out.println(soma.validacao());

    }
}
