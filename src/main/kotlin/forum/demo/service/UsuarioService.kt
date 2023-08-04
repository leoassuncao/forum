package forum.demo.service

import forum.demo.model.Curso
import forum.demo.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService( var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario (
            id = 1,
            nome = "Leonardo",
            email = "leo@email.com"
        )
        usuarios = Arrays.asList(usuario)
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter { c ->
            c.id == id
        }.findFirst().get()
    }
}
