import org.json.JSONArray

fun main() {
    val resposta = khttp.get("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
    val baralho_id = resposta.jsonObject["deck_id"]
    val cards_resposta = khttp.get("https://deckofcardsapi.com/api/deck/$baralho_id/draw/?count=1")
    val valores_das_cartas = cards_resposta.jsonObject["cards"] as JSONArray
    val primeira_carta = valores_das_cartas[0]
    println(primeira_carta)
}