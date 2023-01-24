package com.itram.plugins

import com.itram.models.TicTacToeGame
import com.itram.socket
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting(game: TicTacToeGame) {
    routing {
        socket(game)
    }
}
