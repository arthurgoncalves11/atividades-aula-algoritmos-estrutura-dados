package org.example.Lista1;

public class ListaEstatica {

    private int[] info;
    private int tamanho;

    // a) Construtor
    public ListaEstatica() {
        info = new int[10];
        tamanho = 0;
    }

    // b) Redimensionar
    private void redimensionar() {
        int[] novo = new int[info.length + 10];

        for (int i = 0; i < info.length; i++) {
            novo[i] = info[i];
        }

        info = novo;
    }

    // c) Inserir
    public void inserir(int valor) {
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
    public int buscar(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // f) Retirar
    public void retirar(int valor) {
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
        info = new int[10];
        tamanho = 0;
    }

    // h) Obter elemento
    public int obterElemento(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return info[posicao];
    }

    // i) Esta vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // j) Get tamanho
    public int getTamanho() {
        return tamanho;
    }

    // k) toString
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