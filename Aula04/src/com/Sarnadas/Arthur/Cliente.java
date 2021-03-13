package com.Sarnadas.Arthur;

public class Cliente {
    public Cliente(String nome){
        this.nome = nome;
    }
    private String nome;
    private String sobrenome;
    private String cpf;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
