package org.example.Lista5.ImplementacaoEstatica;

import org.example.Lista5.ImplementacaoEstatica.Exception.PilhaCheiaException;
import org.example.Lista5.ImplementacaoEstatica.Exception.PilhaVaziaException;

import java.util.StringJoiner;

public class PilhaVetor<T> implements Pilha<T> {

    private T[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.limite = limite;
        this.info = (T[]) new Object[limite];
        this.tamanho = 0;
    }

    @Override
    public void push(T info) {
        int contador = tamanho;
        if (limite == tamanho) {
            throw new PilhaCheiaException();
        }
        while (contador>0) {
            this.info[contador] = this.info[contador-1];
            contador--;
        }
        this.info[0] = info;
        tamanho++;
    }

    @Override
    public T peek() {
        if (estaVazio()){
            throw new PilhaVaziaException();
        }
        return info[0];
    }

    @Override
    public T pop() {
        if (estaVazio()){
            throw new PilhaVaziaException();
        }
        T valor = info[0];
        ajustarTopo();
        tamanho--;
        return valor;
    }

    public void ajustarTopo(){
        int contador = 0;
        while (contador<tamanho-1) {
            this.info[contador] = this.info[contador+1];
            contador++;
        }
        info[tamanho-1] = null;
    }

    @Override
    public boolean estaVazio() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        while (info[0] != null) {
            pop();
        }
        tamanho = 0;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < tamanho; i++) {
            T valor = info[i];
            if (valor != null) {
                joiner.add(valor.toString());
            }
        }
        return joiner.toString();
    }

    public void concaternar(PilhaVetor<T> p){
        if (p.getTamanho()>limite-tamanho){
            throw new PilhaCheiaException();
        }
        for (int i = p.getTamanho()-1; i >= 0; i--) {
            push(p.getInfo()[i]);
        }
    }

    public T[] getInfo() {
        return info;
    }

    public void setInfo(T[] info) {
        this.info = info;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
