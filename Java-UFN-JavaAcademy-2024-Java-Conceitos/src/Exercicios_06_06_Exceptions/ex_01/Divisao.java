package Exercicios_06_06_Exceptions.ex_01;

class Divisao extends Operacao {

    public double calcular(double a, double b) {
        if (b == 0) {
            System.out.println("Seu segundo parametro foi alterado para 1, " +
                    "uma vez que não é convenção uma divisão por 0;");
            b = 1;
        }
        resultado = a / b;
        return resultado;
    }

    @Override
    public String toString() {
        return "Divisão{" + "resultado= " + resultado + '}';
    }
}
