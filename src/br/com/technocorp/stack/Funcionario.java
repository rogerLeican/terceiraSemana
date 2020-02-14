package br.com.technocorp.stack;

public class Funcionario {

    private String nome;

    Funcionario(String nome){
        this.nome = nome;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof SetFuncionario)) return false;
//        SetFuncionario that = (SetFuncionario) o;
//        return nome.equals(that.nome);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nome);
//
//    }

    @Override
    public String toString() {
        return "SetFuncionario{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
