package Exercicios_29_05_POO_Conceitos.ex_03;
import java.util.Scanner;

public class Produto {
    private String NomeProduto;
    private float ValorUnitario;
    private int Quantidade;
    private float TotalItem;

    Scanner LerDados = new Scanner(System.in);

    protected Produto(){
        this.NomeProduto = LerDados.nextLine();
        this.ValorUnitario = LerDados.nextFloat();
        this.Quantidade = LerDados.nextInt();
        this.TotalItem = this.ValorUnitario * this.Quantidade;
    }

    protected static double CalcularSubtotal(Produto produtoDuranteLoop) {
        return produtoDuranteLoop.TotalItem;
    }

    @Override
    public String toString(){
        return  "Item:  "+ NomeProduto + "  R$ " + ValorUnitario + "   " + Quantidade + "   "  + "  R$ " + TotalItem;
    }
}
