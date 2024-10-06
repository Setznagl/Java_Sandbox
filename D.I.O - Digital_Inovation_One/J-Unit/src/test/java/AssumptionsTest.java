import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class AssumptionsTest {

    @Test
    void validarAlgoSomenteNaMaquinaLocal() {
        Assumptions.assumeTrue("a920062".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "a920062")
    void validarAlgoSomenteNaMaquinaLocal2() {
        Assumptions.assumeTrue("a920062".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(25, 5 * 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "a920062")
    void validarAlgoSomenteNaMaquinaLocal3() {
        Assumptions.assumeTrue("a920062".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(25, 5 * 5);
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void validarAlgoSomenteNaMaquinaLocal4() {
        Assertions.assertEquals(100, 9 * 10);
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.LINUX})
    void validarAlgoSomenteNaMaquinaLocal5() {
        Assertions.assertEquals(100, 9 * 10);

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void validarAlgoSomenteNaMaquinaLocal6() {
        Assertions.assertEquals(75, 25 * 3);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8 , max = JRE.JAVA_16)
    void validarAlgoSomenteNaMaquinaLocal7() {
        Assertions.assertEquals(75, 25 * 3);
    }

}
