package arthur.sarnadas.models;

import arthur.sarnadas.interfaces.Apresentacao;
import arthur.sarnadas.interfaces.postarMensagem;
import arthur.sarnadas.enums.Tipos;

/**
 * Classe mãe, abstrata, que é herdada pelas categorias de membros.
 * Esta classe possui no construtor o username, email e funcao.
 * Ela implementa as interfaces PostarMensagem e Apresentacao.
 */

public abstract class Membros implements Apresentacao, postarMensagem {
    private String username;
    private String email;
    private Tipos funcao;

    /**
     * Construtor da classe Membros
     * @param username
     * @param email
     * @param funcao
     */

    public Membros(String username, String email,Tipos funcao) {
        this.username = username;
        this.email = email;
        this.funcao = funcao;
    }

    /**
     * Implemetacao dos metodos impostos pelas interfaces implementadas(contrato).
     */

    @Override
    public void apresentar() {
        System.out.println("O " + getFuncao() + " " + getUsername() + " pediu este relatorio:");
    }

    @Override
    public void postarRegular() {

    }

    @Override
    public void postarExtra() {

    }

    /**
     * Getter de username.
     * @return username
     */

    public String getUsername() {
        return username;
    }

    /**
     * Getter de email.
     * @return email
     */

    public String getEmail() {
        return email;
    }

    /**
     * Getter da funcao.
     * @return funcao
     */

    public Tipos getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        return "Membros{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", funcao=" + funcao +
                '}';
    }
}
