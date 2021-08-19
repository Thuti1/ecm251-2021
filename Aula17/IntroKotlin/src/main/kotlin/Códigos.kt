//Importar biblioteca de Java
import java.time.LocalDateTime

////Criando funções
fun soma (numero1: Double, numero2: Double) = numero1 + numero2
// fun subt (numero1: Double, numero2: Double): Double{
//     return numero1 - numero2
// }
// fun exibirResultado(resultado: Double): Unit{
//     println("Resultado: $resultado")
// }

// fun main() {
//     //Declarando variáveis de formas diferentes
// //     var nome = "Thurzao"
// //     var sobreNome: String
//     //Declarando constantes
//     // Solucao 1 - Deve informar que "aceita valor null", porém fica como null
// //     val nome: String?
// //     val sobreNome: String?
// //     println("Qual seu nome? R: ")
// //     nome = readLine()
// //     println("E seu sobrenome? R: ")
// //     sobreNome = readLine()
//     // Solucao 2 - Deixa informar o nome, porém dá um ponteiro null
// //     val nome: String
// //     val sobreNome: String
// //     println("Qual seu nome? R: ")
// //     nome = readLine()!!
// //     println("E seu sobrenome? R: ")
// //     sobreNome = readLine()!!
//     // Solucao 3 - Funciona (utilizando o "Elvis operator") , porém sem a inserção de dados
// //     val nome: String?
// //     val sobreNome: String?
// //     println("Qual seu nome? R: ")
// //     nome = "Teste" ?: "NOME PADRÃO"
// //     println("E seu sobrenome? R: ")
// //     sobreNome = readLine() ?: "SOBRENOME PADRÃO"
// //     println("Bem-vindo à Koltin $nome $sobreNome")
//     // Trabalhando com contas
//     val numero1: Double
//     val numero2: Double
//     val resultado: Double
//     numero1 = 10.toDouble()
//     numero2 = "24.5".toDouble()
//     resultado = numero1 + numero2
//     println("Resultado: $resultado")
//     //Utilizando as funções criadas
//     println("Soma: ${soma(numero1,numero2)}")
//     println("Subtração: ${subt(numero1,numero2)}")
//     // Ou
//     println() //Falta completar com exibirDados
// }

//Criando uma classe
class Pessoa(val nome:String, val idade: Int){

    fun exibirDados(){
        println("Meus dados: ${this.nome} - ${this.idade}")
    }
}

class SuperPessoa(nome:String, ano: Int){
    val nome: String = nome
        get(){
            return "Olá! Meu nome é: ${field}"
        }
    val anoNascimento: Int
    var idade: Int = 0
        set(value){
            if(value < 0)
                return

            field = value
        }
    //Comportamento do construtor
    init{
        this.anoNascimento = ano
        this.idade = LocalDateTime.now().year - ano
    }

    fun exibirDados(){
        println("Meus dados: ${this.nome} - ${this.idade}")
    }
}

fun main(){
    val p1 = Pessoa("Arthur", 21)
    val p2 = Pessoa("GauGau", 37)
    val p3 = SuperPessoa("Lindinho", 2001) // Declarado como val, não é possível reatribuir este objeto
    p1.exibirDados()
    p2.exibirDados()
    p3.exibirDados()
    p3.idade = 45 // Declarado como var
    p3.exibirDados()
    p3.idade = -23
    p3.exibirDados()
}