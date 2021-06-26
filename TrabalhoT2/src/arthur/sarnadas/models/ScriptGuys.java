package arthur.sarnadas.models;

import arthur.sarnadas.enums.Tipos;

/**
 * Classe herdada de Membros do Tipo: Script Guy ;
 * Importando o Enum Tipos
 * Com um construtor de sua classe e
 * metodos de postar mensagem tanto para o horario regular
 * quanto horario "extra".
 */

public class ScriptGuys extends Membros{
    public ScriptGuys(String username, String email, Tipos funcao) {
        super(username, email, funcao);
    }
    @Override
    public void postarRegular() {
        System.out.println("Prazer em ajudar novos amigos de código!");
    }

    @Override
    public void postarExtra() {
        System.out.println("QU3Ro_S3us_r3curs0s.py");
    }
}
