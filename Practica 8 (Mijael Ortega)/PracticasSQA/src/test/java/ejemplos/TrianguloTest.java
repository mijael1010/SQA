package ejemplos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @DisplayName("Test parametrizado - Tipo de Triángulo")
    @ParameterizedTest
    @CsvSource({"3, 3, 3, Equilatero", "3, 3, 4, Isoceles", "3, 4, 5, Escaleno", "5, 5, 5, Equilatero", "5, 5, 7, Isoceles", "6, 7, 8, Escaleno"})
    void tipoTriangulo(int l1, int l2, int l3, String expected) {
        assertEquals(expected, new Triangulo().tipoTriangulo(l1, l2, l3));
    }
}
