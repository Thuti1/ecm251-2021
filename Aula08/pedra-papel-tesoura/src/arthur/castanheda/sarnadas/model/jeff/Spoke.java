package arthur.castanheda.sarnadas.model.jeff;

import arthur.castanheda.sarnadas.model.Jogada;
import arthur.castanheda.sarnadas.model.classico.Papel;
import arthur.castanheda.sarnadas.model.classico.Pedra;
import arthur.castanheda.sarnadas.model.classico.Tesoura;

public class Spoke extends Jogada {
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Tesoura);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public String toString() {
        return "Spoke";
    }
}
