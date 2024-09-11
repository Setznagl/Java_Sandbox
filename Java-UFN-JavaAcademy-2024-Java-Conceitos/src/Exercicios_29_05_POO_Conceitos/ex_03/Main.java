package Exercicios_29_05_POO_Conceitos.ex_03;

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
                        1- Cadastrar Produto e Adicionar ao Carrinho
                        2- Listar Carrinho
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
                        1- Cadastrar Produto e Adicionar ao Carrinho
                        2- Listar Carrinho
                        3- Finalizar
                        """);

        int Selecionado = LerOpcao();
        System.out.println("Foi selecionado a opção " + Selecionado);

        switch (Selecionado){
            case 1:{
                System.out.println("Digite nome do produto, preço e quantidade");
                // Adicionando produtos ao carrinho
                Produto produto1 = new Produto();
                Carrinho.AdicionarProduto(produto1);
                System.out.println("Cadastrado com sucesso!");
                ///////////////////////////////////
                // Adicionando produtos ao carrinho
                Produto produto2 = new Produto();
                Carrinho.AdicionarProduto(produto2);
                System.out.println("Cadastrado com sucesso!");
                ///////////////////////////////////
                // Adicionando produtos ao carrinho
                Produto produto3 = new Produto();
                Carrinho.AdicionarProduto(produto3);
                System.out.println("Cadastrado com sucesso!");
                ///////////////////////////////////

                System.out.println("Produtos cadastrados com sucesso");

                System.out.println("Deseja realizar outra função?\n 1- sim     2- não ");
                    int AcaoAdicional = LerOpcao();
                    if (AcaoAdicional == 1){
                        fluxoDeEscolha();
                        break;
                    }
                break;
            }
            case 2:{
                Carrinho.exibirCarrinho();
                break;
            }
            default: break;
        }
    }
}