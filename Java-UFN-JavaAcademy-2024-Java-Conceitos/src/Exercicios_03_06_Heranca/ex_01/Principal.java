package Exercicios_03_06_Heranca.ex_01;
import java.util.Scanner;

class Principal extends Usuario {
Scanner LerDados = new Scanner(System.in);

    public Principal() {
        this.nome = LerDados.nextLine();
        this.email = LerDados.nextLine();
        this.telefone = LerDados.nextLine();
    }

    @Override
    public String toString(){
        return  "O nome do usuário digitado é: "+ nome + ", seu e-mail é: " + email + ", e seu telefone é " + telefone;
    }



    public static void main(String[] args) {
        System.out.println("Solicitar e exibir na tela conforme conceitos de herança.\n" +
                "Digite nome, seguido de e-mail e telefone");
        Principal user01 = new Principal();
        System.out.println(user01);
    }
}
