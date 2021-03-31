package Sarnadas.Arthur;

public class Main {

    public static void main(String[] args) {
    Usuários u1, u2, u3;
    u1 = new Usuários("Rato","R@t0n35","rato@nes.com");
    u2 = new Usuários("Tutu","12345678","tutu@barao.com");
    u3 = new Usuários("Gigi","Ovani","Gigi@zika.com");
    System.out.println("Usuário 1: " + u1.toString());
    System.out.println("Usuário 2: " + u2.toString());
    System.out.println("Usuário 3: " + u3.toString());
    }
}
