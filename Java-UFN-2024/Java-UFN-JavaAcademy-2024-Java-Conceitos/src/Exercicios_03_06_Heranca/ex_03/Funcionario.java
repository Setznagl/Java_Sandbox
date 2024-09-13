package Exercicios_03_06_Heranca.ex_03;
import java.util.Scanner;

class Funcionario extends Pessoa {
    String setor;
    String cargo;
    String funcao;
    Scanner LerDados = new Scanner(System.in);

    protected Funcionario(){
        this.nome = LerDados.nextLine();
        this.telefone = LerDados.nextLine();
        this.setor = LerDados.nextLine();
        this.cargo = LerDados.nextLine();
        this.funcao = LerDados.nextLine();
        this.idade = LerDados.nextInt();
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + " Idade: " + idade + " Contato: " + telefone + "\n"
                + " Setor: " + setor + " Cargo: " + cargo + " Função: " + funcao + "\n";
    }
}
