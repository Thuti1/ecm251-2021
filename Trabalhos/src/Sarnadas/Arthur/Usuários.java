package Sarnadas.Arthur;

public class Usuários {

    // Declarar as infos de cada usuário

    private String nome;
    private String senha;
    private String email;
    private Contas conta;

    // Criar um construtor de usuários

    public Usuários(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    // Acesso de atributos (getters)

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public Contas getConta() {
        return conta;
    }

    // Formar o QR Code para o usuário

    public String QRCode(double valor){
        this.conta.QR_Code_id(this.nome,valor);
        String Cod = Transações.QR_Code(this.conta.getIdConta(),this.nome, valor);
        return Cod;
    }

    // Leitura do QRcode

    public void pagamento(Usuários usuario){
        String[] dados = usuario.conta.getInfo().split(";");
        double din = Double.parseDouble(dados[2]);
        if (Transações.transacao(this,usuario, din)){
            System.out.println("Transação autorizada!");
        } else {
            System.out.println("Transação não autorizada, cheque seu saldo e tente novamente!");
        }
    }

    // Criação de uma conta

    public void fazerConta(double saldo){
        this.conta = new Contas(saldo);
    }

    // Criar forma de exibir as infos de um certo usuário

    @Override
    public String toString() {
        return "Usuários{" +
                "nome='" + getNome() + '\'' +
                ", senha='" + getSenha() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", conta=" + getConta() +
                '}';
    }
}
