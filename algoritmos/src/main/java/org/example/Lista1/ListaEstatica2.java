package org.example.Lista1;

public class ListaEstatica2<T> {
    private T[] info;
    private int tamanho;

    // a) Construtor
    public ListaEstatica2() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    // b) Redimensionar
    private void redimensionar() {
        T[] novo = (T[]) new Object[info.length + 10];

        for (int i = 0; i < tamanho; i++) {
            novo[i] = info[i];
        }

        info = novo;
    }

    // c) Inserir
    public void inserir(T valor) {
        if (tamanho == info.length) {
            redimensionar();
        }

        info[tamanho] = valor;
        tamanho++;
    }

    // d) Exibir
    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(info[i] + " ");
        }
        System.out.println();
    }

    // e) Buscar
    public int buscar(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    // f) Retirar
    public void retirar(T valor) {
        int posicao = buscar(valor);

        if (posicao != -1) {
            for (int i = posicao; i < tamanho - 1; i++) {
                info[i] = info[i + 1];
            }
            tamanho--;
        }
    }

    // g) Liberar
    public void liberar() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    // h) Obter elemento
    public T obterElemento(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return info[posicao];
    }

    // i) Está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // j) Get tamanho
    public int getTamanho() {
        return tamanho;
    }

    // k) Método inverter
    public void inverter() {
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio < fim) {
            T temp = info[inicio];
            info[inicio] = info[fim];
            info[fim] = temp;

            inicio++;
            fim--;
        }
    }

    // l) toString
    @Override
    public String toString() {
        if (tamanho == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            sb.append(info[i]);
            if (i < tamanho - 1) {
                sb.append(",");
            }
        }

        return sb.toString();
    }
}
