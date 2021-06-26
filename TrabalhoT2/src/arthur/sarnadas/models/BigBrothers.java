package arthur.sarnadas.models;

import arthur.sarnadas.enums.Tipos;

/**
 * Classe herdada de Membros do Tipo: Big Brother ;
 * Importando o Enum Tipos
 * Com um construtor de sua classe e
 * metodos de postar mensagem tanto para o horario regular
 * quanto horario "extra".
 */

public class BigBrothers extends Membros{
    public BigBrothers(String username, String email, Tipos funcao) {
        super(username, email, funcao);
    }

    @Override
    public void postarRegular() {
        System.out.println("Sempre ajudando as pessoas membros ou não S2!");
    }

    @Override
    public void postarExtra() {
        System.out.println("...");
    }
}
