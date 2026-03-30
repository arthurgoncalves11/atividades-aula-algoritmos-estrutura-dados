package org.example.Lista5.ImplementacaoEncadeada;

import org.example.Lista3.ListaEncadeadaExercicio03;
import org.example.Lista3.NoLista;
import org.example.Lista5.ImplementacaoEncadeada.Exception.PilhaVaziaException;

import java.util.StringJoiner;

public class PilhaLista<T> implements Pilha<T> {

    private ListaEncadeadaExercicio03<T> lista;

    public PilhaLista() {
        this.lista = new ListaEncadeadaExercicio03<>();
    }

    @Override
    public void push(T info) {
        lista.inserir(info);
    }

    @Override
    public T pop() {
        if (estaVazio()){
            throw new PilhaVaziaException();
        }
        T topo = lista.getPrimeiro().getInfo();
        lista.retirar(topo);
        return topo;
    }

    @Override
    public T peek() {
        return lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazio() {
        return lista.estaVazia();
    }

    @Override
    public void liberar() {
        while (lista.getPrimeiro()!=null){
            lista.retirar(lista.getPrimeiro().getInfo());
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ");
        NoLista<T> atual = lista.getPrimeiro();
        while (atual != null){
            T valor = atual.getInfo();
            if (valor != null) {
                joiner.add(valor.toString());
            }
            atual = atual.getProximo();
        }
        return joiner.toString();
    }

    public ListaEncadeadaExercicio03<T> getLista() {
        return lista;
    }

    public void setLista(ListaEncadeadaExercicio03<T> lista) {
        this.lista = lista;
    }
}
