package Exercicios_29_05_POO_Conceitos.ex_02;
import java.util.List;
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
                    Bem vindo ao sistema de cadastro de alunos em turmas.
                    O que deseja realizar?\s
                    1- Cadastrar alunos
                    2- Listar alunos em todas as turmas
                    3- Finalizar
                    """);
            Opcao = LerDados.nextInt();
            System.out.println("Você selecionou " + Opcao + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
            Confirmacao = LerDados.nextInt();
        }
        return Opcao;
    }

    protected static List delegarTurma() {
        System.out.println("Digite a turma");
        String turma = LerDados.next();
        System.out.println("Você digitou " + turma + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
        int Confirmacao = LerDados.nextInt();

        while (Confirmacao == 1){
            turma = LerDados.next();
            System.out.println("Você digitou " + turma + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
            Confirmacao = LerDados.nextInt();
        }

        boolean textoCorresponde_TurmaA = turma.equals(Turmas.NomeTurmaA);
        boolean textoCorresponde_TurmaB = turma.equals(Turmas.NomeTurmaB);

        if (textoCorresponde_TurmaA) {
            System.out.println("Adicionado com sucesso!");
            return Turmas.A1;
        } else if (textoCorresponde_TurmaB) {
            System.out.println("Adicionado com sucesso!");
            return Turmas.B1;
        } else {
            System.out.println("Sua opção digitada não corresponde ao esperado, digite novamente");
            delegarTurma();
        }return null;
    }

    protected static void fluxoDeEscolha() {
        System.out.println("""
                Bem vindo ao sistema de cadastro de alunos em turmas.
                O que deseja realizar?\s
                1- Cadastrar alunos
                2- Listar alunos em todas as turmas
                3- Finalizar
                """);

        int Selecionado = LerOpcao();
        System.out.println("Foi selecionado a opção " + Selecionado);

        switch (Selecionado) {
            case 1: {
                System.out.println("Digite nome do aluno, sua idade, matrícula\n" +
                        "e turma. Digite 'A' para a turma A ou 'B' para a turma B"
                );
                //Adicionando o primeiro aluno e criando funções auxiliares
                Aluno aluno1 = new Aluno();
                List delegarTurma = delegarTurma();
                Turmas.AdicionarAluno(aluno1, delegarTurma);
                ///////////////////////////////////////////////////////////
                Aluno aluno2 = new Aluno();
                delegarTurma = delegarTurma();
                Turmas.AdicionarAluno(aluno2, delegarTurma);
                ///////////////////////////////////////////////////////////
                Aluno aluno3 = new Aluno();
                delegarTurma = delegarTurma();
                Turmas.AdicionarAluno(aluno3, delegarTurma);
                ///////////////////////////////////////////////////////////
                Aluno aluno4 = new Aluno();
                delegarTurma = delegarTurma();
                Turmas.AdicionarAluno(aluno4, delegarTurma);
                ///////////////////////////////////////////////////////////
                Aluno aluno5 = new Aluno();
                delegarTurma = delegarTurma();
                Turmas.AdicionarAluno(aluno5, delegarTurma);
                ///////////////////////////////////////////////////////////
                System.out.println("Alunos cadastrados com sucesso");

                System.out.println("Deseja realizar outra função?\n 1- sim     2- não ");
                int AcaoAdicional = LerOpcao();
                if (AcaoAdicional == 1) {
                    fluxoDeEscolha();
                    break;
                }break;
            }
            case 2: {
                Turmas.listarAlunos();
                break;
            }
            default: break;
        }
    }
}