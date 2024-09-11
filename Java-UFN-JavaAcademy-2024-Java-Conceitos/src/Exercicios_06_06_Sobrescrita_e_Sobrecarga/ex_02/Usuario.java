package Exercicios_06_06_Sobrescrita_e_Sobrecarga.ex_02;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Usuario{
        private String nome;
        private String email;
        Scanner lerDados = new Scanner(System.in);

        public Usuario() {
            this.nome = lerDados.nextLine();
            this.email = null;
        }

    public void salvarNoArquivo() {
        String filename = this.nome + ".txt";
        try (PrintWriter writer = new PrintWriter(filename)) {
            if (this.email != null) {
                writer.println("Nome: " + this.nome);
                writer.println("Email: " + this.email);
            } else {
                writer.println("Nome: " + this.nome);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }

    public void setEmail(String emailParametro) {
        this.email = emailParametro;
    }
}
