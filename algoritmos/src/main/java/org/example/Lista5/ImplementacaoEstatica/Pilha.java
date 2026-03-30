package org.example.Lista5.ImplementacaoEstatica;

public interface Pilha<T> {
    void push(T info);

    T pop();

    T peek();

    boolean estaVazio();

    void liberar();
}
