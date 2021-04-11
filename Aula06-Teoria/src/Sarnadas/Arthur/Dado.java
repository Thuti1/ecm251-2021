package Sarnadas.Arthur;

import java.util.Random;

public class Dado {
    final private int numeroFaces;
    private int faceAtual;
    private int[] FACES;

    /* Construtor da classe que define
    o número de faces, as faces e a face
    inicial do dado */

    public Dado(int numeroFaces){
        this.numeroFaces = numeroFaces;
        FACES = new int[this.numeroFaces];
        for (int i=0; i < this.numeroFaces ; i++){
            FACES[i] = i+1;
        }
        lancarDado();
    }

    // Método que sorteia uma face do dado

    public int lancarDado(){
        Random random = new Random();
        this.faceAtual = random.nextInt(this.numeroFaces);
        return FACES[this.faceAtual];
    }

    /* Método que devolve o valor do último
    lançamento do dado */

    public int lerLancamentoAtual(){
        return FACES[this.faceAtual];
    }
}
