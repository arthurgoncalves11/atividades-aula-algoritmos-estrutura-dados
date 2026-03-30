package org.example.Lista5;

import org.example.Lista5.ImplementacaoEncadeada.PilhaLista;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaListaTest {

    @Test
    void checkEstaVazioReturnsTrueForEmptyStack() {
        // Arrange
        PilhaLista<Integer> pilha = new PilhaLista<>();

        // Act & Assert
        assertTrue(pilha.estaVazio());
    }

    @Test
    void checkEstaVazioReturnsFalseAfterPush() {
        // Arrange
        PilhaLista<Integer> pilha = new PilhaLista<>();
        Integer numero = 10;

        // Act
        pilha.push(numero);

        // Assert
        assertFalse(pilha.estaVazio());
    }

    @Test
    void checkPushAndPopInLifoOrder() {
        // Arrange
        PilhaLista<Integer> pilha = new PilhaLista<>();
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
    void checkPeekReturnTopWithoutRemoving() {
        // Arrange
        PilhaLista<Integer> pilha = new PilhaLista<>();
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
        PilhaLista<Integer> pilha = new PilhaLista<>();
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
}