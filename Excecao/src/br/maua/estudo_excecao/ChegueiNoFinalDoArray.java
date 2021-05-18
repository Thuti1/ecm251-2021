package br.maua.estudo_excecao;

public class ChegueiNoFinalDoArray extends ArrayIndexOutOfBoundsException{
    @Override
    public String getMessage(){
        return "Array Chegou no final";
    }
}
