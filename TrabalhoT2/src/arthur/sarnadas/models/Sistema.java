package arthur.sarnadas.models;

import java.io.*;
import java.util.*;
import java.util.Iterator;


import arthur.sarnadas.enums.Tipos;
import arthur.sarnadas.enums.Horarios;

/**
 * Classe principal do programa, chamada na Main.
 * Nessa classe temos a interação com o usuario por meio dos menus de login e de escolha de opcoes.
 * A leitura, escrita e delecao no arquivo csv sao feitas aqui.
 */

public class Sistema {

    /**
     * Criacao e inicializacao de algumas variaveis, Scanners e da lista ligada de Membros.
     */

    private boolean executarSistema = true;
    Horarios horarioAtual = arthur.sarnadas.enums.Horarios.REGULAR;
    int ExecutaBB = 0;
    Tipos Cat;
    String usuarioAtual;

    Scanner Escolha = new Scanner(System.in);
    Scanner Nome = new Scanner(System.in);
    Scanner Email = new Scanner(System.in);
    Scanner Funcao = new Scanner(System.in);
    Scanner Exclusao = new Scanner(System.in);
    Scanner Horarios = new Scanner(System.in);
    Scanner Usuario = new Scanner(System.in);

    LinkedList<Membros> Membros = new LinkedList<>();
    //ArrayList<Membros> Membros = new ArrayList<>();


//    Iterator iterator = new Iterator() {
//        @Override
//        public boolean hasNext() {
//            return false;
//        }
//
//        @Override
//        public Object next() {
//            return null;
//        }
//    };


    /**
     * Metodo que, em loop, unifica as acoes a serem realizadas ao rodar o programa.
     * @throws IOException
     */

    public void executar() throws IOException{
        String opcao;
        AbrirCSV();
        Login();
        if(ExecutaBB == 2){
            while(executarSistema) {
                MenuPad();
                opcao = Escolha.next().toUpperCase(Locale.ROOT);
                avaliarOpcaoPad(opcao);
            }
        }
        else if(ExecutaBB == 1){
            while(executarSistema) {
                Menu();
                opcao = Escolha.next().toUpperCase(Locale.ROOT);
                avaliarOpcao(opcao);
            }
        }
    }

    /**
     * Metodo que faz a leitura do arquivo csv e reconhece o nome, email e funcao,
     * colocando-os na lista ligada Membros.
     */

    public void AbrirCSV(){
        File arquivoCSV = new File("E:\\yourfile.csv");
        try {
            String linhasDoArquivo = new String();
            Scanner leitor = new Scanner(arquivoCSV);
            while(leitor.hasNext()){
                linhasDoArquivo = leitor.nextLine();
                String[] splitted = linhasDoArquivo.split(";(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                //System.out.println(linhasDoArquivo);
                String nome = splitted[0];
                String email = splitted[1];
                String categoria = splitted[2];
                //System.out.println("Nome: "+nome+" Email: "+email+" Categoria: "+categoria+" Tipo: "+Tipos.BIG_BROTHERS);
                if(categoria.equals(Tipos.BIG_BROTHERS.toString())){
                    Cat = Tipos.BIG_BROTHERS;
                    Membros.add(new BigBrothers(nome, email, Cat));
                }
                else if(categoria.equals(Tipos.HEAVY_LIFTERS.toString())){
                    Cat = Tipos.HEAVY_LIFTERS;
                    Membros.add(new HeavyLifters(nome, email, Cat));
                }
                else if(categoria.equals(Tipos.MOBILE_MEMBERS.toString())){
                    Cat = Tipos.MOBILE_MEMBERS;
                    Membros.add(new MobileMembers(nome, email, Cat));
                }
                else if(categoria.equals(Tipos.SCRIPT_GUYS.toString())){
                    Cat = Tipos.SCRIPT_GUYS;
                    Membros.add(new ScriptGuys(nome, email, Cat));
                }
            }
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
    }

    /**
     * Metodo que faz a verificacao do usuario que utilizara o sistema,
     * decidindo se este pertence aos BigBrothers, e portanto pode adicionar
     * e remover membros, ou um usuario padrao, como HeavyLifters, MobileMembers e ScriptGuys.
     * O login so ocorre caso o usuario exista.
     */

    public void Login() {
        System.out.println("------Tela de Login-------");
        System.out.println("Username: ");
        usuarioAtual = Usuario.next();
        for (Iterator<Membros> iter = Membros.iterator(); iter.hasNext(); ) {
            Membros membro = iter.next();
            if(usuarioAtual.equals(membro.getUsername())){
                if (membro.getFuncao() == Tipos.BIG_BROTHERS) {
                    System.out.println("Bem Vindo BigBrother !!");
                    ExecutaBB = 1;
                    break;
                }else if(membro.getFuncao() != Tipos.BIG_BROTHERS){
                    System.out.println("Bem Vindo usuario padrao !");
                    ExecutaBB = 2;
                    break;
                }
            }
        }
        if(ExecutaBB == 0){
            System.out.println("Usuario nao existe.");
            Login();
        }
    }

    /**
     * Os Menus Menu() e MenuPad() sao, respectivamente, as representacoes(print)
     * do menu dos BigBrothers, que tem as opcoes de adicionar e remover membros,
     * e do menu dos outros tipos de usuario que nao possuem essas opcoes listadas.
     */

    public void Menu(){
        System.out.println("--------------------------");
        System.out.println("B3M V1ND0 40 MAsK_S0c13ty!");
        System.out.println("---------------------------");
        System.out.println("Horario Atual: " + horarioAtual);
        System.out.println("Escolha uma ação: ");
        System.out.println("[C]adastrar Membro");
        System.out.println("[P]ostar Mensagem");
        System.out.println("[T]rocar Horario");
        System.out.println("[E]xcluir Membro");
        System.out.println("[R]elatorio Geral");
        System.out.println("[S]air");

    }

    public void MenuPad(){
        System.out.println("--------------------------");
        System.out.println("B3M V1ND0 40 MAsK_S0c13ty!");
        System.out.println("---------------------------");
        System.out.println("Horario Atual: " + horarioAtual);
        System.out.println("Escolha uma ação: ");
        System.out.println("[P]ostar Mensagem");
        System.out.println("[T]rocar Horario");
        System.out.println("[R]elatorio Geral");
        System.out.println("[S]air");

    }

    /**
     * O metodo avaliarOpcao recebe uma String de um caractere que representa a escolha feita no menu.
     * As escolhas sao:
     *     Cadastro     -   Pede que o usuario cadastre um novo membro inserindo seu nome, email e funcao. Este cadastro
     *                      ja insere o novo membro no arquivo csv.
     *     Postar       -   Posta uma mensagem, de acordo com o horario atual, para cada membro cadastrado considerando sua categoria.
     * Trocar Horario   -   Analisa o horario atual e pergunta se o usuario deseja troca-lo, se sim, o horario altera.
     *     Excluir      -   Mostra uma lista dos membros e pede que o usuario insira o nome do membro a ser removido.
     * Relatorio Geral  -   Apresenta uma frase dizendo quem pediu o relatorio e em seguida mostra todas as informacoes
     *                      dos membros.
     *      Sair        -   Termina o programa.
     *     Default      -   Pede que o usuario digite um comando valido.
     *
     * @param opcao
     * @throws IOException
     */

    private void avaliarOpcao(String opcao) throws IOException {
        switch (opcao) {
            case "C":
                System.out.println("Digite o nome do novo membro: ");
                String nome = Nome.next();
                System.out.println("Digite o email do novo membro: ");
                String email = Email.next();
                System.out.println("Selecione a funcao do novo membro:\n1- BigBrother\n2- HeavyLifter\n3- MobileMember\n4- ScriptGuy");
                int funcao = Funcao.nextInt();
                if(funcao == 1){
                    Membros.add(new BigBrothers(nome, email, Tipos.BIG_BROTHERS));
                }
                else if (funcao == 2){
                    Membros.add(new HeavyLifters(nome, email, Tipos.HEAVY_LIFTERS));
                }
                else if (funcao == 3){
                    Membros.add(new MobileMembers(nome, email, Tipos.MOBILE_MEMBERS));
                }
                else if (funcao == 4){
                    Membros.add(new ScriptGuys(nome, email, Tipos.SCRIPT_GUYS));
                }
                else{
                    System.out.println("Funcao invalida, tente cadastrar novamente.");
                }
                PrintWriter pw = new PrintWriter("D:\\Documents\\GitHub\\ecm251-2021\\Atividade02\\src\\benuthe\\giovanni\\arquivo_super_Secreto_nao_abrir.csv");
                for(Membros membro : Membros){
                    pw.println(membro.getUsername() + ";" + membro.getEmail() + ";" + membro.getFuncao().toString());
                }
                pw.close();
                break;
            case "P":
                if(horarioAtual == arthur.sarnadas.enums.Horarios.REGULAR){
                    for(Membros membro : Membros){
                        membro.postarRegular();
                    }
                }
                else {
                    for(Membros membro : Membros){
                        membro.postarExtra();
                    }
                }
                break;
            case "T":
                System.out.println("Deseja trocar o horario? (s/n)");
                String horario = Horarios.next();
                if(horario.toUpperCase(Locale.ROOT).equals("S")){
                    if(horarioAtual == arthur.sarnadas.enums.Horarios.REGULAR){
                        horarioAtual = arthur.sarnadas.enums.Horarios.EXTRAS;
                    }
                    else{
                        horarioAtual = arthur.sarnadas.enums.Horarios.REGULAR;
                    }
                }
                else{
                    System.out.println("Ok, volte quando quiser..");
                }
                break;
            case "E":
                System.out.println("Lista de membros:");
                for(Membros o : Membros){
                    System.out.printf("Nome: %15s ; Funcao: %15s\n", o.getUsername(), o.getFuncao());
                }
                System.out.println("Digite o nome do membro que deseja excluir:");
                String exclusao = Exclusao.next();
                for(Iterator<Membros> iter = Membros.iterator(); iter.hasNext();) {
                    Membros membro = iter.next();
                    if(exclusao.equals("B1az3")){
                        System.out.println("Esse membro nao pode ser excluido!");
                        break;
                    }
                    else if (exclusao.equals(membro.getUsername())) {
                        //iter.remove();
                        Membros.remove(membro);
                        PrintWriter pw2 = new PrintWriter("D:\\Documents\\GitHub\\ecm251-2021\\Atividade02\\src\\benuthe\\giovanni\\arquivo_super_Secreto_nao_abrir.csv");
                        for(Membros membro2 : Membros){
                            pw2.println(membro2.getUsername() + ";" + membro2.getEmail() + ";" + membro2.getFuncao().toString());
                        }
                        pw2.close();
                        System.out.println("Membro excluido com sucesso.");
                        break;
                    }
                }
                break;
            case "R":
                for (Iterator<Membros> iter = Membros.iterator(); iter.hasNext(); ) {
                    Membros membro = iter.next();
                    if (usuarioAtual.equals(membro.getUsername())) {
                        membro.apresentar();
                        for (Object o : Membros) {
                            System.out.println(o.toString());
                        }
                    }
                }
                break;
            case "S":
                executarSistema = false;
                break;
            default:
                System.out.println("Digite um comando valido!");

        }



    }

    /**
     * O metodo avaliarOpcaoPad recebe uma String de um caractere que representa a escolha feita no menu.
     * Suas opcoes sao as mesmas de avaliarOpcao, exceto Cadastrar e Excluir.
     * @param opcao
     */

    private void avaliarOpcaoPad(String opcao) {
        switch (opcao) {
            case "P":
                if(horarioAtual == arthur.sarnadas.enums.Horarios.REGULAR){
                    for(Membros membro : Membros){
                        membro.postarRegular();
                    }
                }
                else {
                    for(Membros membro : Membros){
                        membro.postarExtra();
                    }
                }
                break;
            case "T":
                System.out.println("Deseja trocar o horario? (s/n)");
                String horario = Horarios.next();
                if(horario.toUpperCase(Locale.ROOT).equals("S")){
                    if(horarioAtual == arthur.sarnadas.enums.Horarios.REGULAR){
                        horarioAtual = arthur.sarnadas.enums.Horarios.EXTRAS;
                    }
                    else{
                        horarioAtual = arthur.sarnadas.enums.Horarios.REGULAR;
                    }
                }
                else{
                    System.out.println("Ok, volte quando quiser..");
                }
                break;
            case "R":
                for (Iterator<Membros> iter = Membros.iterator(); iter.hasNext(); ) {
                    Membros membro = iter.next();
                    if (usuarioAtual.equals(membro.getUsername())) {
                        membro.apresentar();
                        for (Object o : Membros) {
                            System.out.println(o.toString());
                        }
                    }
                }
                break;
            case "S":
                executarSistema = false;
                break;
            default:
                System.out.println("Digite um comando valido!");
        }
    }

// Metodos da classe Iterator que podem ser descomentados caso deseje-se usar, por exemplo, iter.remove();
//    public boolean hasNext() {
//        return iterator.hasNext();
//    }
//
//    public Object next() {
//        return iterator.next();
//    }
//
//    public void remove() {
//        iterator.remove();
//    }
//
//    public void forEachRemaining(Consumer action) {
//        iterator.forEachRemaining(action);
//    }

}