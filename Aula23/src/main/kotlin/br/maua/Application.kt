package br.maua

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import br.maua.plugins.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        routing {
            get("/"){
                call.respondText ("Ola Mundo!")
            }
            get("/ola"){
                call.respondText {"Agora você mudou de roda!"}
            }
            get("/nome/{nome}"){
                call.respondText { "Bem-vindo ${call.parameters["nome"]}" }
            }
        }
    }.start(wait = true)
}
