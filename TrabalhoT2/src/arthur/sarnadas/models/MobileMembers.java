package arthur.sarnadas.models;

import arthur.sarnadas.enums.Tipos;

public class MobileMembers extends Membros{
    public MobileMembers(String username, String email, Tipos funcao) {
        super(username, email, funcao);
    }
    @Override
    public void postarReg() {
        System.out.println("Happy Coding!");
    }

    @Override
    public void postarExt() {
        System.out.println("Happy_C0d1ng. Maskers");
    }
    @Override
    public void apresentar() {
        System.out.println("jogador de Free Fire: " + getUsername());
    }
}
