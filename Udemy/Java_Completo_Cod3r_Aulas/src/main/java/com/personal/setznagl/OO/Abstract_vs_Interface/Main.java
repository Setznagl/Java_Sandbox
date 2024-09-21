package com.personal.setznagl.OO.Abstract_vs_Interface;

public class Main {
    public static void main(String[] args) {

        GatoClass Astolfo = new GatoClass();
        GatoClass Medeia = new GatoClass("Medeia" , 5 , false);

    /** Animal é a generalização do Gato, então não tem problema instanciar assim desde que o new não seja Animal,
    afinal classes abstratas não podem ser instanciadas */
        AnimalAbstract Lilith = new GatoClass("Lilith" , 3 , true);

        System.out.println(Astolfo);
        System.out.println(Medeia);
        System.out.println(Lilith);
        System.out.println(Medeia.ver(Medeia));
        System.out.println("Acessado pela instancia " + Medeia.getValorTeste());
        System.out.println("Acessado pela interface " + SerVivoInterface.valorTeste);

        //Ao descomentar o código informa que a classe é a abstrata e não pode ser instanciada
        //Animal Bob = new Animal();
    }
}
