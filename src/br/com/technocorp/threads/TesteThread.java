package br.com.technocorp.threads;

public class TesteThread {

    public static void main(String[] args) {
        Threads thread = new Threads("thread 1",600);
        Threads thread2 = new Threads("thread 2",900);
        //Threads thread2 = new Threads("thread 2",900);
//        Thread t1 = new Thread(thread);
//        t1.start();
    }
}
