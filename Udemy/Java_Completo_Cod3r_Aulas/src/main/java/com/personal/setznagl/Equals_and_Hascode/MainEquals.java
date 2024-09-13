package com.personal.setznagl.Equals_and_Hascode;

import java.util.Date;

public class MainEquals {
    public static void main(String[] args) {
        // Criando duas datas para que os objetos tenham um atributo diferente
        long ms = 8523352L;
        Date date = new Date(ms);
        long ms2 = 9000059L; Date
        date2 = new Date(ms2);

        System.out.println("\n");

        Pessoa pessoa1 = new Pessoa("Gabriel" , 24 ,"58963235-2");
        Pessoa pessoa2 = new Pessoa("Rafaela" , 29 , "65852123-8");
        System.out.println("pessoa1.equals(pessoa1) ? " + pessoa1.equals(pessoa1));
        System.out.println("pessoa1.equals(pessoa2) ? " + pessoa1.equals(pessoa2));
        System.out.println( pessoa1 == pessoa1 ? "pessoa1 == pessoa1 ? true" : "pessoa1 == pessoa1 ? false");
        System.out.println( pessoa1 == pessoa2 ? "pessoa1 == pessoa2 ? true" : "pessoa1 == pessoa2 ? false");

        System.out.println("\n");

        Produto produto1 = new Produto("Caderno","886149449-E",date);
        Produto produto2 = new Produto("Caderno","886149449-E",date2);
        System.out.println("produto1.equals(produto1) ? " + produto1.equals(produto1));
        System.out.println("produto1.equals(produto2) ? " + produto1.equals(produto2));
        System.out.println( produto1 == produto1 ? "produto1 == produto1 ? true" : "produto1 == produto1 ? false");
        System.out.println( produto1 == produto2 ? "produto1 == produto2 ? true" : "produto1 == produto2 ? false");

        System.out.println("\nNote que o Equals() retorna true porque o sobreescrevemos com base em uma regra\n" +
                "personalizada, mas quando feito a comparação simples == retorna falso, afinal o endereço\n" +
                "de memória dos dois objetos não são de fato iguais. Para a pessoa faz mais sentido utilizar\n" +
                "o Equals() padrão, afinal uma pessoa nunca vai ser igual a outra, mas para demais tipos de\n" +
                "comparação pode vir bem a calhar ter a implementação personalizada\n");

        System.out.println("produto1.hashCode() " + produto1.hashCode());
        System.out.println("produto2.hashCode() " + produto2.hashCode());
        System.out.println("\nO hashCode() foi implementado" +
                " para considerar o tamanho do código de barras como qualificador para possíveis iguais");
        System.out.println("produto1.hashCode() == produto1.hashCode() " + (produto1.hashCode() == produto1.hashCode()));
        System.out.println("\nApós confirmar que pode ser igual se usa o equals() para confirmar se o produto1 " +
                "é igual ao produto2.");
        System.out.println("produto1.equals(produto2) ? " + produto1.equals(produto2));

    }
}
