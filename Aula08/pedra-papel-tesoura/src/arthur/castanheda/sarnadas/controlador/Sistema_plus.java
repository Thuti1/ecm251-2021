package arthur.castanheda.sarnadas.controlador;

import arthur.castanheda.sarnadas.model.*;
import arthur.castanheda.sarnadas.model.classico.Papel;
import arthur.castanheda.sarnadas.model.classico.Pedra;
import arthur.castanheda.sarnadas.model.classico.Tesoura;
import arthur.castanheda.sarnadas.model.jeff.Lagarto;
import arthur.castanheda.sarnadas.model.jeff.Spoke;

import java.util.Random;
import java.util.Scanner;

public class Sistema_plus {
    private Jogador player1, player2;
    private Scanner scanner;
    private final Jogada[] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura(), new Spoke(), new Lagarto()};
    public Sistema_plus(){
        scanner = new Scanner(System.in);
        inicializarJogadores();
    }
    public void run(){
        boolean continuar = true;
        do{
            System.out.println(player1.getNome() + " vs "+player2.getNome());
            player1.setJogada(escolheJogada());
            player2.setJogada(sortearJogada());
            System.out.println("Jogada Player 1:" + player1.getJogada());
            System.out.println("Jogada Player 2:" + player2.getJogada());
            System.out.println("Resultado:" + player1.getJogada().verificarResultado(player2.getJogada()));
        }while(continuar);
    }

    private Jogada escolheJogada() {
        System.out.println("Informe sua jogada:");
        for (int i = 0; i < jogadas.length; i++) {
            System.out.println(""+i + ":" + jogadas[i]);
        }
        int escolha = scanner.nextInt();
        return jogadas[escolha];
    }

    private Jogada sortearJogada() {
        return jogadas[new Random().nextInt(jogadas.length)];
    }

    private void inicializarJogadores() {
        System.out.println("Informe um nome para o jogador 1:");
        String nome = scanner.next();
        this.player1 = new Jogador(nome, true);
        this.player2 = new Jogador("NPC");
    }
}
