package org.example.Lista4;

public class Main {

    public static void main(String[] args) {

        ListaDupla<Integer> listaDupla = new ListaDupla<>();

        NoListaDupla<Integer> item1 = new NoListaDupla<>();
        item1.setInfo(5);
        NoListaDupla<Integer> item2 = new NoListaDupla<>();
        item2.setInfo(4);
        NoListaDupla<Integer> item3 = new NoListaDupla<>();
        item3.setInfo(3);
        NoListaDupla<Integer> item4 = new NoListaDupla<>();
        item4.setInfo(2);
        NoListaDupla<Integer> item5 = new NoListaDupla<>();
        item5.setInfo(1);
        NoListaDupla<Integer> item6 = new NoListaDupla<>();
        item6.setInfo(0);

        listaDupla.inserir(item1);
        listaDupla.inserir(item2);
        listaDupla.inserir(item3);
        listaDupla.inserir(item4);
        listaDupla.inserir(item5);
        listaDupla.inserir(item6);

        listaDupla.exibirOrdemInversa();

        String result = listaDupla.toString();
        System.out.println(result);
    }

}
