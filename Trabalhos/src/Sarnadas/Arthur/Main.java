package Sarnadas.Arthur;

public class Main {

    public static void main(String[] args) {
    Usuários u1, u2, u3;
    u1 = new Usuários("Rato","R@t0n35","rato@nes.com");
    u1.fazerConta(1000.00);
    u2 = new Usuários("Tutu","12345678","tutu@barao.com");
    u2.fazerConta(250.00);
    u3 = new Usuários("Gigi","Ovani","Gigi@zika.com");
    u3.fazerConta(3000.00);

    // Estado Inicial
    System.out.println("Estado Inicial:");
    System.out.println("Usuário 1: " + u1.getNome() + " - Saldo: " + u1.getConta().getSaldo());
    System.out.println("Usuário 2: " + u2.getNome() + " - Saldo: " + u2.getConta().getSaldo());
    System.out.println("Usuário 3: " + u3.getNome() + " - Saldo: " + u3.getConta().getSaldo());

    // Transações
    u1.QRCode(250);
    u2.pagamento(u1);
    u3.pagamento(u1);
    u2.pagamento(u1);
    u2.QRCode(1000);
    u3.pagamento(u1);

    // Estado Final
    System.out.println("Estado Final:");
    System.out.println("Usuário 1: " + u1.getNome() + " - Saldo: " + u1.getConta().getSaldo());
    System.out.println("Usuário 2: " + u2.getNome() + " - Saldo: " + u2.getConta().getSaldo());
    System.out.println("Usuário 3: " + u3.getNome() + " - Saldo: " + u3.getConta().getSaldo());
    }
}
