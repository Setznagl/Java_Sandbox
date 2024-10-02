import javax.swing.*;

/**
 * Exceptions tratadas permitem que o código continue executando, enquanto não tratadas encerram o funcionamento
 * Da aplicação em andamento
 */
public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try{
            int resultado = dividir(Integer.parseInt(a) , Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        }

        //Captura tipos não condizentes com números
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe "
            + "um número inteiro " + e.getMessage());
            e.printStackTrace();
        }

        //Captura falha aritimética, por exemplo divisão por 0
        catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null , "Não é possível dividir por 0 "
            + e.getMessage());
        }

        //Finally, executado após qualquer catch
        finally {System.out.println("Chegou no finally");}


        //Com código de erro 1 (Exception não tratada) o código não chegará até aqui.
        System.out.println("Atravessou a exception....");
    }

    public static int dividir(int x, int y){
        return x / y;
    }
}
