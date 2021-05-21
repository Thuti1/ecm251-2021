package arthur.c.s.model.classico;

import arthur.c.s.model.Jogada;
import arthur.c.s.model.jeff.Spoke;
import arthur.c.s.model.jeff.Lagarto;

public class Tesoura extends Jogada {
    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
