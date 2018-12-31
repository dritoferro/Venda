package tagliaferro.adriano.agoravai.Venda.endpoint

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Endereco
import tagliaferro.adriano.agoravai.Venda.service.EnderecoService
import javax.validation.Valid

@RestController
@RequestMapping(value = ["/v1/endereco"])
class EnderecoEndpoint : Contract.Endpoint<Endereco> {

    @Autowired
    private lateinit var service: EnderecoService

    @PostMapping
    override fun insert(@Valid @RequestBody obj: Endereco): ResponseEntity<Unit> {
        try {
            return service.insert(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    @PutMapping(value = ["/{id}"])
    override fun update(@Valid @RequestBody obj: Endereco, @PathVariable id: Int): ResponseEntity<Unit> {
        try {
            return service.update(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    @GetMapping(value = ["/{id}"])
    override fun getById(@PathVariable id: Int): ResponseEntity<Endereco> {
        try {
            return service.getById(id)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    @GetMapping
    override fun getAll(): ResponseEntity<List<Endereco>> {
        try {
            return service.getAll()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    @DeleteMapping(value = ["/{id}"])
    override fun delete(@PathVariable id: Int): ResponseEntity<Unit> {
        try {
            return service.delete(id)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}