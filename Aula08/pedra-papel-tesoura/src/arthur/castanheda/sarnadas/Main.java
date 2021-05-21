package arthur.castanheda.sarnadas;

import arthur.castanheda.sarnadas.controlador.Sistema;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sistema sistema1 = new Sistema();
        sistema1.run();
        // Tentativa de implementação dos dois jogos, porém variáveis são diff
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Qual jokenpô quer jogar? Digite 1 p/ padrão ou 2 p/ o plus: \n");
//        int jogo = scanner1.nextInt();
//        if (jogo == 1) {
//            Sistema sistema1 = new Sistema();
//            sistema1.run();
//        } else if (jogo == 2){
//            Sistema_plus sistema2 = new Sistema_plus();
//            sistema2.run();
//        } else {
//            System.out.println("Erro! Fechando o programa...");
//            System.exit(1);
//        }
    }
}
