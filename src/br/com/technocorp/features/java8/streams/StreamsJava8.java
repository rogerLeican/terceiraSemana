package br.com.technocorp.features.java8.streams;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJava8 {

    public static void main(String[] args) {

        List<String> aprovados =  Arrays.asList("Lu","Gui","Luca","Ana");

        System.out.println("Usando o foreach");
        for ( String nome: aprovados ){
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator...");
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("\nUsando Streams...");
        aprovados.stream()
                .filter(s -> s.charAt(0) == 'L');
//        System.out.println(stream);
        System.out.println(aprovados);
//        stream.forEach(System.out::println);


    }
}
