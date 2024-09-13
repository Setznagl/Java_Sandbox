package Exercicios_29_05_POO_Conceitos.ex_05;

public class ImpostoDeRenda{
    protected int faixa;
    protected double aliquota;

    protected ImpostoDeRenda(){};
    protected ImpostoDeRenda(Pessoa pessoaParametro){
        faixa = FaixaImpostoDeRenda.CalcularFaixa(pessoaParametro);
        aliquota = calcularAliquota(faixa , pessoaParametro.getSalarioPessoa());
    }

    @Override
    public String toString(){
        return  "Sua faixa de imposto é de "+ faixa + " portanto o valor a pagar é de R$ : "
                + String.format("%.2f", aliquota);
    }

    protected static double calcularAliquota(int faixaParametro , double pessoaParametroSalario) {
        double aliquota = 0;

        if (faixaParametro == 1) {
            aliquota = pessoaParametroSalario * 0;
        } else if (faixaParametro == 2) {
            aliquota = pessoaParametroSalario * 0.075;
        } else if (faixaParametro == 3) {
            aliquota = pessoaParametroSalario * 0.15;
        } else if (faixaParametro == 4) {
            aliquota = pessoaParametroSalario * 0.225;
        } else if (faixaParametro == 5) {
            aliquota = pessoaParametroSalario * 0.275;
        }
        return aliquota;
    }

    protected static void imprimir(Pessoa pessoaParametro , ImpostoDeRenda impostoPessoaParametro){
        System.out.println(pessoaParametro);
        System.out.println(impostoPessoaParametro);
    }
}

