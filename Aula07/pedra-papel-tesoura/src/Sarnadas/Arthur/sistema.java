package Sarnadas.Arthur;

import java.util.Random;
import java.util.Scanner;

public class sistema {
    private jogador player1,player2;
    private Scanner scanner;
    private jogada [] jogadas = new jogada[]{new pedra(),new papel(), new tesoura()};
    public sistema(){
        scanner = new Scanner(System.in);
        inicializarJogadores();
    }

    public void run(){
        boolean continuar = true;
        do {
            System.out.println(player1.getNome() + " vs " + player2.getNome());
            player1.setPlay(escolheJogada());
            player2.setPlay(sortearJogada());
            System.out.println("Jogada Player1: " + player1.getPlay());
            System.out.println("Jogada Player2: " + player2.getPlay());
            System.out.println("Resultado: " + player1.getPlay().verificarResultado(player2.getPlay()));
        } while(continuar);
    }

    private jogada sortearJogada() {
        return jogadas[new Random().nextInt(jogadas.length)];
    }

    private jogada escolheJogada() {
        System.out.println("Informe sua jogada:\n0 - Pedra\n1 - Papel\n2 - Tesoura\n");
        int escolha = scanner.nextInt();
        return jogadas[escolha];
    }

    private void inicializarJogadores(){
        System.out.println("Informe o nome do jogador 1: ");
        String nome = scanner.next();
        this.player1 = new jogador(nome,true);
        this.player2 = new jogador("NPC");
    }
}
