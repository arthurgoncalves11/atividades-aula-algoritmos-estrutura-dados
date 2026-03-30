package org.example.Lista5;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Lista5.CheckExpressaoAritmetica.ExpressaoAritmetica;
import org.junit.jupiter.api.Test;

public class ExpressaoAritmeticaTest {

    private ExpressaoAritmetica validadorExpressao = new ExpressaoAritmetica();

    @Test
    void checkExpressionWithCorrectDelimiters() {
        // Arrange
        String expressao = "10 + [20 / (10 - 20)]";

        // Act
        boolean resultado = validadorExpressao.validar(expressao);

        // Assert
        assertTrue(resultado);
    }

    @Test
    void checkExpressionWithIncorrectDelimiters() {
        // Arrange
        String expressao = "10 + [20 / (10 - 20])";

        // Act
        boolean resultado = validadorExpressao.validar(expressao);

        // Assert
        assertFalse(resultado);
    }

    @Test
    void checkExpressionWithNoDelimiters() {
        // Arrange
        String expressao = "10 + 20 - 5";

        // Act
        boolean resultado = validadorExpressao.validar(expressao);

        // Assert
        assertTrue(resultado);
    }

    @Test
    void checkExpressionWithUnclosedDelimiter() {
        // Arrange
        String expressao = "10 + (20 - 5";

        // Act
        boolean resultado = validadorExpressao.validar(expressao);

        // Assert
        assertFalse(resultado);
    }

    @Test
    void checkExpressionWithExtraClosingDelimiter() {
        // Arrange
        String expressao = "10 + 20) - 5";

        // Act
        boolean resultado = validadorExpressao.validar(expressao);

        // Assert
        assertFalse(resultado);
    }

    @Test
    void checkExpressionWithNestedCorrectDelimiters() {
        // Arrange
        String expressao = "{10 + [20 * (30 - 5)]}";

        // Act
        boolean resultado = validadorExpressao.validar(expressao);

        // Assert
        assertTrue(resultado);
    }

    @Test
    void checkExpressionWithNestedIncorrectDelimiters() {
        // Arrange
        String expressao = "{10 + [20 * (30 - 5])}";

        // Act
        boolean resultado = validadorExpressao.validar(expressao);

        // Assert
        assertFalse(resultado);
    }
}
