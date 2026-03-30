package org.example.Lista5.CheckExpressaoAritmetica;

public class Main {
    public static void main(String[] args) {
        ExpressaoAritmetica expressaoAritmetica = new ExpressaoAritmetica();

        expressaoAritmetica.validar("10 + [20 / (10 – 20)]");

        expressaoAritmetica.validar("10 + [20 / (10 – 20])");
    }
}
