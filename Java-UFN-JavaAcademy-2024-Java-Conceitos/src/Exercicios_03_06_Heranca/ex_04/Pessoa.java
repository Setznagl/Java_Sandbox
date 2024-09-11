package Exercicios_03_06_Heranca.ex_04;
import java.util.Scanner;

class Pessoa implements apresentarDados {
    Scanner LerDados = new Scanner(System.in);

    protected String nome;
    protected int rg;

    public Pessoa(){
        this.nome = "Objeto Pessoa";
        this.rg = 212397846;
        apresentarDados.mostrarDados(nome,rg);
    }

}
