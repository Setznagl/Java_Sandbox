package Exercicios_06_06_Sobrescrita_e_Sobrecarga.ex_01;

class Multiplicacao extends Operacao{

    public double calcular(double a, double b) {
        resultado = a * b;
        return resultado;
    }

    @Override
    public String toString() {
        return "Multiplicação{" + "resultado= " + resultado + '}';
    }
}
