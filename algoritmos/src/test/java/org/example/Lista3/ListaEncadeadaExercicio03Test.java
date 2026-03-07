package org.example.Lista3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEncadeadaExercicio03Test {

    @Test
    void checkEmptyList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();

        //Act
        boolean isEmpty = lista.estaVazia();

        //Assert
        assertTrue(isEmpty);
    }

    @Test
    void checkNonEmptyList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();
        lista.inserir(5);

        //Act
        boolean isEmpty = lista.estaVazia();

        //Assert
        assertFalse(isEmpty);
    }

    @Test
    void checkOneElementInList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();
        lista.inserir(5);

        //Act
        NoLista<Integer> noLista = lista.getPrimeiro();
        Integer tamanho = lista.obterComprimento();

        //Assert
        assertEquals(5, noLista.getInfo());
        assertEquals(1, tamanho);
        assertNull(noLista.getProximo());
    }

    @Test
    void checkOrderThreeElementsInList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();
        Integer primeiroValor = 5;
        Integer segundoValor = 10;
        Integer terceiroValor = 15;

        lista.inserir(primeiroValor);
        lista.inserir(segundoValor);
        lista.inserir(terceiroValor);

        //Act
        NoLista<Integer> primeiro = lista.getPrimeiro();
        NoLista<Integer> segundo = primeiro.getProximo();
        NoLista<Integer> terceiro = segundo.getProximo();

        //Assert
        assertEquals(terceiroValor, primeiro.getInfo());
        assertEquals(segundoValor, segundo.getInfo());
        assertEquals(primeiroValor, terceiro.getInfo());
        assertNull(terceiro.getProximo());
    }

    @Test
    void checkSearchForLastElementInList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();
        Integer primeiroValor = 5;
        Integer segundoValor = 10;
        Integer terceiroValor = 15;
        Integer quartoValor = 20;

        lista.inserir(primeiroValor);
        lista.inserir(segundoValor);
        lista.inserir(terceiroValor);
        lista.inserir(quartoValor);

        //Act
        NoLista<Integer> noFound = lista.buscar(quartoValor);

        //Assert
        assertEquals(quartoValor, noFound.getInfo());
    }

    @Test
    void checkSearchForMiddleElementInList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();
        Integer primeiroValor = 5;
        Integer segundoValor = 10;
        Integer terceiroValor = 15;
        Integer quartoValor = 20;

        lista.inserir(primeiroValor);
        lista.inserir(segundoValor);
        lista.inserir(terceiroValor);
        lista.inserir(quartoValor);

        //Act
        NoLista<Integer> noFound = lista.buscar(terceiroValor);

        //Assert
        assertEquals(terceiroValor, noFound.getInfo());
    }

    @Test
    void checkSearchForNotFoundElementInList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();
        Integer primeiroValor = 5;
        Integer segundoValor = 10;
        Integer terceiroValor = 15;
        Integer quartoValor = 20;

        lista.inserir(primeiroValor);
        lista.inserir(segundoValor);
        lista.inserir(terceiroValor);
        lista.inserir(quartoValor);

        //Act
        NoLista<Integer> noFound = lista.buscar(50);

        //Assert
        assertNull(noFound);
    }

    @Test
    void checkDeletedFirstElementInList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();
        Integer primeiroValor = 5;
        Integer segundoValor = 10;
        Integer terceiroValor = 15;
        Integer quartoValor = 20;

        lista.inserir(primeiroValor);
        lista.inserir(segundoValor);
        lista.inserir(terceiroValor);
        lista.inserir(quartoValor);

        //Act
        lista.retirar(quartoValor);

        //Assert
        NoLista<Integer> primeiro = lista.getPrimeiro();
        NoLista<Integer> segundo = primeiro.getProximo();
        NoLista<Integer> terceiro = segundo.getProximo();

        assertEquals(3, lista.obterComprimento());
        assertEquals(5, terceiro.getInfo());
        assertEquals(10, segundo.getInfo());
        assertEquals(15, primeiro.getInfo());
        assertNull(terceiro.getProximo());
    }

    @Test
    void checkDeletedMiddleElementInList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();
        Integer primeiroValor = 5;
        Integer segundoValor = 10;
        Integer terceiroValor = 15;
        Integer quartoValor = 20;

        lista.inserir(primeiroValor);
        lista.inserir(segundoValor);
        lista.inserir(terceiroValor);
        lista.inserir(quartoValor);

        //Act
        lista.retirar(terceiroValor);

        //Assert
        NoLista<Integer> primeiro = lista.getPrimeiro();
        NoLista<Integer> segundo = primeiro.getProximo();
        NoLista<Integer> terceiro = segundo.getProximo();

        assertEquals(3, lista.obterComprimento());
        assertEquals(5, terceiro.getInfo());
        assertEquals(10, segundo.getInfo());
        assertEquals(20, primeiro.getInfo());
        assertNull(terceiro.getProximo());
    }

    @Test
    void checkFirstPositionElementInList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();
        Integer primeiroValor = 5;
        Integer segundoValor = 10;
        Integer terceiroValor = 15;
        Integer quartoValor = 20;

        lista.inserir(primeiroValor);
        lista.inserir(segundoValor);
        lista.inserir(terceiroValor);
        lista.inserir(quartoValor);

        //Act
        NoLista<Integer> noFound = lista.obterNo(0);

        //Assert
        assertEquals(quartoValor, noFound.getInfo());
    }

    @Test
    void checkLastPositionElementInList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();
        Integer primeiroValor = 5;
        Integer segundoValor = 10;
        Integer terceiroValor = 15;
        Integer quartoValor = 20;

        lista.inserir(primeiroValor);
        lista.inserir(segundoValor);
        lista.inserir(terceiroValor);
        lista.inserir(quartoValor);

        //Act
        NoLista<Integer> noFound = lista.obterNo(3);

        //Assert
        assertEquals(primeiroValor, noFound.getInfo());
    }

    @Test
    void checkExceptionPositionElementInList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();
        Integer primeiroValor = 5;
        Integer segundoValor = 10;
        Integer terceiroValor = 15;
        Integer quartoValor = 20;

        lista.inserir(primeiroValor);
        lista.inserir(segundoValor);
        lista.inserir(terceiroValor);
        lista.inserir(quartoValor);

        //Act & Assert
        assertThrows(IndexOutOfBoundsException.class, () -> lista.obterNo(10));
    }

    @Test
    void checkLenghtEmptyList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();

        //Act
        Integer comprimento = lista.obterComprimento();

        //Assert
        assertEquals(0,comprimento);
    }

    @Test
    void checkNotLenghtEmptyList(){
        //Arrange
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();
        Integer primeiroValor = 5;
        Integer segundoValor = 10;
        Integer terceiroValor = 15;
        Integer quartoValor = 20;

        lista.inserir(primeiroValor);
        lista.inserir(segundoValor);
        lista.inserir(terceiroValor);
        lista.inserir(quartoValor);

        //Act
        Integer comprimento = lista.obterComprimento();

        //Assert
        assertEquals(4,comprimento);
    }



}