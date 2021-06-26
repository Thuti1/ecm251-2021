package arthur.sarnadas.models;

import arthur.sarnadas.enums.Tipos;

/**
 * Classe herdada de Membros do Tipo: Heavy Lifter ;
 * Importando o Enum Tipos
 * Com um construtor de sua classe e
 * metodos de postar mensagem tanto para o horario regular
 * quanto horario "extra".
 */

public class HeavyLifters extends Membros{
    public HeavyLifters(String username, String email, Tipos funcao) {
        super(username, email, funcao);
    }
    @Override
    public void postarRegular() {
        System.out.println("Podem contar conosco!");
    }

    @Override
    public void postarExtra() {
        System.out.println("N00b_qu3_n_Se_r3pita.bat");
    }
}
