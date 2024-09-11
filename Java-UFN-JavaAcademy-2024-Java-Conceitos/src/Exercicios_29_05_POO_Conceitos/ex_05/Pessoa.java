package Exercicios_29_05_POO_Conceitos.ex_05;
import java.util.Scanner;

public class Pessoa {
    protected String nomePessoa;
    protected double salarioPessoa;

    Scanner LerDados = new Scanner(System.in);

    protected Pessoa() {
        this.nomePessoa = LerDados.nextLine();
        this.salarioPessoa = LerDados.nextDouble();
    }

    protected String getNomePessoa() {return nomePessoa;}
    protected double getSalarioPessoa() {return salarioPessoa;}

    protected void setNomePessoa(String nomeParaRegistro) { nomePessoa = nomeParaRegistro; }
    protected void setSalarioPessoa(double salarioParaRegistro) { salarioPessoa = salarioParaRegistro; }

    @Override
    public String toString(){
        return  "Contribuinte: "+ nomePessoa + " o seu salário é de R$ : " + salarioPessoa + "  ";
    }

}
