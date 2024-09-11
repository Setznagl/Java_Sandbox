package Exercicios_03_06_Heranca.ex_02;

class Principal {
    public static void main(String[] args) {
        System.out.println("Insira nome, tipo e idade para a pessoa a seguir!");
        Pessoa pessoa1 = new Pessoa();
        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.tipo);
        System.out.println(pessoa1.idade);
        System.out.println(pessoa1.falar());
        pessoa1.andar();
    }
}
