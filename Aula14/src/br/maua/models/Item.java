package br.maua.models;

/**
 * Classe criada para representar o modelo do Item
 */
public class Item {
    public final String nome;
    public final int id;

    /**
     * Construtor que inicializa os seus parametros
     * @param nome
     * @param id
     */
    public Item(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    /**
     * Método que representa o estado atual do Item
     * @return
     */
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
