package Exercicios_05_06_Interface.ex_02;

public class Principal extends Compromisso {
    public static void main(String[] args) {
        System.out.println("Cadastre dois compromissos, nome e data");

        Compromisso compromisso001 = new Compromisso();
            compromisso001.exibeCompromissoPessoal();
        System.out.println(compromisso001);
            System.out.println("Cadastrado com sucesso!\n\n");
        ///////////////////////////////////////////////////////////////
        Compromisso compromisso002 = new Compromisso();
            compromisso002.exibeCompromissoProfissional();
        System.out.println(compromisso002);
    }
}
