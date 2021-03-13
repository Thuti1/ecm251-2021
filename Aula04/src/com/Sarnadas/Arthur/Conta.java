package com.Sarnadas.Arthur;

public class Conta {
    //Atributos das classe
    private Cliente cliente;
    private double saldo;
    private int numero;

    //Métodos da classe

    //Construtor da classe
    public Conta(String nomeCliente, double saldoInicial){
        this.saldo = saldoInicial;
        this.cliente = new Cliente(nomeCliente);
        this.numero = 1234;
    }

    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;

    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transferirDinheiro(Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }
    public void visualizarSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}
