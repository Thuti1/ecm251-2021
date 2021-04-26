package Sarnadas.Arthur;

public class jogada {
    public Resultado verificarResultado(jogada play) {
        if (verificarSeGanhei(play)){
            return Resultado.GANHOU;
        }
        if (verificarSePerdi(play)){
            return Resultado.PERDEU;
        }
        return Resultado.EMPATOU;
    }

    public boolean verificarSeGanhei(jogada play){
        return true;
    }

    public boolean verificarSePerdi(jogada play){
        return true;
    }
}
