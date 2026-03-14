package org.example.Lista4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaDuplaTest {

    @Test
    void checkOrderAscAndOrderDescElementInList(){
        //Arrange
        ListaDupla<Integer> lista = new ListaDupla<>();
        Integer numeroUm = 5;
        Integer numeroDois = 10;
        Integer numeroTres = 15;
        Integer numeroQuatro = 20;

        NoListaDupla<Integer> no1 = new NoListaDupla<>();
        no1.setInfo(numeroUm);
        lista.inserir(no1);

        NoListaDupla<Integer> no2 = new NoListaDupla<>();
        no2.setInfo(numeroDois);
        lista.inserir(no2);


        NoListaDupla<Integer> no3 = new NoListaDupla<>();
        no3.setInfo(numeroTres);
        lista.inserir(no3);

        NoListaDupla<Integer> no4 = new NoListaDupla<>();
        no4.setInfo(numeroQuatro);
        lista.inserir(no4);

        //Act
        NoListaDupla<Integer> primeiro = lista.getPrimeiro();

        //Assert
        assertEquals(numeroQuatro, primeiro.getInfo());
        primeiro = primeiro.getProximo();
        assertEquals(numeroTres, primeiro.getInfo());
        primeiro = primeiro.getProximo();
        assertEquals(numeroDois, primeiro.getInfo());
        primeiro = primeiro.getProximo();
        assertEquals(numeroUm, primeiro.getInfo());

        assertEquals(numeroUm, primeiro.getInfo());
        primeiro = primeiro.getAnterior();
        assertEquals(numeroDois, primeiro.getInfo());
        primeiro = primeiro.getAnterior();
        assertEquals(numeroTres, primeiro.getInfo());
        primeiro = primeiro.getAnterior();
        assertEquals(numeroQuatro, primeiro.getInfo());

    }

    @Test
    void checkSearchFirstElementInList() {
        //Arrange
        ListaDupla<Integer> lista = new ListaDupla<>();
        Integer numeroUm = 5;
        Integer numeroDois = 10;
        Integer numeroTres = 15;
        Integer numeroQuatro = 20;

        NoListaDupla<Integer> no1 = new NoListaDupla<>();
        no1.setInfo(numeroUm);
        lista.inserir(no1);

        NoListaDupla<Integer> no2 = new NoListaDupla<>();
        no2.setInfo(numeroDois);
        lista.inserir(no2);


        NoListaDupla<Integer> no3 = new NoListaDupla<>();
        no3.setInfo(numeroTres);
        lista.inserir(no3);

        NoListaDupla<Integer> no4 = new NoListaDupla<>();
        no4.setInfo(numeroQuatro);
        lista.inserir(no4);

        //Act
        NoListaDupla<Integer> found = lista.buscar(numeroQuatro);

        //Assert
        assertEquals(no4,found);
    }


    @Test
    void checkSearchMiddleElementInList() {
        //Arrange
        ListaDupla<Integer> lista = new ListaDupla<>();
        Integer numeroUm = 5;
        Integer numeroDois = 10;
        Integer numeroTres = 15;
        Integer numeroQuatro = 20;

        NoListaDupla<Integer> no1 = new NoListaDupla<>();
        no1.setInfo(numeroUm);
        lista.inserir(no1);

        NoListaDupla<Integer> no2 = new NoListaDupla<>();
        no2.setInfo(numeroDois);
        lista.inserir(no2);


        NoListaDupla<Integer> no3 = new NoListaDupla<>();
        no3.setInfo(numeroTres);
        lista.inserir(no3);

        NoListaDupla<Integer> no4 = new NoListaDupla<>();
        no4.setInfo(numeroQuatro);
        lista.inserir(no4);

        //Act
        NoListaDupla<Integer> found = lista.buscar(numeroDois);

        //Assert
        assertEquals(no2,found);
    }



    @Test
    void checkRemoveFirstElementInList() {
        //Arrange
        ListaDupla<Integer> lista = new ListaDupla<>();
        Integer numeroUm = 5;
        Integer numeroDois = 10;
        Integer numeroTres = 15;
        Integer numeroQuatro = 20;

        NoListaDupla<Integer> no1 = new NoListaDupla<>();
        no1.setInfo(numeroUm);
        lista.inserir(no1);

        NoListaDupla<Integer> no2 = new NoListaDupla<>();
        no2.setInfo(numeroDois);
        lista.inserir(no2);


        NoListaDupla<Integer> no3 = new NoListaDupla<>();
        no3.setInfo(numeroTres);
        lista.inserir(no3);

        NoListaDupla<Integer> no4 = new NoListaDupla<>();
        no4.setInfo(numeroQuatro);
        lista.inserir(no4);

        //Act
        lista.retirar(numeroQuatro);

        //Assert
        NoListaDupla<Integer> first = lista.getPrimeiro();
        assertEquals(numeroTres, first.getInfo());

        first = first.getProximo();
        assertEquals(numeroDois, first.getInfo());

        first = first.getProximo();
        assertEquals(numeroUm, first.getInfo());

        first = first.getProximo();
        assertNull(first);

        //Inverso
        NoListaDupla<Integer> last = no1;
        assertEquals(numeroUm, last.getInfo());

        last = last.getAnterior();
        assertEquals(numeroDois, last.getInfo());

        last = last.getAnterior();
        assertEquals(numeroTres, last.getInfo());

        last = last.getAnterior();
        assertNull(last);
    }

    @Test
    void checkRemoveMiddleElementInList() {
        //Arrange
        ListaDupla<Integer> lista = new ListaDupla<>();
        Integer numeroUm = 5;
        Integer numeroDois = 10;
        Integer numeroTres = 15;
        Integer numeroQuatro = 20;

        NoListaDupla<Integer> no1 = new NoListaDupla<>();
        no1.setInfo(numeroUm);
        lista.inserir(no1);

        NoListaDupla<Integer> no2 = new NoListaDupla<>();
        no2.setInfo(numeroDois);
        lista.inserir(no2);

        NoListaDupla<Integer> no3 = new NoListaDupla<>();
        no3.setInfo(numeroTres);
        lista.inserir(no3);

        NoListaDupla<Integer> no4 = new NoListaDupla<>();
        no4.setInfo(numeroQuatro);
        lista.inserir(no4);

        //Act
        lista.retirar(10);

        //Assert
        NoListaDupla<Integer> first = lista.getPrimeiro();
        assertEquals(numeroQuatro, first.getInfo());

        first = first.getProximo();
        assertEquals(numeroTres, first.getInfo());

        first = first.getProximo();
        assertEquals(numeroUm, first.getInfo());

        first = first.getProximo();
        assertNull(first);

        //Inverso
        NoListaDupla<Integer> last = no1;
        assertEquals(numeroUm, last.getInfo());

        last = last.getAnterior();
        assertEquals(numeroTres, last.getInfo());

        last = last.getAnterior();
        assertEquals(numeroQuatro, last.getInfo());

        last = last.getAnterior();
        assertNull(last);
    }

    @Test
    void checkRemoveLastElementInList() {
        //Arrange
        ListaDupla<Integer> lista = new ListaDupla<>();
        Integer numeroUm = 5;
        Integer numeroDois = 10;
        Integer numeroTres = 15;
        Integer numeroQuatro = 20;

        NoListaDupla<Integer> no1 = new NoListaDupla<>();
        no1.setInfo(numeroUm);
        lista.inserir(no1);

        NoListaDupla<Integer> no2 = new NoListaDupla<>();
        no2.setInfo(numeroDois);
        lista.inserir(no2);

        NoListaDupla<Integer> no3 = new NoListaDupla<>();
        no3.setInfo(numeroTres);
        lista.inserir(no3);

        NoListaDupla<Integer> no4 = new NoListaDupla<>();
        no4.setInfo(numeroQuatro);
        lista.inserir(no4);

        //Act
        lista.retirar(10);

        //Assert
        NoListaDupla<Integer> first = lista.getPrimeiro();
        assertEquals(numeroQuatro, first.getInfo());

        first = first.getProximo();
        assertEquals(numeroTres, first.getInfo());

        first = first.getProximo();
        assertEquals(numeroUm, first.getInfo());

        first = first.getProximo();
        assertNull(first);

        //Inverso
        NoListaDupla<Integer> last = no1;
        assertEquals(numeroUm, last.getInfo());

        last = last.getAnterior();
        assertEquals(numeroTres, last.getInfo());

        last = last.getAnterior();
        assertEquals(numeroQuatro, last.getInfo());

        last = last.getAnterior();
        assertNull(last);
    }

    @Test
    void checkNullValuesInNextAndPrevious() {
        //Arrange
        ListaDupla<Integer> lista = new ListaDupla<>();
        Integer numeroUm = 5;
        Integer numeroDois = 10;
        Integer numeroTres = 15;
        Integer numeroQuatro = 20;

        NoListaDupla<Integer> no1 = new NoListaDupla<>();
        no1.setInfo(numeroUm);
        lista.inserir(no1);

        NoListaDupla<Integer> no2 = new NoListaDupla<>();
        no2.setInfo(numeroDois);
        lista.inserir(no2);

        NoListaDupla<Integer> no3 = new NoListaDupla<>();
        no3.setInfo(numeroTres);
        lista.inserir(no3);

        NoListaDupla<Integer> no4 = new NoListaDupla<>();
        no4.setInfo(numeroQuatro);
        lista.inserir(no4);

        //Act
        lista.liberar();

        //Assert
        assertNull(lista.getPrimeiro());
        assertNull(no1.getProximo());
        assertNull(no1.getAnterior());

        assertNull(no2.getProximo());
        assertNull(no2.getAnterior());

        assertNull(no3.getProximo());
        assertNull(no3.getAnterior());

        assertNull(no4.getProximo());
        assertNull(no4.getAnterior());
    }
}