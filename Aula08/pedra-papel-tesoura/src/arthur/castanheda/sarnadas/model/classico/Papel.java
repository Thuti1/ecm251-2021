package arthur.castanheda.sarnadas.model.classico;

import arthur.castanheda.sarnadas.model.Jogada;

public class Papel extends Jogada {
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return jogada instanceof Pedra;
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return jogada instanceof Tesoura;
    }

    @Override
    public String toString() {
        return "Papel";
    }
}
