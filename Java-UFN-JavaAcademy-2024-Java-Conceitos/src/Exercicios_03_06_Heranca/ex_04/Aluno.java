package Exercicios_03_06_Heranca.ex_04;

class Aluno extends Pessoa implements apresentarDados {
    String matricula;

    protected Aluno(){
        super();
        this.nome = "Objeto Pessoa Aluno";
        this.rg = 212397847;
        this.matricula = "123";
        apresentarDados.mostrarDados(nome,rg,matricula);
    }
}
