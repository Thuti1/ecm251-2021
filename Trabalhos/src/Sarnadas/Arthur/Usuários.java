package Sarnadas.Arthur;

public class Usuários {
    //Declarar as infos de cada usuário
    private String nome;
    private String senha;
    private String email;

    //Criar um construtor de usuários
    public Usuários(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    //Criar forma de exibir as infos de um certo usuário
    @Override
    public String toString() {
        return "Usuários{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
