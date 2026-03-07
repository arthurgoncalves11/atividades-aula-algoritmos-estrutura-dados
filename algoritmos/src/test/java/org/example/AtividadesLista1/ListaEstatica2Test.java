package org.example.AtividadesLista1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEstatica2Test {

    // Caso 10 - Quantidade PAR
    @Test
    public void testeInverterPar() {
        ListaEstatica2<Integer> lista = new ListaEstatica2<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.inverter();

        assertEquals("20,15,10,5", lista.toString());
    }

    // Caso 11 - Quantidade ÍMPAR
    @Test
    public void testeInverterImpar() {
        ListaEstatica2<Integer> lista = new ListaEstatica2<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.inserir(25);

        lista.inverter();

        assertEquals("25,20,15,10,5", lista.toString());
    }

    // Teste extra - Lista vazia
    @Test
    public void testeInverterListaVazia() {
        ListaEstatica2<Integer> lista = new ListaEstatica2<>();

        lista.inverter();

        assertEquals("", lista.toString());
    }

    // Teste extra - Um único elemento
    @Test
    public void testeInverterUmElemento() {
        ListaEstatica2<Integer> lista = new ListaEstatica2<>();

        lista.inserir(10);

        lista.inverter();

        assertEquals("10", lista.toString());
    }
}