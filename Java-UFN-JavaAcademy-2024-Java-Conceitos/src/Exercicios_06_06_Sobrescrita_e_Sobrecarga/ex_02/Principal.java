package Exercicios_06_06_Sobrescrita_e_Sobrecarga.ex_02;

public class Principal extends Usuario {
    public static void main(String[] args) {
        Usuario usuario001 = new Usuario();
        usuario001.setEmail("gabriel.mendonca@ufn.edu.br");
        usuario001.salvarNoArquivo();

        Usuario usuario002 = new Usuario();
        usuario002.salvarNoArquivo();
    }
}
