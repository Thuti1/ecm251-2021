package Sarnadas.Arthur;

public class pedra extends jogada {
    @Override
    public boolean verificarSeGanhei(jogada play) {
        return play instanceof tesoura;
    }

    @Override
    public boolean verificarSePerdi(jogada play) {
        return play instanceof papel;
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}
