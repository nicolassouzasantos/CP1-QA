//Nicolas Souza dos Santos / rm555571

package example;

import org.example.Apdex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApdexTest {

    @Test
    public void calcApdex() {
        // arrange
        Apdex apdex = new Apdex(555571, 0, 555571);

        // act
        float score = apdex.calcularApdex();

        // assert
        Assertions.assertEquals(1, score, 0.001);
    }

    @Test
    public void calcApdexBom() {
        // arrange
        Apdex apdex = new Apdex(494458, 61113, 555571);

        // act
        float score = apdex.calcularApdex();

        // assert
        Assertions.assertEquals(0.89, score, 0.001);
    }

    @Test
    public void calcApdexrazoavel() {
        // arrange
        Apdex apdex = new Apdex(444456, 111115, 555571);

        // act
        float score = apdex.calcularApdex();

        // assert
        Assertions.assertEquals(0.80, score, 0.001);
    }

    @Test
    public void calcApdexRuim() {
        // arrange
            Apdex apdex = new Apdex(327786, 227785, 555571);

        // act
        float score = apdex.calcularApdex();

        // assert
        Assertions.assertEquals(0.59, score, 0.001);
    }
}