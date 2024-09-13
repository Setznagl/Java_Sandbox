package Exercicios_05_06_Interface.ex_01;
import java.util.Scanner;

public class Principal extends Mensagem {
    Scanner LerDados = new Scanner(System.in);

    public static void main(String[] args) {
        Principal teste01 = new Principal();
        teste01.exibeMensagemA();
        Principal teste02 = new Principal();
        teste02.exibeMensagemB();
    }

    @Override
    void exibeMensagemA() {
        System.out.println("Cuide bem dos animais!");
    }

    @Override
    void exibeMensagemB() {
        String mensagemB = LerDados.nextLine();
        System.out.println(mensagemB);
    }

}
