package arthur.sarnadas.models;

import arthur.sarnadas.enums.Tipos;

/**
 * Classe herdada de Membros do Tipo: Mobile Member ;
 * Importando o Enum Tipos
 * Com um construtor de sua classe e
 * metodos de postar mensagem tanto para o horario regular
 * quanto horario "extra".
 */

public class MobileMembers extends Membros{
    public MobileMembers(String username, String email, Tipos funcao) {
        super(username, email, funcao);
    }
    @Override
    public void postarRegular() {
        System.out.println("Happy Coding!");
    }

    @Override
    public void postarExtra() {
        System.out.println("Happy_C0d1ng. Maskers");
    }
}
