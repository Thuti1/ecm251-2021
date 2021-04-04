package Sarnadas.Arthur;

import java.text.NumberFormat;
import java.util.Random;

public class Contas {

    //Declarar as infos de cada conta

    private String info;
    private int idConta;
    private double saldo;
    private static int n = 0; // Implementar o idConta

    //Fazer um construtor da conta

    public Contas(double saldo) {
        n += 1; // Número da conta (progressivo)
        this.idConta = n;
        this.saldo = saldo;
    }

    // Acesso de atributos (getters)

    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getInfo() {
        return info;
    }

    //Esses métodos não são utilizáveis pelo usuário

    public static void depositar(Contas conta, double valor) {
        conta.saldo += valor;
    }

    public static void retirar(Contas conta, double valor) {
        if (valor <= conta.saldo) { conta.saldo -= valor; }
    }

    // Fazer o QR Code

    public void QR_Code_id(String nome, double valor) {
        this.info = Transações.QR_Code(this.idConta,nome, valor);
    }

    //Exibição em texto das infos da classe


    @Override
    public String toString() {
        return "Contas{" +
                ", idConta=" + idConta +
                ", saldo=" + saldo +
                "info='" + info + '\'' +
                '}';
    }
}

