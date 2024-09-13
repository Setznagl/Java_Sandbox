package Exercicios_06_06_Exceptions.ex_01;

import java.util.InputMismatchException;

class Soma extends Operacao {

    public double calcular(double a, double b) {
        resultado = a + b;
        return resultado;
    }

    @Override
    public String toString() {
        return "Soma{" + "resultado= " + resultado + '}';
    }
}
