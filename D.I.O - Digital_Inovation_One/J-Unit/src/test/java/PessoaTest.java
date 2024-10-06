import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {

    @Test //Anottation para teste
    void validarCalculoDeIdade(){
        //Monta o cenário
        //  return (int) ChronoUnit.YEARS.between(this.dataNascimento , LocalDate.now());
        ExemploBasico.Pessoa pessoa = new ExemploBasico.Pessoa("Julia" , LocalDate.of(2022,1,1));
        //Executa a validação
        Assertions.assertEquals(2 , pessoa.getIdadeCustom());
    }

}