package Exercicios_06_06_Sobrescrita_e_Sobrecarga.ex_01;

class Divisao extends Operacao{

    public double calcular(double a, double b) {
        resultado = a / b;
        return resultado;
    }

    @Override
    public String toString() {
        return "Divisão{" + "resultado= " + resultado + '}';
    }
}
