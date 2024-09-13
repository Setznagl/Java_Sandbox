package Exercicios_03_06_Heranca.ex_04;

interface apresentarDados {
    public static void mostrarDados(String nome, int RG) {
        System.out.println("Nome: " + nome + "\nRG: " + RG + "\n");
    };
    public static void mostrarDados(String nome , int RG , String matricula){
        System.out.println("Nome: " + nome + "\nRG: " + RG + "\nMatricula: " + matricula +"\n\n");
    };
    public static void mostrarDados(String nome , int RG , String matricula , double salario){
        System.out.println("Nome: " + nome + "\nRG: " + RG + "\nMatricula: " + matricula + "\nSalario: "
                + salario + "\n\n");
    };
}
