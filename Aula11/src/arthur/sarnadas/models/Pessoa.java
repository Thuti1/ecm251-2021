package arthur.sarnadas.models;

public abstract class Pessoa {
    private String nome;
    private String CPF;

    /**
     * Metodo construtor da classe Pessoa que inicia seus parametros.
     * @param nome Nome atribuida a instancia de Pessoa.
     * @param CPF CPF atribuido a instancia de Pessoa, sempre deve existir.
     */

    public Pessoa(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    /**
     * Metodo construtor alternativo para classe <strong>Pessoa</strong>. Inicializa o atributo nome
     * com uma String "".
     * @param CPF CPF atribuido a instancia de Pessoa.
     */

    public Pessoa(String CPF) {
        this.nome = "";
        this.CPF = CPF;
    }

    /**
     * Getter do valor do nome da instancia de Pessoa
     * @return retorna o valor do atributo nome
     */

    public String getNome() {
        return nome;
    }

    /**
     * Getter do valor do CPF da instancia de Pessoa
     * @return retorna o valor do atributo CPF
     */

    public String getCPF() {
        return CPF;
    }
}
