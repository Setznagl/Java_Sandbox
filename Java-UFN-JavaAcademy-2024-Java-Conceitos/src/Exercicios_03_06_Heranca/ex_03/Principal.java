package Exercicios_03_06_Heranca.ex_03;
import java.util.ArrayList;
import java.util.List;

class Principal extends Funcionario {
    protected static List<Funcionario> quadroFuncionarios = new ArrayList<Funcionario>();

    public static void main(String[] args) {
        System.out.println("Cadastre a seguir 3 funcionários informando: \n nome, telefone setor, cargo, função " +
                "e idade respectivamente.");
        Funcionario funcionario001 = new Funcionario();
        quadroFuncionarios.add(funcionario001);
        System.out.println("Cadastrado com sucesso!\n");
        Funcionario funcionario002 = new Funcionario();
        quadroFuncionarios.add(funcionario002);
        System.out.println("Cadastrado com sucesso!\n");
        Funcionario funcionario003 = new Funcionario();
        quadroFuncionarios.add(funcionario003);
        System.out.println("Cadastrado com sucesso!\n");

        quadroFuncionarios.forEach(System.out::println);
    }
}
