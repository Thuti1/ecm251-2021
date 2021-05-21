package arthur.castanheda.sarnadas.model.classico;

import arthur.castanheda.sarnadas.model.Jogada;
import arthur.castanheda.sarnadas.model.jeff.Lagarto;
import arthur.castanheda.sarnadas.model.jeff.Spoke;

public class Tesoura extends Jogada {
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Spoke);
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
