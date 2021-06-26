package arthur.sarnadas.models;

/**
 * Classe herdada de Membros do Tipo: Big Brother
 * Importando o Enum Tipos
 * Com um construtor de sua classe e
 * métodos de postar mensagem tanto para o horário regular
 * quanto horário "extra".
 */

import arthur.sarnadas.enums.Tipos;

public class BigBrothers extends Membros{
    public BigBrothers(String username, String email, Tipos funcao) {
        super(username, email, funcao);
    }

    @Override
    public void postarReg() {
        System.out.println("Sempre ajudando as pessoas membros ou não S2!");
    }

    @Override
    public void postarExt() {
        System.out.println("...");
    }
    @Override
    public void apresentar() {
        System.out.println("BRAZIIIIIILL: " + getUsername());
    }
}
