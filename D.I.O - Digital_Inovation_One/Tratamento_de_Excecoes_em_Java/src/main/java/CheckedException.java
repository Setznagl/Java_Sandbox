import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "AnimacoesFavoritas.txt";


        try {imprimirArquivoNoConsole(nomeDoArquivo);}

        catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null , "Não foi possível encontrar o arquivo, revise se" +
                    " o mesmo existe e se foi digitado corretamente! " + e.getMessage());
            e.printStackTrace();
        }

        catch (IOException e) {
            JOptionPane.showMessageDialog(null ,
                    "Erro inesperado durante a leitura ou escrita do arquivo, entre em contato com o suporte! " + e.getMessage());
            e.printStackTrace();
        }


        finally {System.out.println("\nChegou no finally!");}

        System.out.println("\n\nApesar da exception ou não, o programa continua!");
    }

    //IOException é um polimorfismo de FileNotFoundException que é a classe genérica, portanto IOException resolve os dois erros
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException /*throws FileNotFoundException*/ {
        File arquivo = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(arquivo.getName()));
        String linha = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }while (linha != null);{
            bw.flush();
            br.close();
        }
    }


}
