package Exercicios_06_06_Sobrescrita_e_Sobrecarga.ex_01;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Cadastre dois números, estes serão utilizados para soma, substração, " +
                "multiplicação e divisão respectivamente nas linhas abaixo!");
        Operacao operacao001 = new Soma();
        operacao001.calcular(operacao001.a,operacao001.b);
        System.out.println(operacao001);

        Operacao operacao002 = new Subtracao();
        operacao002.calcular(operacao002.a,operacao002.b);
        System.out.println(operacao002);

        Operacao operacao003 = new Multiplicacao();
        operacao003.calcular(operacao003.a,operacao003.b);
        System.out.println(operacao003);


        Operacao operacao004 = new Divisao();
        operacao004.calcular(operacao004.a,operacao004.b);
        System.out.println(operacao004);
    }
}
