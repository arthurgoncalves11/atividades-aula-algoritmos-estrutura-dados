package org.example.Lista5.ImplementacaoEstatica;

public class Main {
    public static void main(String[] args) {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(10);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        PilhaVetor<Integer> pilha2 = new PilhaVetor<>(5);
        pilha2.push(1);
        pilha2.push(2);
        pilha2.push(3);
        pilha2.push(4);
        pilha2.push(6);
        pilha.concaternar(pilha2);
        System.out.println(pilha.toString());

    }
}
