package arthur.sarnadas.models;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;
import arthur.sarnadas.CLS; //Tentar limpar a tela depois
import arthur.sarnadas.enums.Tipos;
import com.opencsv.CSVReader;


import static arthur.sarnadas.enums.Tipos.BIGBROTHERS;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;
    BigBrothers Gil = new BigBrothers("Gil", "gil@012.com", BIGBROTHERS);
    Scanner Nome = new Scanner(System.in);
    Scanner Email = new Scanner(System.in);
    Scanner Func = new Scanner(System.in);

    LinkedList<Membros> Members = new LinkedList<Membros>();
    CSVReader reader = new CSVReader(new FileReader())

    public void opcao(String escolha){
        switch(escolha) {
            case "C":
                //Cadastra o maluco
                System.out.println("Cadastro\n");
                System.out.println("User: ");
                String nome = Nome.next();
                System.out.println("Email: ");
                String email = Email.next();
                System.out.println("Func: ");
                String func = Func.next();
                break;
            case "P":
                //Postar Mensagem referente à minha vontade
                System.out.println("Postar\n");
                break;
            case "E":
                //Excluir maluco
                System.out.println("Exclui\n");
                break;
            case "R":
                //Exibe o relatório
                Gil.apresentar();
                System.out.println("Exibe\n");
                break;
            case "S":
                //Sair do programa
                System.out.println("Sai\n");
                this.executarSistema = false;
                break;
            default:
                //Caso esteja fora do range de entradas
                System.out.println("Digite um comando válido, por favor!");
                break;
        }
    }
    public void exibirMenu(){
        System.out.println("B3M-V1ND0 40 MAsK-S0c13ty! \n");
        System.out.println("Escolha sua ação:");
        System.out.println("(C)adastrar novo membro\n(P)ostar Mensagem\n(E)xcluir membro\n(R)elatório Geral\n(S)air do sistema");
        System.out.println("\nHorário Atual: \n");
    }
    public void executar(){
        String escolha;
        while(executarSistema){
            exibirMenu();
            escolha = scanner.next().toUpperCase(Locale.ROOT);
            opcao(escolha);
        }
    }

    public Sistema() {
        this.executarSistema = true;
        this.scanner = new Scanner(System.in);
    }
}
