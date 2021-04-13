package Sarnadas.Arthur;

public class Pessoa {
    private final String nome;
    private final String cpf;
    public int mudar;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    /*
    public void mudaTudo(){
        nome = "Saitama";
        cpf = "111.111.111-11";
    }
    */

    public String Ola(){
        return "Olá! Eu sou " + this.nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", CPF='" + cpf + '\'' +
                ", mudar=" + mudar +
                '}';
    }
}
