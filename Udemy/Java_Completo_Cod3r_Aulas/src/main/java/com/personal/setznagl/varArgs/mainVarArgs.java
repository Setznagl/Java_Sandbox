package com.personal.setznagl.varArgs;

public class mainVarArgs {
    public static void main(String[] args) {
        Peixe peixe1 = new Peixe("Carpa" , 2.6);
        Peixe peixe2 = new Peixe("Tilápia" , 1.2);

        printarPeixe(peixe1 , peixe2);
    }

    /* Ao invés de receber somente um valor passa a receber vários valores
    ,transforma-los em array e iterar conforme na quantidade recebida*/
    public static void printarPeixe(Peixe... peixes){
        for (Peixe peixe : peixes) {
            System.out.println("O peixe é " + peixe.nome + " e pesa: " + peixe.peso);
        }
    }
}
