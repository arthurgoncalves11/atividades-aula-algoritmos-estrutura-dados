package org.example.Lista5.CheckExpressaoAritmetica;

import org.example.Lista5.ImplementacaoEncadeada.PilhaLista;

public class ExpressaoAritmetica {

    public boolean validar(String expressao) {
        PilhaLista<Character> pilha = new PilhaLista<>();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pilha.estaVazio()) {
                    return false;
                }
                char topo = pilha.pop();
                if (!corresponde(topo, c)) {
                    return false;
                }
            }
        }

        return pilha.estaVazio();
    }

    private boolean corresponde(char abertura, char fechamento) {
        return (abertura == '(' && fechamento == ')')
                || (abertura == '[' && fechamento == ']')
                || (abertura == '{' && fechamento == '}');
    }

}
