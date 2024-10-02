import javax.swing.*;

public class ExceptionCustomizada2 {
    public static void main(String[] args) {
        int[] numerador = { 4 , 5 , 8 , 10};
        int[] denominador = { 2 , 4 , 0 , 2 , 8 };

        for (int i = 0; i < denominador.length; i++) {
            try{
                if(numerador[i] %2 != 0)
                    throw new DivisaoNaoExata("Divisão não exata!" , numerador[i] , denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            }
            catch(DivisaoNaoExata ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            catch (ArithmeticException ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        System.out.println("O programa continua e não desarma apesar dos erros...");
    }
}


class DivisaoNaoExata extends Exception {
    private int numerador;
    private int denominador;
    public DivisaoNaoExata(String message , int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}