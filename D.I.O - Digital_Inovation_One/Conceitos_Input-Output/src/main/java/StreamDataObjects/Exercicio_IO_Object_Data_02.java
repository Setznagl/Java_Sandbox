package StreamDataObjects;

import lombok.Getter;
import lombok.ToString;

import java.io.*;

/**
 * A Serialização utiliza o Data Stream para ler os diferentes tipos de dados do objetos
 */
public class Exercicio_IO_Object_Data_02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializacao();
        deserializacao("ObjectSerializedGato");
    }


    public static void serializacao() throws IOException {
        Gato g1 = new Gato("Medeia" , 5 , "Preta", true , true);

        File f = new File("ObjectSerializedGato");

        /*OutputStream os = new FileOutputStream(f.getName());
        ObjectOutputStream oos = new ObjectOutputStream(os);*/
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));

        oos.writeObject(g1);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criado com sucesso, tamanho %d bytes. ", f.getName() , f.length());

        oos.close();
        ps.close();
    }


    public static void deserializacao(String arquivo) throws IOException, ClassNotFoundException {

        /*InputStream is = new FileInputStream(arquivo);
        ObjectInputStream ois = new ObjectInputStream(is);*/
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objectGato = (Gato) ois.readObject();

        System.out.println("Nome: " + objectGato.getNome());
        System.out.println("Idade: " + objectGato.getIdade());
        System.out.println("Cor: " + objectGato.getCor());
        System.out.println("Castrado: " + objectGato.isCastrado());
        System.out.println("Ronroda: " + objectGato.isRonrona());
        System.out.println(objectGato);

        ois.close();
    }
    
}

@Getter @ToString
class Gato implements Serializable{

    @Serial /*Definir expressamente a versão da classe para previnir que objetos serializados não possam ser lidos após
    alterações nos atributos que alteram o UID da classe*/
    private static final long serialVersionUID = 2L;

    private String nome;
    private Integer idade;
    private String cor;
    private boolean castrado;
    private transient boolean ronrona; //Ignora o valor atribuido quando for serializado
        Gato(String nome, Integer idade, String cor, boolean castrado , boolean ronrona){
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
            this.castrado = castrado;
            this.ronrona = ronrona;
        }
        Gato(){

        }
}
