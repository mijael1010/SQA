package ejemplos;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @ParameterizedTest
    @CsvSource(value = {"10, '0,1,1,2,3,5,8'", "20, '0,1,1,2,3,5,8,13'", "0, '0,1'", "1, '0,1,1'", "50, '0,1,1,2,3,5,8,13,21,34'", "100, '0,1,1,2,3,5,8,13,21,34,55,89'"})
    void fibonacci(int limite, String resultadoEsperado) {
        assertEquals(resultadoEsperado, fibonacci.fibonacci(limite));
    }
}