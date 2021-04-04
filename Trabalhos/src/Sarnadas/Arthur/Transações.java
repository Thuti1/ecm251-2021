package Sarnadas.Arthur;

import java.util.Random;

public class Transações {
    //Criação de funções de interação com as Contas
    //Criar um número aleatório
    private static int getRandomNumberInRange(int min, int max){
        Random r = new Random();
        return r.nextInt((max-min)+1) + min;
    }

    // Métodos utilizáveis
    public static boolean transacao(Usuários pagador, Usuários recebedor, double valor) {
        if (pagador.getConta().getSaldo() >= valor) {
            Contas.depositar(recebedor.getConta(), valor);
            Contas.retirar(pagador.getConta(), valor);
            return true;
        }
        return false;
    }

    // Exibição das infos da conta

    public static String QR_Code(int idConta, String nome, double valor){
        //outra possibilidade para passar int pra String = NumberFormat.getInstance().format(num inteiro)
        String T = Integer.toString(idConta) + ";"+ nome + ";" + Double.toString(valor)+";"+ Integer.toString(getRandomNumberInRange(1000, 9999));
        return T;
    }
}
