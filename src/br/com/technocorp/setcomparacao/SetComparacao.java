package br.com.technocorp.setcomparacao;

import java.util.HashSet;
import java.util.Set;

public class SetComparacao {

    public static void main(String[] args) {

        Set<SetFuncionario> conjunto = new HashSet<>();

        conjunto.add(new SetFuncionario("ROGER"));
        conjunto.add(new SetFuncionario("maria"));
        conjunto.add(new SetFuncionario("ROGER"));
        conjunto.add(new SetFuncionario("Bernardo"));



        for (SetFuncionario nomes : conjunto) {
            System.out.println(nomes);

        }

    }
}
