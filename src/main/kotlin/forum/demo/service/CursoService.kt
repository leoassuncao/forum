package forum.demo.service

import forum.demo.model.Curso
import forum.demo.repository.CursoRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CursoService( private val repository: CursoRepository) {

    fun buscarPorId(id: Long): Curso {
        return repository.getOne(id)
    }
}
