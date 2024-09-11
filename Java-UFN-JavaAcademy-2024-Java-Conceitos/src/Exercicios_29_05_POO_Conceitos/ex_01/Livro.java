package Exercicios_29_05_POO_Conceitos.ex_01;
import java.util.Scanner;

public class Livro {
    private String NomeLivro;
    private String Autor;
    private String Editora;
    private int AnoPublicacao;
    private double Preco;

    Scanner LerDados = new Scanner(System.in);

    protected Livro(){
        this.NomeLivro = LerDados.nextLine();
        this.Autor = LerDados.nextLine();
        this.Editora = LerDados.nextLine();
        this.AnoPublicacao = LerDados.nextInt();
        this.Preco = LerDados.nextDouble();
    }

    @Override
    public String toString(){
        return "Livro em Registro\n"+
                "Nome :" + "  " + NomeLivro + "  " +
                "Autor :" + "  " + Autor + "  " +
                "Editora :" + "  " + Editora + "  " +
                "Ano de Publicação :" + "  " + AnoPublicacao + "  " +
                "Preco :" + "  " + Preco + "  " + "\n\n";
    }
}
