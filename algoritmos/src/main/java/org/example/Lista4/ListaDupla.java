package org.example.Lista4;

public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoListaDupla<T> primeiro) {
        this.primeiro = primeiro;
    }

    public void inserir(NoListaDupla<T> valor){
        if (primeiro!=null){
            primeiro.setAnterior(valor);
            valor.setProximo(primeiro);
            primeiro = valor;
            return;
        }

        valor.setProximo(primeiro);
        primeiro = valor;
    }

    public NoListaDupla<T> buscar(T valor){

        NoListaDupla<T> p = primeiro;

        while (p != null){
            if (p.getInfo().equals(valor)){
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T valor){
        NoListaDupla<T> anterior = primeiro.getAnterior();
        NoListaDupla<T> current = primeiro;
        NoListaDupla<T> proximo = primeiro.getProximo();
//        [5,10,15,20]
        while (current != null){
            if (current.getInfo().equals(valor)){
                if (proximo!=null){
                    proximo.setAnterior(anterior);
                }
                if (anterior!=null){
                    anterior.setProximo(proximo);
                }
                return;
            }
            current = proximo;
            proximo = current.getProximo();
            anterior = current.getAnterior();
        }
    }

    public void exibirOrdemInversa(){
        if (primeiro == null){
            System.out.println("[]");
            return;
        }

        NoListaDupla<T> current = primeiro;
        StringBuilder sb = new StringBuilder();
        while (current.getProximo() != null){
            current = current.getProximo();
        }

        sb.append("[");
        while (current != null){
            sb.append(current.getInfo());
            current = current.getAnterior();
            if (current!=null){
                sb.append(", ");
            }
        }

        sb.append("]");
        System.out.println(sb);
    }

    public void liberar(){
        NoListaDupla<T> current = primeiro;

        while (current != null){
            NoListaDupla<T> proximo = current.getProximo();
            current.setAnterior(null);
            current.setProximo(null);
            current = proximo;
        }

        primeiro = null;
    }

    @Override
    public String toString() {
        NoListaDupla<T> current = primeiro;
        StringBuilder sb = new StringBuilder();
        while (current != null){
            sb.append(current.getInfo());
            current = current.getProximo();
            if (current!=null){
                sb.append(", ");
            }
        }
        return sb.toString();
    }



}
