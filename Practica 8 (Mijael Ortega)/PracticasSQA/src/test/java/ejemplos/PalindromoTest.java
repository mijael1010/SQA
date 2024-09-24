package ejemplos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {
    Palindromo pal = new Palindromo();

    @DisplayName("Test parametrizado - Palindromo")
    @ParameterizedTest
    @CsvSource({"somos, true","murcielago, false","ana, true","areña, false","hola, false"})
    void buscaPalindromo(String valor, boolean resultado) {
        boolean esPalindromo = pal.buscaPalindromo(valor);

        assertEquals(resultado, esPalindromo, "La verificación del palíndromo no coincide con el resultado esperado.");
    }
}