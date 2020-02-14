package br.com.technocorp.threads;

public class Threads implements Runnable{

    private String nome;
    private int tempo;

    public Threads(String nome, int tempo) {

        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();

    }


    public void run() {

        try {
            for ( int i = 0; i <6 ; i++ ) {
                System.out.println(nome + " Contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + " Terminou a execução ");
    }

}
