package org.example.Lista5.ImplementacaoEstatica;

import org.example.Lista5.ImplementacaoEstatica.Exception.PilhaCheiaException;
import org.example.Lista5.ImplementacaoEstatica.Exception.PilhaVaziaException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaVetorTest {

    @Test
    void checkEstaVazioReturnsTrueForEmptyStack() {
        // Arrange
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);

        // Act & Assert
        assertTrue(pilha.estaVazio());
    }

    @Test
    void checkEstaVazioReturnsFalseAfterPush() {
        // Arrange
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        Integer numero = 10;

        // Act
        pilha.push(numero);

        // Assert
        assertFalse(pilha.estaVazio());
    }

    @Test
    void checkPushAndPopInLifoOrder() {
        // Arrange
        PilhaVetor<Integer> pilha = new PilhaVetor<>(10);
        Integer numeroUm = 10;
        Integer numeroDois = 20;
        Integer numeroTres = 30;

        pilha.push(numeroUm);
        pilha.push(numeroDois);
        pilha.push(numeroTres);

        // Act & Assert
        assertEquals(numeroTres, pilha.pop());
        assertEquals(numeroDois, pilha.pop());
        assertEquals(numeroUm, pilha.pop());
        assertTrue(pilha.estaVazio());
    }

    @Test
    void checkPushThrowsPilhaCheiaExceptionWhenFull() {
        // Arrange
        PilhaVetor<Integer> pilha = new PilhaVetor<>(3);
        Integer numeroUm = 10;
        Integer numeroDois = 20;
        Integer numeroTres = 30;
        Integer numeroQuatro = 40;

        pilha.push(numeroUm);
        pilha.push(numeroDois);
        pilha.push(numeroTres);

        // Act & Assert
        assertThrows(PilhaCheiaException.class, () -> pilha.push(numeroQuatro));
    }

    @Test
    void checkPopThrowsPilhaVaziaExceptionWhenEmpty() {
        // Arrange
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);

        // Act & Assert
        assertThrows(PilhaVaziaException.class, () -> pilha.pop());
    }

    @Test
    void checkPeekReturnTopWithoutRemoving() {
        // Arrange
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        Integer numeroUm = 10;
        Integer numeroDois = 20;
        Integer numeroTres = 30;

        pilha.push(numeroUm);
        pilha.push(numeroDois);
        pilha.push(numeroTres);

        // Act
        Integer topo = pilha.peek();

        // Assert
        assertEquals(numeroTres, topo);
        assertEquals(numeroTres, pilha.pop());
    }

    @Test
    void checkLiberarRemovesAllElements() {
        // Arrange
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        Integer numeroUm = 10;
        Integer numeroDois = 20;
        Integer numeroTres = 30;

        pilha.push(numeroUm);
        pilha.push(numeroDois);
        pilha.push(numeroTres);

        // Act
        pilha.liberar();

        // Assert
        assertTrue(pilha.estaVazio());
    }

    @Test
    void checkConcaternarMergesStacksAndKeepsOriginalIntact() {
        // Arrange
        PilhaVetor<Integer> pilha1 = new PilhaVetor<>(10);
        Integer p1NumeroUm = 10;
        Integer p1NumeroDois = 20;
        Integer p1NumeroTres = 30;

        pilha1.push(p1NumeroUm);
        pilha1.push(p1NumeroDois);
        pilha1.push(p1NumeroTres);

        PilhaVetor<Integer> pilha2 = new PilhaVetor<>(10);
        Integer p2NumeroUm = 40;
        Integer p2NumeroDois = 50;

        pilha2.push(p2NumeroUm);
        pilha2.push(p2NumeroDois);

        // Act
        pilha1.concaternar(pilha2);

        // Assert
        assertEquals("50, 40, 30, 20, 10", pilha1.toString());
        assertEquals("50, 40", pilha2.toString());
    }
}