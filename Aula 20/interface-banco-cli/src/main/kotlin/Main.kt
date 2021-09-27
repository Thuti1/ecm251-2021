import dao.ProdutoDAO
import models.Produto
import java.sql.DriverManager

fun main(args: Array<String>) {
    // Cria um DAO para os produtos
    val produtosDAO = ProdutoDAO()
    val produtos = produtosDAO.pegarTodosSeguro()
    // Intera pelo resultado obtido
    for (produto in produtos){
        println(produto)
    }
}