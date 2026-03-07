package org.example;

import org.example.Lista3.ListaEncadeadaExercicio03;
import org.example.Lista3.NoLista;

public class Main {
    public static void main(String[] args) {
        ListaEncadeadaExercicio03<Integer> lista = new ListaEncadeadaExercicio03<>();

        lista.inserir(5);
        lista.inserir(4);
        lista.inserir(3);
        lista.inserir(2);
        lista.inserir(1);

        System.out.println("Lista: " + lista.toString());

        System.out.println("Buscando 3: " + (lista.buscar(3) != null ? "Encontrado" : "Não encontrado"));

        lista.retirar(3);
        System.out.println("Lista apos retirar 3: " + lista.toString());

        System.out.println("Comprimento da lista: " + lista.obterComprimento());

        NoLista<Integer> no = lista.obterNo(2);

        System.out.println("No na posicao 2: " + (no != null ? no.getInfo() : "Posição inválida"));

    }
}