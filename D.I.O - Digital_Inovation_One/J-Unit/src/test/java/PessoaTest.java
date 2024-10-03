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

    @Test //Anottation para teste
    void validarSoma10DiasNaDataDeNascimento(){
        //Monta o cenário
        ExemploBasico.Pessoa pessoa =  new ExemploBasico.Pessoa("Julia" , LocalDate.of(2022,1,1));
        //Executa a validação
        LocalDate nascimentoMaisDez = pessoa.getDataNascimento().plusDays(10);

        Assertions.assertNotEquals(pessoa.getDataNascimento(), nascimentoMaisDez);
    }

    @Test //Anottation para teste
    void atribuicaoCorretaIdade(){
        //Monta o cenário
        ExemploBasico.Pessoa pessoa =  new ExemploBasico.Pessoa("Julia" , LocalDate.of(2002,1,1));
        //Executa a validação
        Assertions.assertEquals(22 , pessoa.getIdadeCustom());
        Assertions.assertTrue(pessoa.getDataNascimento().isAfter(LocalDate.of(2000,1,1)));
    }

}