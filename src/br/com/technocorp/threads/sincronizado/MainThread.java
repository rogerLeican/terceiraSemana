package br.com.technocorp.threads.sincronizado;

import br.com.technocorp.threads.TesteThread;

public class MainThread {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        ThreadSomar S1 = new ThreadSomar("1", array);
        ThreadSomar S2 = new ThreadSomar("2", array2);


        new Thread(() -> System.out.println("Sla")).start();

    }
}
