import dao.ProdutoDAO
import models.Produto
import java.sql.DriverManager

fun main(args: Array<String>) {
    // Cria um DAO para os produtos
    val produtosDAO = ProdutoDAO()
    produtosDAO.deletar(7)
    produtosDAO.atualizar(Produto(8, "Samsung", 350.0, 2))
    var produtos = produtosDAO.pegarTodosSeguro()
    // Intera pelo resultado obtido
    for (produto in produtos){
        println(produto)
    }
//    produtosDAO.inserirUm(Produto(0,"Agua", 2.29,12))
//    produtosDAO.inserirVarios(listOf(
//        Produto(0,"Funko", 89.90, 1),
//        Produto(0,"Toddao", 12.69, 80)))
}