package arthur.sarnadas.models;

// Biblioteca para leitura de .CSV
import java.io.BufferedReader;
import java.io.FileReader;

import arthur.sarnadas.interfaces.Apresentacao;
import arthur.sarnadas.interfaces.postarMensagem;
import arthur.sarnadas.enums.Horarios;
import arthur.sarnadas.enums.Tipos;

/**
 * Utilizamos o email como ID, por maior facilidade de identificação
 */

public abstract class Membros implements Apresentacao, postarMensagem {
    private String username;
    private String email;
    private Tipos funcao;

    public Membros(String username, String email, Tipos funcao) {
        this.username = username;
        this.email = email;
        this.funcao = funcao;
    }

    public Tipos getFuncao() {
        return funcao;
    }

    public void setFuncao(Tipos funcao) {
        this.funcao = funcao;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
