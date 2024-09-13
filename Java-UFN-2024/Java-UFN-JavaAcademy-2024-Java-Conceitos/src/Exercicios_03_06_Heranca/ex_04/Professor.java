package Exercicios_03_06_Heranca.ex_04;

class Professor extends Pessoa implements apresentarDados {
    String matricula;
    double salario;

    protected Professor(){
        super.nome = "Objeto Pessoa Professor";
        super.rg = 212397847;
        this.matricula = "828";
        this.salario = 3281.79;
        apresentarDados.mostrarDados(nome,rg,matricula,salario);
    }
}
