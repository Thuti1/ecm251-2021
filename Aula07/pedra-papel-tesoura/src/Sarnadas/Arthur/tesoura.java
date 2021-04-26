package Sarnadas.Arthur;

public class tesoura extends jogada {
    @Override
    public boolean verificarSeGanhei(jogada play) {
        return play instanceof papel;
    }

    @Override
    public boolean verificarSePerdi(jogada play) {
        return play instanceof pedra;
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
