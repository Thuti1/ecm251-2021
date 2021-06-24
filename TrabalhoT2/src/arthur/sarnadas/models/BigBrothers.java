package arthur.sarnadas.models;

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
