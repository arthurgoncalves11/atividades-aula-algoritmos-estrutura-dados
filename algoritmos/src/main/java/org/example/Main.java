package org.example;

import org.example.AtividadesLista1.ListaEstatica;

public class Main {
    public static void main(String[] args) {
        // Caso 1
        ListaEstatica lista1 = new ListaEstatica();
        lista1.inserir(5);
        lista1.inserir(10);
        lista1.inserir(15);
        lista1.inserir(20);
        System.out.println("Caso 1: " + lista1.toString()); // 5,10,15,20

        // Caso 2
        System.out.println("Caso 2: " + lista1.getTamanho()); // 4

        // Caso 3
        System.out.println("Caso 3: " + lista1.buscar(15)); // 2

        // Caso 4
        System.out.println("Caso 4: " + lista1.buscar(30)); // -1

        // Caso 5
        lista1.retirar(10);
        System.out.println("Caso 5: " + lista1.toString()); // 5,15,20
        System.out.println("Tamanho: " + lista1.getTamanho()); // 3

        // Caso 6
        ListaEstatica lista2 = new ListaEstatica();
        for (int i = 1; i <= 15; i++) {
            lista2.inserir(i);
        }
        System.out.println("Caso 6: " + lista2.toString());
        System.out.println("Tamanho: " + lista2.getTamanho()); // 15

        // Caso 7
        ListaEstatica lista3 = new ListaEstatica();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);
        System.out.println("Caso 7: " + lista3.obterElemento(3)); // 20

        // Caso 8
        try {
            lista3.obterElemento(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caso 8: Exceção lançada com sucesso!");
        }

        // Caso 9
        lista3.liberar();
        System.out.println("Caso 9: " + lista3.estaVazia()); // true
    }
}