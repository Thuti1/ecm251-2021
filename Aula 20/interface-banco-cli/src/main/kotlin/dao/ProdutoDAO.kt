package dao

import models.Produto
import shared.SharedPaths
import java.lang.Exception
import java.sql.DriverManager

class ProdutoDAO : GenericoDAO {
    override fun pegarUm(id: Int): Any {
        val connection = DriverManager.getConnection(SharedPaths.STRING_DE_CONEXAO_JDBC)
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
        sqlStatement.close()
        connection.close()
        return produto!!
    }

    override fun pegarTodos(): List<Any> {
        // Cria uma conexão com o banco
        val connection = ConexaoDAO()
        // Executa uma query de busca
        val resultSet = connection.executeQuery("SELECT * FROM produtos;")
        // Intera pelo resultado obtido
        val produtos = mutableListOf<Produto>()
        while (resultSet?.next()!!){
            produtos.add(Produto(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getInt("quantidade")
            ))
        }
        connection.close()
        return produtos
    }

    fun pegarTodosSeguro(): List<Any> {
        val produtos = mutableListOf<Produto>()
        val connection : ConexaoDAO? = null
        try {
            // Cria uma conexão com o banco
            connection = ConexaoDAO()
            // Executa uma query de busca
            val resultSet = connection.executeQuery("SELECT * FROM maua;")
            // Intera pelo resultado obtido
            while (resultSet?.next()!!){
                produtos.add(
                    Produto(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getDouble("valor"),
                        resultSet.getInt("quantidade")
                    )
                )
            }
        }
        catch (exception:Exception){
            exception.printStackTrace()
        }
        finally {
            connection?.close()
        }
        return produtos
    }

    override fun inserirUm(objeto: Any) {
        val connectionDAO = ConexaoDAO()
        val preparedStatement = connectionDAO.getPreparedStatement("""INSERTO INTO produtos
            nome, valor, quantidade
            VALUES (?,?,?);
            """.trimMargin())
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