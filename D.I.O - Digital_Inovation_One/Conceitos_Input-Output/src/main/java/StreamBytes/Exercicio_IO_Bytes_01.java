package StreamBytes;

import java.io.*;

public class Exercicio_IO_Bytes_01 {
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }

    public static void copiarArquivo() throws IOException {
        File f = new File("Designer.jpeg");
        String fName = f.getName();

        /*  InputStream is = new FileInputStream(f.getName());
            BufferedInputStream bis = new BufferedInputStream(is);  */
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f.getName()));

        String nomeArquivoCopy = fName.substring(0 , fName.indexOf(".")).concat("-byte-copy.jpeg");
        File fcopy = new File(nomeArquivoCopy);

        /*  OutputStream os = new FileOutputStream(nomeArquivoCopy);
            BufferedOutputStream bos = new BufferedOutputStream(os);  */
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fcopy));

        int line = 0;
        while ( (line = bis.read()) != -1 ){
            bos.write( (char) line);
            bos.flush();
        }
        bis.close();
        bos.close();
    }
}
