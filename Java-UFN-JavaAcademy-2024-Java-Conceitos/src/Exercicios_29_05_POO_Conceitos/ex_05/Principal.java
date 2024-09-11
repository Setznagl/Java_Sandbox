package Exercicios_29_05_POO_Conceitos.ex_05;

import java.util.Scanner;

public class Principal {

    protected static Scanner LerDados = new Scanner(System.in);

    protected static Pessoa pessoaClassePrincipalParaExibicao;
    protected static ImpostoDeRenda impostoDeRendaClassePrincipalParaExibicao;

    public static void main(String[] args) {

        fluxoDeEscolha();

    }

    static int LerOpcao() {
        int Opcao = LerDados.nextInt();
        System.out.println("Você selecionou " + Opcao + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
        int Confirmacao = LerDados.nextInt();
        while (Confirmacao == 1) {
            System.out.println("""
                    Bem vindo ao sistema de cálculo de imposto de renda?\s
                    1- Cadastrar contribuinte e salário
                    2- Exibir resultado
                    3- Finalizar
                    """);
            Opcao = LerDados.nextInt();
            System.out.println("Você selecionou " + Opcao + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
            Confirmacao = LerDados.nextInt();
        }
        return Opcao;
    }

    static void fluxoDeEscolha() {
        System.out.println("""
                    Bem vindo ao sistema de cálculo de imposto de renda?\s
                    1- Cadastrar contribuinte e salário
                    2- Exibir resultado
                    3- Finalizar
                    """);

        int Selecionado = LerOpcao();
        System.out.println("Foi selecionado a opção " + Selecionado);

        switch (Selecionado) {
            case 1: {
                System.out.println("Digite o seu nome e salário");
                // Adicionando registro
                Pessoa pessoa1 = new Pessoa();
                    pessoaClassePrincipalParaExibicao = pessoa1;
                ImpostoDeRenda impostoPessoa1 = new ImpostoDeRenda(pessoa1);
                    impostoDeRendaClassePrincipalParaExibicao = impostoPessoa1;

                System.out.println("Dados cadastrados com sucesso");

                System.out.println("Deseja realizar outra função?\n 1- sim     2- não ");
                int AcaoAdicional = LerOpcao();
                if (AcaoAdicional == 1) {
                    fluxoDeEscolha();
                    break;
                }
                break;
            }
            case 2: {
                ImpostoDeRenda.imprimir(pessoaClassePrincipalParaExibicao, impostoDeRendaClassePrincipalParaExibicao);
                break;
            }
            default:
                break;
        }
    }

}
