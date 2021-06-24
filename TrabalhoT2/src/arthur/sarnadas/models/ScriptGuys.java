package arthur.sarnadas.models;

import arthur.sarnadas.enums.Tipos;

public class ScriptGuys extends Membros{
    public ScriptGuys(String username, String email, Tipos funcao) {
        super(username, email, funcao);
    }
    @Override
    public void postarReg() {
        System.out.println("Prazer em ajudar novos amigos de código!");
    }

    @Override
    public void postarExt() {
        System.out.println("QU3Ro_S3us_r3curs0s.py");
    }
    @Override
    public void apresentar() {
        System.out.println("Script Kid: " + getUsername());
    }
}
