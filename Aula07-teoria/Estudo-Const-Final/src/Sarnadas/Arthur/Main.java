package Sarnadas.Arthur;

public class Main {

    public static void main(String[] args) {
	    Pessoa pessoa = new Pessoa("Deku", "123.456");
        System.out.println(pessoa);
        //  Nao pode realizar a nova instância, pois a ref é final
        // pessoa = new Pessoa("Bakugo", "654.321");
        pessoa.mudar = 14;
        System.out.println(pessoa);

        // Exemplo de sobrecarga
        System.out.println("--------------Sobrecarga-------------------");
        Estudante e1 = new Estudante("Asuka","02", "02");
        Estudante e2 = new Estudante("Rei", "01");
        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);

        // Exemplo de sobreposição
        System.out.println("-------------Sobreposicao------------------");
        Pessoa p1 = new Estudante("Shinji", "33", "01");
        Estudante e3 = new Estudante("Kaoru", "44", "02");
        Object e4 = new Estudante("Han Solo", "00", "00");
        System.out.println("Estudante como Pessoa: " + p1);
        System.out.println("Estudante como Estudante: " + e3);
        System.out.println("Estudante como Object: " + e4);

        // IMPORTANTE
        System.out.println("-------Cuidado com a Herança-------");
        System.out.println("Ola do Estudante como Pessoa: " + p1.Ola()); // Deu certo
        System.out.println("Ola do Estudante como Estudante: " + e3.Ola()); // Deu bom
        //System.out.println("Ola do Estudante como Object: " + e4.Ola()); Deu ruim
        System.out.println("Ola do Estudante como Object: " + ((Estudante)e4).Ola()); // Deu Nice

        // Não é possível fazer, pois tod0 Est. é Pessoa, não o contrário:
        // Estudante estudante_p_exemplo = new Pessoa("Frambos","Dengos");

        System.out.println("--------------typeOf()--------------");
        System.out.println("Estudante como Pessoa: " + p1.getClass());
        System.out.println("Estudante como Estudante: " + e3.getClass());
        System.out.println("Estudante como Object: " + e4.getClass());
    }
}
