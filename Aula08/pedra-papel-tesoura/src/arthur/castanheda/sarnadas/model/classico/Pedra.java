package arthur.castanheda.sarnadas.model.classico;

import arthur.castanheda.sarnadas.model.Jogada;

public class Pedra extends Jogada{
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Tesoura);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return jogada instanceof Papel;
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}
