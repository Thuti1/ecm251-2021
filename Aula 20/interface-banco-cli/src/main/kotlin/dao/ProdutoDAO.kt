package dao

import models.Produto
import java.sql.DriverManager

class ProdutoDAO : GenericoDAO {
    override fun pegarUm(id: Int): Any {
        val connection = DriverManager.getConnection("jdbc:sqlite:meubanco_GitHub.db")
        // Cria um caminho para realizar queries sql no banco
        val sqlStatement = connection.createStatement()
        // Executa uma query de busca
        val resultSet = sqlStatement.executeQuery("SELECT * FROM produtos WHERE id == ${id};")
        // Intera pelo resultado obtido
        var produto : Produto? = null
        while (resultSet.next()){
            produto = Produto(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getInt("quantidade")
            )
            println("Produto encontrado: ${produto}")
        }
        resultSet.close()
        connection.close()
        return produto!!
    }

    override fun pegarTodos(): List<Any> {
        val connection = DriverManager.getConnection("jdbc:sqlite:meubanco_GitHub.db")
        // Cria um caminho para realizar queries sql no banco
        val sqlStatement = connection.createStatement()
        // Executa uma query de busca
        val resultSet = sqlStatement.executeQuery("SELECT * FROM produtos WHERE id == ${id};")
        // Intera pelo resultado obtido
        val produtos = mutableListOf<Produto>()
        while (resultSet.next()){
            produtos.add(Produto(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getInt("quantidade")
            ))
            println("Produto encontrado: ${produtos}")
        }
        resultSet.close()
        connection.close()
        return produtos
    }

    override fun inserirUm(objeto: Any) {
        TODO("Not yet implemented")
    }

    override fun inserirVarios(lista: List<Any>) {
        TODO("Not yet implemented")
    }

    override fun atualizar(objeto: Any) {
        TODO("Not yet implemented")
    }

    override fun deletar(id: Int) {
        TODO("Not yet implemented")
    }

}