package ejemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void suma() {
        assertEquals(5, calculadora.suma(2, 3));
        assertEquals(0, calculadora.suma(-2, 2));
        assertEquals(-5, calculadora.suma(-2, -3));
    }

    @Test
    void resta() {
        assertEquals(-1, calculadora.resta(2, 3));
        assertEquals(-4, calculadora.resta(-2, 2));
        assertEquals(1, calculadora.resta(-2, -3));
    }

    @Test
    void multiplicacion() {
        assertEquals(6, calculadora.multimplicacion(2, 3));
        assertEquals(-4, calculadora.multimplicacion(-2, 2));
        assertEquals(6, calculadora.multimplicacion(-2, -3));
    }

    @Test
    void division() {
        assertEquals(2, calculadora.division(6, 3));
        assertEquals(-1, calculadora.division(-2, 2));
        assertEquals(1, calculadora.division(-3, -3));

        // Probar la excepción para la división por cero
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.division(1, 0);
        });
        assertEquals("No se puede dividir entre 0", exception.getMessage());
    }
}
