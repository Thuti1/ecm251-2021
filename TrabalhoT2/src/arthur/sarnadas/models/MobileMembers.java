package arthur.sarnadas.models;

/**
 * Classe herdada de Membros do Tipo: Mobile Member
 * Importando o Enum Tipos
 * Com um construtor de sua classe e
 * métodos de postar mensagem tanto para o horário regular
 * quanto horário "extra".
 */

import arthur.sarnadas.enums.Tipos;

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
    @Override
    public void apresentar() {
        System.out.println("jogador de Free Fire: " + getUsername());
    }
}
