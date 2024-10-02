import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom ou sem exception, o programa continua...");
    }


    public static void imprimirArquivoNoConsole(String nomeDoArquivo){
        try{
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }while (line != null);
            bw.flush();
            br.close();
        }

        catch (NotAbleToOpenException e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
        }

        catch(IOException e){
            JOptionPane.showMessageDialog(null , "Ocorreu um erro não esperado, contate o suporte" +
                    " " + e.getMessage());
        }
    }


    static BufferedReader lerArquivo(String nomeArquivo) throws NotAbleToOpenException {
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(file));
        }
        catch (FileNotFoundException e) {
            throw new NotAbleToOpenException(file.getName() , file.getPath());
        }
    }


}


class NotAbleToOpenException extends Exception{

    private final String nomeDoArquivo;
    private final String diretorio;

    public NotAbleToOpenException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "NotAbleToOpenException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
