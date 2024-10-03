package StreamCaracteres;

import java.io.*;

public class Exercicio_IO_03 {
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }

    public static void copiarArquivo() throws IOException {
        File f = new File("recomendacoes.txt");
        String nameF = f.getName();
        /*
          Reader r = new FileReader(nameF);
          BufferedReader br = new BufferedReader(r);
        */
        BufferedReader br = new BufferedReader(new FileReader(nameF));
        String line = br.readLine();

        String nameArquivoCopia = nameF.substring(0 , nameF.indexOf(".")).concat("-copy.txt");
        File fcopy = new File(nameArquivoCopia);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        }while (line != null);

        System.out.println("Arquivo copiado com sucesso " + f.getName() + " " + f.length() + "bytes");
        System.out.println("Arquivo copia criado com o nome " + fcopy.getName() + " " + f.length() + "bytes");

        PrintWriter pw = new PrintWriter(System.out);
        pw.printf("Recomende mais 3 livros\n");
        pw.flush();

        adicionarInfoNoArquivo(fcopy.getName());

        System.out.println("Arquivo cópia editado com sucesso " + fcopy.getName() + " " + fcopy.length() + "bytes");

        br.close();
        bw.close();
        pw.close();
    }

    public static void adicionarInfoNoArquivo(String nomeArquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo , true));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while (!(line.equalsIgnoreCase("fim")));

        br.close();
        bw.close();
    }


}
