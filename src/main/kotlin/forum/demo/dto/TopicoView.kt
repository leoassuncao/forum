package forum.demo.dto

import forum.demo.model.StatusTopico
import java.time.LocalDateTime

data class TopicoView(
    val id: Long? = null,
    val titulo: String,
    val mensagem: String,
    val status: StatusTopico,
    val dataCriacao: LocalDateTime
)