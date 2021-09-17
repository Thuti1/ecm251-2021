import khttp.structures.authorization.BasicAuthorization

fun main(args: Array<String>) {
    val r = khttp.get("https://viacep.com.br/ws/09541-001/json/")
    println(r.statusCode)
// 200
    println(r.headers["Content-Type"])
// "application/json; charset=utf-8"
    println(r.text)
// """{"type": "User"..."""
    println(r.jsonObject["logradouro"])
// org.json.JSONObject
}