package org.example.Lista5.ImplementacaoEncadeada;

public class Main {
    public static void main(String[] args) {
        PilhaLista<Integer> pilha = new PilhaLista<>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
//        pilha.concaternar(pilha2);
//        pilha.pop();
        pilha.liberar();
        System.out.println(pilha.toString());
    }
}
