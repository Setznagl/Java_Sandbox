package StreamDataObjects;

import java.io.*;
import java.util.Scanner;

public class Exercicio_IO_DataObject_01 {
    public static void main(String[] args) throws IOException {
        incluirProduto();
    }


    public static void incluirProduto() throws IOException {

        File f = new File("C:\\Users\\a920062\\Desktop\\Repostórios Clonados\\Sandbox_Java" +
                "\\D.I.O - Digital_Inovation_One\\Conceitos_Input-Output\\src\\main\\java" +
                "\\StreamDataObjects\\eletronico.bin");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

        /*OutputStream os = new FileOutputStream(f.getPath());
        DataOutputStream dos = new DataOutputStream(os);*/
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner scan = new Scanner(System.in);

        ps.println("Nome do produto: ");
        String nome = scan.nextLine();
        dos.writeUTF(nome);

        ps.println("Tipo : (A/B/C/D)");
        char tipoHardware = (char) System.in.read();
        dos.writeChar(tipoHardware);

        ps.println("Quantidade de produtos: ");
        int quantidade = scan.nextInt();
        dos.writeInt(quantidade);

        ps.println("Preco do produto: ");
        double preco = scan.nextDouble();
        dos.writeDouble(preco);

        lerProduto(f.getPath());

        dos.close();
        scan.close();
        ps.close();
    }


    public static void lerProduto(String caminhoArquivo) throws IOException {
        File f = new File(caminhoArquivo);

        /*InputStream is = new FileInputStream(f.getPath());
        DataInputStream dis = new DataInputStream(is);*/
        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

        String nome = dis.readUTF();
        char tipo = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.println("\nNome do produto: " + nome);
        System.out.println("Tipo : (A/B/C/D)" + tipo);
        System.out.println("Quantidade de produtos: " + quantidade);
        System.out.println("Preco do produto: " + preco);
        System.out.println("Total: " + quantidade * preco);

        dis.close();
    }

}
