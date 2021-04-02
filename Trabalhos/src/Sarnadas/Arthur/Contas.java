package Sarnadas.Arthur;

import java.text.NumberFormat;
import java.util.Random;

public class Contas {
    //Declarar as infos de cada conta
    private Usuários usuario;
    private int idConta;
    private double saldo;
    private static int R = 0;

    //Fazer um construtor da conta
    public Contas(int idConta, double saldo, String nome, String senha, String email) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = new Usuários(nome,senha,email);
    }
    //Esses métodos não são utilizáveis pelo usuário
    private void depositar(double valor) {
        this.saldo += valor;
    }

    private boolean sacar(Contas conta, double valor) {
        if(valor <= conta.saldo){
            conta.saldo -= valor;
            return true;
        }
        return false;
    }

    private static int getRandomNumberInRange(int min, int max){
        Random r = new Random();
        return r.nextInt((max-min)+1) + min;

        //Métodos das contas
    public boolean transacao(Contas pagador, Contas recebedor, String T) {
        String[] dados = T.split(";");
        recebedor =
                valor = dados[2];
        if (sacar(pagador, valor)) {
            recebedor.depositar(valor);
        }
    }
    /*    if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }
    */
    // Exibição das infos da conta
    public String receber(Contas recebedor, double valor){
        //outra possibilidade para passar int pra String = NumberFormat.getInstance().format(num inteiro)
        String T = Integer.toString(recebedor.idConta) + ";"+recebedor.usuario.nome + Double.toString(valor)+";"+ Integer.toString(getRandomNumberInRange(1000, 9999));
        return T;
        }


    @Override
    public String toString() {
        return "Contas{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                '}';
    }
}
