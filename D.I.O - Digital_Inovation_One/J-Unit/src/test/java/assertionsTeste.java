import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class assertionsTeste {

    @Test
    void validarLancamento(){

        int[] primeiroLancamento = {10 , 20 , 30 , 40 , 50};
        int[] segundoLancamento = {-1 , 5 , 2 , 3 , 10 , 16};
        int[] terceiroLancamento = {-1 , 5 , 2 , 3 , 10};
        int[] quartoLancamento = {10 , 20 , 30 , 40 , 50};

        //Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        //Assertions.assertArrayEquals(primeiroLancamento, terceiroLancamento);
        //Assertions.assertArrayEquals(primeiroLancamento, quartoLancamento);
    }

    @Test
    void validarNullable(){
        ExemploBasico.Pessoa pessoa = null;
        ExemploBasico.Pessoa pessoa2 = new ExemploBasico.Pessoa("Otavio" , LocalDate.now());

        Assertions.assertTrue(pessoa == null);
        Assertions.assertTrue(pessoa2 == null);
    }

}
