package Exercicios_29_05_POO_Conceitos.ex_02;
import java.util.ArrayList;
import java.util.List;

public class Turmas {
    protected static String NomeTurmaA = "A";
    protected static String NomeTurmaB = "B";
    protected static List<Aluno> A1= new ArrayList<>();
    protected static List<Aluno> B1 = new ArrayList<>();

    protected static void AdicionarAluno(Aluno alunoRecebido , List Turma){
        Turma.add(alunoRecebido);
    }
    protected static void listarAlunos() {
        for (Aluno AlunosDuranteLoop : A1) {
            System.out.println("Aluno da Turma A");
            System.out.println(AlunosDuranteLoop);
        }
        for (Aluno AlunosDuranteLoop : B1) {
            System.out.println("Aluno da Turma B");
            System.out.println(AlunosDuranteLoop);
        }
    }
}
