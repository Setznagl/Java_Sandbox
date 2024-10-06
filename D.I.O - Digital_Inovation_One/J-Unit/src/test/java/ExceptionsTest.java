import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @BeforeEach
    public void init() {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
    }

    @Test
    public void testTransferenciaValida() {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.transfere(c1 , c2 , 5);
    }

    @Test
    public void testTransferenciaInvalidaNaoEsperada() {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.transfere(c1 , c2 , 0);
    }

    @Test
    public void testTransferenciaInvalidaEsperada() {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Assertions.assertThrows(IllegalArgumentException.class, () -> c1.transfere(c1 , c2 , 0));
    }
}
