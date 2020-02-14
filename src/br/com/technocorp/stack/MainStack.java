package br.com.technocorp.stack;

import br.com.technocorp.setcomparacao.SetFuncionario;

public class MainStack {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(5);


        pilha.adicionar( new Funcionario("roger"));
        pilha.adicionar(new Funcionario("maria"));
        pilha.adicionar(new Funcionario("joao"));


        pilha.topo();

        pilha.remove();

        pilha.topo();

        pilha.adicionar(new Funcionario("roberto"));

        pilha.topo();

        pilha.remove();//removendo Rogerto

        pilha.topo();//mostra MARIA

        pilha.remove(); //removendo MARIA

        pilha.topo(); //mojstra ROGER

        pilha.remove(); //removendo ultimo elemento

        pilha.topo();
        pilha.topo();




   //     pilha.topo();
//      pilha.remove();
//      pilha.remove();

        System.out.println("\n\n\n");
        System.out.println(pilha);


    }
}
