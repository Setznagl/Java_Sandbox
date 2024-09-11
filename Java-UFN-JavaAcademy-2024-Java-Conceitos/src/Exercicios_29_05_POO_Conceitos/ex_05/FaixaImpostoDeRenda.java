package Exercicios_29_05_POO_Conceitos.ex_05;

public class FaixaImpostoDeRenda {

    public static int CalcularFaixa(Pessoa pessoaParametro){
        double salarioParaAnalise = pessoaParametro.getSalarioPessoa();
        int faixa = 0;

        if (salarioParaAnalise <= 2112) {
            faixa = 1;
        } else if (salarioParaAnalise > 2112 && salarioParaAnalise <= 2826.66 ) {
            faixa = 2;
        } else if (salarioParaAnalise > 2826.66 && salarioParaAnalise <= 3751.06 ) {
            faixa = 3;
        } else if (salarioParaAnalise > 3751.06 && salarioParaAnalise <= 4664.68 ) {
            faixa = 4;
        } else if (salarioParaAnalise > 4664.68) {
            faixa = 5;
        }
        return faixa;
    }

}
