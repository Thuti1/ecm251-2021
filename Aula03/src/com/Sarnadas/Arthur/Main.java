package com.Sarnadas.Arthur;

public class Main {

    public static void main(String[] args) {
	    // Cria um objeto do tipo Conta
        Conta c1;
        // Instancia um objeto Conta
        c1 = new Conta();

        //Pede para a conta exibir o saldo
        c1.visualizarSaldo();

        //Modificar o saldo
        c1.saldo = 100;

        c1.visualizarSaldo();

        //Cria um novo objeto do tipo Conta
        Conta c2 = new Conta();
        c2.saldo = 123.0;

        c1.depositar(4500);
        c2.depositar(100);

        if(c1.sacar(4000)){
            System.out.println("Hoje tem Play5!");
        } else {
            System.out.println("F Play 5");
        }

        if(c1.transferirDinheiro(c2,500)){
            System.out.println("Transferido com sucesso!");
        } else {
            System.out.println("Não foi possível transferir.");
        }

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        c1.cliente = new Cliente();
        c2.cliente = new Cliente();

        System.out.println("Nome do cliente:"+c1.cliente.nome);
        System.out.println("Nome do cliente:"+c2.cliente.nome);
        c1.cliente.nome = "Tanjiro";
        c1.cliente.sobrenome = "Kamado";
        c1.numero = 9;
        System.out.println("C1:"+ c1.toString());
    }
}
