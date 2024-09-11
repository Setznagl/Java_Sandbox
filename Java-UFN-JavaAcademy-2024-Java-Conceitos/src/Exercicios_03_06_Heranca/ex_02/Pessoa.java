package Exercicios_03_06_Heranca.ex_02;
import java.util.Scanner;

class Pessoa extends SerHumano{
    Scanner LerDados = new Scanner(System.in);

    protected Pessoa(){
        this.nome = LerDados.nextLine();
        this.tipo = LerDados.nextLine();
        this.idade = LerDados.nextInt();
    }
}
