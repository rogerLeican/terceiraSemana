package br.com.technocorp.features.java9.takewhile;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TakeWhile {
    public static void main(String[] args) {

     System.out.println("\nUsando o takeWhile");
     Stream.of (1,3,5,6,8,6,2,18).takeWhile (no -> no <= 5).forEach (System.out :: println);

     System.out.println("\nUsando o DropWhile");
     Stream.of (1,3,5,6,8,6,2,18).dropWhile(no -> no <= 5).forEach (System.out :: println);

    }
}
