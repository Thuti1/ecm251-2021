package Sarnadas.Arthur;

public class Contas {
    //Declarar as infos de cada conta
    private Usuários usuario;
    private int idConta;
    private double saldo;

    //Fazer um construtor da conta
    public Contas(int idConta, double saldo) {
        this.idConta = idConta;
        this.saldo = saldo;
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
