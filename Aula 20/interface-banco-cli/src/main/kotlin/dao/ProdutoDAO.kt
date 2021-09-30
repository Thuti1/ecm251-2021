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
        var connection : ConexaoDAO? = null
        try {
            // Cria uma conexão com o banco
            connection = ConexaoDAO()
            // Executa uma query de busca
            val resultSet = connection.executeQuery("SELECT * FROM produtos;") // FROM maua
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
        val preparedStatement = connectionDAO.getPreparedStatement("""
            INSERT INTO produtos
            (nome, valor, quantidade)
            VALUES (?,?,?);
            """.trimMargin())
        val produto = objeto as Produto
        preparedStatement?.setString(1,produto.nome)
        preparedStatement?.setDouble(2,produto.valor)
        preparedStatement?.setInt(3,produto.quantidade)
        preparedStatement?.executeUpdate()
        // Banco já está em modo auto-commit
//        connectionDAO.commit()
        connectionDAO.close()
    }

    override fun inserirVarios(lista: List<Any>) {
        val connectionDAO = ConexaoDAO()
        val preparedStatement = connectionDAO.getPreparedStatement("""
            INSERT INTO produtos
            (nome, valor, quantidade)
            VALUES (?,?,?);
            """.trimMargin())
        for (objeto in lista) {
            val produto = objeto as Produto
            preparedStatement?.setString(1, produto.nome)
            preparedStatement?.setDouble(2, produto.valor)
            preparedStatement?.setInt(3, produto.quantidade)
            preparedStatement?.executeUpdate()
            // Banco já está em modo auto-commit
//        connectionDAO.commit()
        }
        connectionDAO.close()
    }

    override fun atualizar(objeto: Any) {
        val connectionDAO = ConexaoDAO()
        val preparedStatement = connectionDAO.getPreparedStatement("""
            UPDATE produtos
            SET nome = ?, valor = ?, quantidade = ?
            WHERE id = ?;
            """.trimMargin())
        val produto = objeto as Produto
        preparedStatement?.setString(1,produto.nome)
        preparedStatement?.setDouble(2,produto.valor)
        preparedStatement?.setInt(3,produto.quantidade)
        preparedStatement?.setInt(4,produto.id)
        preparedStatement?.executeUpdate()
        // Banco já está em modo auto-commit
//        connectionDAO.commit()
        connectionDAO.close()
    }

    override fun deletar(id: Int) {
        val connectionDAO = ConexaoDAO()
        val preparedStatement = connectionDAO.getPreparedStatement("""
            DELETE FROM produtos
            WHERE id = ?;
            """.trimMargin())
        preparedStatement?.setInt(1,id)
        preparedStatement?.executeUpdate()
        // Banco já está em modo auto-commit
//        connectionDAO.commit()
        connectionDAO.close()
    }

}