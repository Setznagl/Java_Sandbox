package Exercicios_03_06_Heranca.ex_02;

class SerHumano extends Animal {
    String nome;
    int idade;
    protected String falar(){
        return "Nem todos falam";
    }
}
