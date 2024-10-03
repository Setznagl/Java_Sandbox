package StreamCaracteres;

import java.io.*;

public class Exercicio_IO_01 {
    public static void main(String[] args) throws IOException {
        receberTecladoImprimirConsole();
    }

    public static void receberTecladoImprimirConsole() throws IOException {
        System.out.println("Recomende 3 filmes: ");
        /*.
          InputStream is = System.in; //Recebendo do teclado
          InputStreamReader isr = new InputStreamReader(is); //Transformando em caracter
          BufferedReader br = new BufferedReader(isr); //Armazenando em buffer
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Abreviação dos 3
        String line = br.readLine(); //Armazena a linha digitada

        /*.
            OutputStream os = System.out;
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
        */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line); //escreve a linha
            bw.newLine(); //pula linha
            line = br.readLine(); //limpa a linha atual
        }while (!(line.isEmpty()));
        bw.flush(); //limpa o buffer de escrita

        br.close(); //fecha input
        bw.close(); //fecha output
    }
}
