package br.com.technocorp.threads.sincronizado;

public class ThreadSomar implements Runnable {

    private String nome;
    private int[] nuns;
    private static  Calculadora calc = new Calculadora();

    public ThreadSomar(String nome, int[] nuns){
        this.nome = nome;
        this.nuns = nuns;
        new Thread(this, nome).start();
    }

    public void run(){

        System.out.println(this.nome + "começou");

        int soma = calc.somaArray(this.nuns);

        System.out.println(" Resultado " + this.nome + " foi: " + soma);

        System.out.println(this.nome + " Terminouuu " );


    }

}
