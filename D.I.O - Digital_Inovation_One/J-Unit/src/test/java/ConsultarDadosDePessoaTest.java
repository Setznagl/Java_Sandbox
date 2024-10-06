import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll //antes de tudo
    public static void configurarConexao() {
        ExemploAfterBefore.BancoDeDados.iniciarConexao();
        System.out.println("Iniciado!");
    }

    @BeforeEach //antes de cada teste
    void inserirDadosDeTeste(){
        ExemploAfterBefore.BancoDeDados.inserirDados(new ExemploBasico.Pessoa("Gabriel" , LocalDate.of(2000,4,11)));
    }

    @Test
    void validarRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterEach //depois de cada teste
    void removerDadosDeTeste(){
        ExemploAfterBefore.BancoDeDados.removerDados(new ExemploBasico.Pessoa("Gabriel" , LocalDate.of(2000,4,11)));
    }

    @AfterAll //depois de de tudo
    public static void fecharConexao() {
        ExemploAfterBefore.BancoDeDados.encerrarConexao();
        System.out.println("Encerrado!");
    }

}
