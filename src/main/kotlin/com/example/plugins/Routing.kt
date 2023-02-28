package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import java.io.File

fun Application.configureRouting() {
    routing {
        get("/10001") {
            call.respondFile(File("src/main/resources/stock.json"))
        }
        get("/") {
            call.respondText("Welcome to RayanHamrah")
        }
    }
}
