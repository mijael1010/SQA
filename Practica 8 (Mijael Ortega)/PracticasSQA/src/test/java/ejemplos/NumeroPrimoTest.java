package ejemplos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NumeroPrimoTest {

    NumeroPrimo np = new NumeroPrimo();

    @DisplayName("Test parametrizado - Numero primo")
    @ParameterizedTest
    @CsvSource({"2,true","6,false","19,true","8,false","22, false"})
    void validate(int num, boolean result) {
        assertEquals(result, np.validate(num));
    }

    @DisplayName("Pruebita con mas parametros")
    @ParameterizedTest
    @CsvSource({"2,2,4","6,6,12","19,1,20"})
    void validate2(int num1, int num2, int expected) {

        int actual = num1 + num2;
        assertEquals(expected, actual, "Error");
    }
}