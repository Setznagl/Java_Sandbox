package Exercicios_06_06_Sobrescrita_e_Sobrecarga.ex_01;
import java.util.Scanner;

abstract class Operacao {
    Scanner lerDados = new Scanner(System.in);
    protected double a;
    protected double b;
    protected double resultado;

    public double calcular() {
        return resultado;
    }
    public double calcular(double a, double b) {return resultado;};

    protected Operacao(){
        a = lerDados.nextDouble();
        b = lerDados.nextDouble();
    }
}
