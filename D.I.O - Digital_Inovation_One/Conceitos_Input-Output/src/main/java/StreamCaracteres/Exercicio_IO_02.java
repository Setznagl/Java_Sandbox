package StreamCaracteres;

import java.io.*;
import java.util.Scanner;

public class Exercicio_IO_02 {

    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocumento();
    }

    public static void lerTecladoEscreverDocumento() throws IOException {

        PrintWriter pw =  new PrintWriter(System.out); //Será usado para escrever na tela
        pw.println("Digite 3 recomendações de filmes: "); //Será usado para escrever na tela
        pw.flush(); //Descarregando

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();


        File f = new File("recomendacoes.txt");
        //Buffer de digitação que está sendo criado com FileWriter e o documento onde será feito alterações
        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));
        do {
            bw.write(line);
            bw.newLine();
            line = scan.nextLine();
        }while (!(line.equalsIgnoreCase("fim")));


        pw.printf("Arquivo \"%s\" criado com sucesso!\n", f.getName()); //Usando writer de aviso
        pw.close(); //Fecha o writer de aviso

        bw.close(); //fechando write de modificações no documento
        scan.close(); //fechando scanner
    }

}
