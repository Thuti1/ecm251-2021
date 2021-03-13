package com.Sarnadas.Arthur;

public class Main {

    public static void main(String[] args) {
	    // Cria um objeto do tipo Conta
        Conta c1;
        // Instancia um objeto Conta
        c1 = new Conta("Itadori Yuuji", 450.50);

        c1.depositar(300);
        c1.sacar(250);
        //c1.saldo = 300;
        System.out.println("Conta 1:" + c1.toString());
        /*
        Modificadores de acesso (quem tem acesso):
        Public = Qualquer entidade e lugar
        Private = Somente para métodos e atributos
        Protected = Classes do mesmo pacote ou através de herança
        Default = Somente por classes do mesmo pacote (identificado pelo compilador)

        Encapsular é fundamental - programar para interface, não implementação
        Modelo procedural = Data Centric ; Modelo OO (or. obj.) = Rede
        Getters e Setters = criar uma "barreira" pra certo atributo
        Construtores = métodos chamados para instanciar um objeto, iniciar de forma organizada (new)
        */

    }
}
