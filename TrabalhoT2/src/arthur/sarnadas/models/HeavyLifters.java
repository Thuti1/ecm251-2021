package arthur.sarnadas.models;

import arthur.sarnadas.enums.Tipos;

public class HeavyLifters extends Membros{
    public HeavyLifters(String username, String email, Tipos funcao) {
        super(username, email, funcao);
    }
    @Override
    public void postarReg() {
        System.out.println("Podem contar conosco!");
    }

    @Override
    public void postarExt() {
        System.out.println("N00b_qu3_n_Se_r3pita.bat");
    }
    @Override
    public void apresentar() {
        System.out.println("HL: " + getUsername());
    }
}
