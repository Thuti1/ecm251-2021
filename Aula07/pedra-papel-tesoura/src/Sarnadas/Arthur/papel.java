package Sarnadas.Arthur;

public class papel extends jogada {
    @Override
    public boolean verificarSeGanhei(jogada play) {
        return play instanceof pedra;
    }

    @Override
    public boolean verificarSePerdi(jogada play) {
        return play instanceof tesoura;
    }

    @Override
    public String toString() {
        return "Papel";
    }
}
