package br.com.technocorp.features.java9.metodofactory;

import java.util.ArrayList;
import java.util.List;

public class MetoFactori {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("roger");
        myList.add("Bernador");
        myList.add("Maria");
        myList.add("Ana");



      List<String> list =
              List.of("roger","maria","roberto");


      list.addAll(List.of("roger","maria","roberto"));

    }


}
