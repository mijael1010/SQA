package com.com470.calculadoraApp.service;

import com.com470.calculadoraApp.model.OperationModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculateSimpleTest {

    CalculateSimple calc = new CalculateSimple();

    @DisplayName("Suma")
    @Test
    void add() {
        OperationModel operation = new OperationModel(5, 4);

        int esperado = 9;
        int resultado = calc.add(operation);

        assertEquals(esperado, resultado,"Tiene que ser 9");
    }

    @DisplayName("Resta")
    @Test
    void subtract() {
        OperationModel operation = new OperationModel(5, 4);

        int esperado = 1;
        int resultado = calc.subtract(operation);

        assertEquals(esperado, resultado,"Tiene que ser 1");
    }

    @DisplayName("Multiplicación")
    @Test
    void multiply() {
        OperationModel operation = new OperationModel(5, 4);

        int esperado = 20;
        int resultado = calc.multiply(operation);

        assertEquals(esperado, resultado,"Tiene que ser 20");
    }

    @DisplayName("División")
    @Test
    void divide() {
        OperationModel operation = new OperationModel(6, 3);

        double esperado = 2;
        double resultado = calc.divide(operation);

        assertEquals(esperado, resultado,"Tiene que ser 2");
    }

    @DisplayName("Factorial")
    @Test
    void factorial() {
        OperationModel operation = new OperationModel(5);

        int esperado = 120;
        int resultado = calc.factorial(operation);

        assertEquals(esperado, resultado,"Tiene que ser 120");
    }

    @DisplayName("Fibonacci")
    @Test
    void fibonacci() {
        OperationModel operation = new OperationModel(5);

        int esperado = 5;
        int resultado = calc.fibonacci(operation);

        assertEquals(esperado, resultado,"Tiene que ser 5");
    }

    @DisplayName("Raiz")
    @Test
    void sqrt() {
        OperationModel operation = new OperationModel(5);

        double esperado = 2.23606797749979;
        double resultado = calc.sqrt(operation);

        assertEquals(esperado, resultado,"Tiene que ser 2.23606797749979");
    }

    @DisplayName("Elevado")
    @Test
    void power() {
        OperationModel operation = new OperationModel(5);

        int esperado = 25;
        int resultado = calc.power(operation);

        assertEquals(esperado, resultado,"Tiene que ser 25");
    }
}