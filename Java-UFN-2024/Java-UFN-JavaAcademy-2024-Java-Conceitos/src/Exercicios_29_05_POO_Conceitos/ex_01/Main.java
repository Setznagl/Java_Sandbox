package Exercicios_29_05_POO_Conceitos.ex_01;
import java.util.Scanner;

public class Main {
    static Scanner LerDados = new Scanner(System.in);

    public static void main(String[] args) {

        fluxoDeEscolha();

    }

    static int LerOpcao() {
        int Opcao = LerDados.nextInt();
        System.out.println("Você selecionou " + Opcao + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
        int Confirmacao = LerDados.nextInt();
            while (Confirmacao == 1) {
                System.out.println("""
                        Bem vindo ao sistema de cadastro de livros
                        O que deseja realizar?\s
                        1- Cadastrar Livros
                        2- Listar Livros
                        3- Finalizar
                        """);
                Opcao = LerDados.nextInt();
                System.out.println("Você selecionou " + Opcao + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
                Confirmacao = LerDados.nextInt();
            }
        return Opcao;
    }

    static void fluxoDeEscolha(){
        System.out.println("""
                Bem vindo ao sistema de cadastro de livros
                O que deseja realizar?\s
                1- Cadastrar Livros
                2- Listar Livros
                3- Finalizar Programa
                """);

        int Selecionado = LerOpcao();
        System.out.println("Foi selecionado a opção " + Selecionado);

        switch (Selecionado){
            case 1:{
                System.out.println("Digite nome, autor, editora, ano de publicação e preço");
                Livro livro1 = new Livro();
                Biblioteca.AdicionarLivro(livro1);
                System.out.println("Digite nome, autor, editora, ano de publicação e preço");
                Livro livro2 = new Livro();
                Biblioteca.AdicionarLivro(livro2);
                System.out.println("Digite nome, autor, editora, ano de publicação e preço");
                Livro livro3 = new Livro();
                Biblioteca.AdicionarLivro(livro3);

                System.out.println("Livros cadastrados com sucesso");

                System.out.println("Deseja realizar outra função?\n 1- sim     2- não ");
                    int AcaoAdicional = LerOpcao();
                    if (AcaoAdicional == 1){
                        fluxoDeEscolha();
                        break;
                    }
                break;
            }
            case 2:{
                Biblioteca.exibirLivros();
                break;
            }
            default: break;
        }
    }
}