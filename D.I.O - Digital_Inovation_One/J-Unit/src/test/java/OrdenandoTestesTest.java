import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //Faz com que o teste obedeceça a ordem
public class OrdenandoTestesTest {
    @Test
    @Order(3)
    public void primeiroTesteDeclarado() {
        Assertions.assertEquals(10, 5+5);
        System.out.println("primeiroTesteDeclarado - order(3)");
    }

    @Test
    @Order(2)
    public void segundoTesteDecladado() {
        Assertions.assertTrue(10 > 5);
        System.out.println("segundoTesteDeclarado - order(2)");
    }

    @Test
    @Order(1)
    public void terceiroTesteDeclarado() {
        Assertions.assertFalse(5 > 6);
        System.out.println("terceiroTesteDeclarado - order(1)");
    }
    
}
