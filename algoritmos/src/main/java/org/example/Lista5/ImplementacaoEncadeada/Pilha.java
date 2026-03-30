package org.example.Lista5.ImplementacaoEncadeada;

public interface Pilha<T> {
    void push(T info);

    T pop();

    T peek();

    boolean estaVazio();

    void liberar();
}
