package forum.demo.service

import forum.demo.model.Curso
import forum.demo.model.Usuario
import forum.demo.repository.UsuarioRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService( private val repository: UsuarioRepository) {

    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }
}
