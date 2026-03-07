package org.example.Lista3;

public class ListaEncadeadaExercicio03<T> {

    private NoLista<T> primeiro;

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoLista<T> primeiro) {
        this.primeiro = primeiro;
    }

    public void inserir(T valor) {
        NoLista<T> novo = new NoLista<>(valor);
        novo.setProximo(primeiro);
        primeiro = novo;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public NoLista<T> buscar(T info) {
        if (estaVazia()) return null;
        NoLista<T> found = primeiro;
        while (found != null) {
            if (info.equals(found.getInfo())) {
                return found;
            }
            found = found.getProximo();
        }
        return null;
    }

    public void retirar(T info) {
        if (estaVazia()) return;
        NoLista<T> anterior = primeiro;

        if (info.equals(anterior.getInfo())) {
            primeiro = anterior.getProximo();
            return;
        }
        while (anterior.getProximo() != null) {
            NoLista<T> proximo = anterior.getProximo();
            if (info.equals(proximo.getInfo())) {
                anterior.setProximo(proximo.getProximo());
                return;
            }
            anterior = anterior.getProximo();
            proximo = proximo.getProximo();
        }

    }

    public Integer obterComprimento(){
        Integer comprimento = 0;
        if (estaVazia()) return comprimento;

        NoLista<T> current = primeiro;

        while (current != null) {
            comprimento++;
            current = current.getProximo();
        }
        return comprimento;
    }

    public NoLista<T> obterNo(Integer posicao) {
        if (estaVazia()) return null;
        if (posicao < 0) throw new IndexOutOfBoundsException("Posicao negativa: " + posicao);

        Integer comprimento = 0;
        NoLista<T> current = primeiro;

        while (current != null) {
            if (comprimento.equals(posicao)) {
                return current;
            }
            comprimento++;
            current = current.getProximo();
        }

        throw new IndexOutOfBoundsException("Posicao Invalida para o tamanho da lista: " + posicao + " maior que o comprimento da lista: " + --comprimento);
    }

    @Override
    public String toString() {
        if (estaVazia()) return "";
        StringBuilder sb = new StringBuilder();
        NoLista<T> current = primeiro;
        while (current != null) {
            sb.append(current.getInfo());
            if (current.getProximo() != null) {
                sb.append(", ");
            }
            current = current.getProximo();
        }
        return sb.toString();
    }


}
