package forum.demo.controller

import forum.demo.dto.NovoTopicoForm
import forum.demo.dto.TopicoView
import forum.demo.service.TopicoService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController (private val service: TopicoService){

    @GetMapping
    fun listar(): List<TopicoView> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoView {
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody dto: NovoTopicoForm){
        service.cadastrar(dto)
    }
}