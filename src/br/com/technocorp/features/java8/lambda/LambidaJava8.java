package br.com.technocorp.features.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class LambidaJava8 {

    public static void main(String[] args) {

        List<Integer> inteiros = Arrays.asList(0, 5, 10, 15, 20, 30);


        for (Integer inteiro : inteiros) {
            System.out.println("Número: " + inteiro);
        }

        System.out.println("\n\n");

        List<Integer> inteiros2 = Arrays.asList(2, 4, 8, 16, 32, 64);
        inteiros2.forEach(valor->System.out.println("Número 2: " + valor));


    }

}
