package arthur.c.s.model.jeff;

import arthur.c.s.model.Jogada;
import arthur.c.s.model.classico.Papel;
import arthur.c.s.model.classico.Pedra;
import arthur.c.s.model.classico.Tesoura;

public class Spoke extends Jogada{
    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }
    @Override
    public String toString() {
        return "Spoke";
    }
}
