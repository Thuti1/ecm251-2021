package Sarnadas.Arthur;

public class Contas {
    //Declarar as infos de cada conta
    private Usuários usuario;
    private int idConta;
    private double saldo;

    //Fazer um construtor da conta
    public Contas(int idConta, double saldo, String nome, String senha, String email) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = new Usuários(nome,senha,email);
    }
    //Métodos das contas
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
    public boolean transferirDinheiro(Contas destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }
    // Exibição das infos da conta
    @Override
    public String toString() {
        return "Contas{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                '}';
    }
}
