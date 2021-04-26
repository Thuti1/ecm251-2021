package Sarnadas.Arthur;

public class jogador {
    private String nome;
    private boolean ehHumano;
    private jogada play;

    public jogador(String nome, boolean ehHumano) {
        this.nome = nome;
        this.ehHumano = ehHumano;
    }

    public jogador(String nome) {
        this.nome = nome;
        this.ehHumano = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEhHumano() {
        return ehHumano;
    }

    public jogada getPlay() {
        return play;
    }

    public void setPlay(jogada play) {
        this.play = play;
    }
}
