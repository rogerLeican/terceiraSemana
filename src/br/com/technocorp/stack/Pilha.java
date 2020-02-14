package br.com.technocorp.stack;

import br.com.technocorp.stack.exceptionpersonalizada.PilhaVaziaException;

import java.util.ArrayList;
import java.util.Arrays;

public class Pilha<T> extends ArrayList {

    private Object[] elementos;
    private int tamanho;
    private int cont = 0;

    Pilha(int capacidade) {
        this.tamanho = capacidade;
        this.elementos = new Object[tamanho];
    }

    public int getCont() {
        return cont;
    }

    public boolean adicionar(Object objetos) {
        if (cont <= this.tamanho) {
            this.elementos[cont] = objetos;
            cont++;
            return true;
        }
        return false;

    }

    public void topo() {
        if (this.elementos[0] != null) {
            if (getCont() >= 0 && this.elementos[cont - 1] != null) {

                System.out.println(this.elementos[getCont() - 1]);
            }
        } else {
            System.out.println("PILHA VAZIA!!");
        }

    }

    public boolean remove() {
        if (this.elementos[0] == null) {
            throw new PilhaVaziaException();
        } else
            this.elementos[getCont() - 1] = null;
        cont--;
        return true;
    }


    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
}
