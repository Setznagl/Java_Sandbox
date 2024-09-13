package Exercicios_29_05_POO_Conceitos.ex_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    protected static Scanner LerDados = new Scanner(System.in);
    protected static List<Paciente> ListaPacientes = new ArrayList<>();

    public static void main(String[] args) {

        fluxoDeEscolha();

    }

    static int LerOpcao() {
        int Opcao = LerDados.nextInt();
        System.out.println("Você selecionou " + Opcao + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
        int Confirmacao = LerDados.nextInt();
        while (Confirmacao == 1) {
            System.out.println("""
                    Bem vindo ao sistema de cadastro de pacientes para cálculo de IMC.
                    O que deseja realizar?\s
                    1- Cadastrar paciente 
                    2- Calular IMC dos pacientes e exibir relatórios
                    3- Finalizar
                    """);
            Opcao = LerDados.nextInt();
            System.out.println("Você selecionou " + Opcao + ", Deseja alterar? \n" + "1 - Alterar\n" + "2 - Manter");
            Confirmacao = LerDados.nextInt();
        }
        return Opcao;
    }

    static void AdicionarPaciente(Paciente pacienteIterado){
        ListaPacientes.add(pacienteIterado);
    }


    protected static String CalcularIMC(){
        for (Paciente pacienteDuranteLoop : ListaPacientes) {

            double alturaPacienteIterado = pacienteDuranteLoop.AlturaPaciente;
            double alturaPacienteIterado_Quadrado = alturaPacienteIterado * alturaPacienteIterado;

            double pesoPacienteIterado = pacienteDuranteLoop.PesoPaciente;

            double IMC = pesoPacienteIterado / alturaPacienteIterado_Quadrado;
            String IMCstring = String.format("%.2f", IMC);

            String mensagemNumeroIMC = "O IMC é de : " + IMCstring + "\n";
            String mensagemFaixaIMC = diagnostico(IMC);

            return mensagemNumeroIMC + mensagemFaixaIMC;
        }
        return null;
    }

    protected static String diagnostico(double IMC){
        String mensagemFaixaIMC = "";
        if (IMC < 16) {
            mensagemFaixaIMC = "Baixo peso muito grave";
        } else if (IMC >= 16 && IMC < 16.99) {
            mensagemFaixaIMC = "Baixo peso grave";
        } else if (IMC >= 17 && IMC < 18.49) {
            mensagemFaixaIMC = "Baixo peso";
        } else if (IMC >= 18.49 && IMC < 24.99) {
            mensagemFaixaIMC = "Peso Normal";
        } else if (IMC >= 24.99 && IMC < 29.99) {
            mensagemFaixaIMC = "Sobrepeso";
        } else if (IMC >= 30 && IMC < 34.99) {
            mensagemFaixaIMC = "Obesidade I";
        } else if (IMC >= 35 && IMC < 39.99) {
            mensagemFaixaIMC = "Obesidade II";
        } else if (IMC > 40) {
            mensagemFaixaIMC = "Obesidade III (Obesidade Mórbida)";
        }
        return mensagemFaixaIMC;
    }

    static void fluxoDeEscolha() {
        System.out.println("""
                    Bem vindo ao sistema de cadastro de pacientes para cálculo de IMC.
                    O que deseja realizar?\s
                    1- Cadastrar paciente 
                    2- Calular IMC dos pacientes e exibir relatórios
                    3- Finalizar
                    """);

        int Selecionado = LerOpcao();
        System.out.println("Foi selecionado a opção " + Selecionado);

        switch (Selecionado) {
            case 1: {
                System.out.println("Digite um nome para o paciente ou deixe em branco e em" +
                        " seguida digite sua altura em metros e peso em kg's respectivamente");
                // Adicionando produtos ao carrinho
                Paciente paciente1 = new Paciente();
                AdicionarPaciente(paciente1);
                System.out.println("Cadastrado com sucesso!");

                System.out.println("Pacientes cadastrados com sucesso");

                System.out.println("Deseja realizar outra função?\n 1- sim     2- não ");
                int AcaoAdicional = LerOpcao();
                if (AcaoAdicional == 1) {
                    fluxoDeEscolha();
                    break;
                }
                break;
            }
            case 2: {
                System.out.println(CalcularIMC());
                break;
            }
            default:
                break;
        }
    }
}
