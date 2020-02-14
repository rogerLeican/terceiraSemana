package br.com.technocorp.stack.exceptionpersonalizada;

public class PilhaVaziaException extends RuntimeException {

   // private Object nomeObjeto;

//    public PilhaVaziaException(Object nomeObjeto){
//        this.nomeObjeto = nomeObjeto;
//    }

    public String getMessage(){
       return String.format("Não é possivel executar essa ação, pois a pilha está vazia!!");
    }


}
