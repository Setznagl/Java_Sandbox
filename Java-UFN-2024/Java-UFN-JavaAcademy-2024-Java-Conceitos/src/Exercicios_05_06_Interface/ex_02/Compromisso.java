package Exercicios_05_06_Interface.ex_02;
import java.util.Scanner;

class Compromisso implements Profissional, Pessoal {
    Scanner LerDados = new Scanner(System.in);
    String nome;
    String data_e_hora;

    protected Compromisso(){
        nome = LerDados.nextLine();
        data_e_hora = LerDados.nextLine();
    }
    @Override
    public String toString(){
        return "Nome do compromisso: " + nome + "\nData e hora: " + data_e_hora + "\n";
    }

    @Override
    public void exibeCompromissoPessoal() {
        System.out.println("Este é um compromisso pessoal!\n");
    }

    @Override
    public void exibeCompromissoProfissional() {
        System.out.println("Este é um compromisso profissional!\n");
    }
}
