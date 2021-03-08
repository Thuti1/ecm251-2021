package com.Sarnadas.Arthur;

public class Basico02 {
    public static void main(String[] args){
        //Estruturas de decisao do java
        int poderDeLuta = 9001;

        //Decisao simples
        if (poderDeLuta > 9000){
            System.out.println("Kakarot!");
        }
        //Decisao composta
        if (poderDeLuta > 10000){
            System.out.println("Pode ser um super saiyan");
        } else {
            System.out.println("Mero Kuririn");
        }
        int morreu = 10;
        if (morreu == 0){
            System.out.println("Voce eh uma pessoa normal!");
        } else if (morreu < 3) {
            System.out.println("Voce eh um guerreiro salvo pelo Goku");
        } else if (morreu < 8) {
            System.out.println("Provavelmente vc eh um Saiyajin!");
        } else {
            System.out.println("Bem vindo de volta Kuririn!");
        }
        //Decisao multipla - switch
        switch (morreu) {
            case 0:
                System.out.println("Ser vivo comum");
                break;
            case 10:
                System.out.println("Eitcha!");
                break;
            default:
                System.out.println("Morri mas passo bem!");
                break;
        }
    }
}
