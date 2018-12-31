package tagliaferro.adriano.agoravai.Venda.endpoint

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Fornecedor
import tagliaferro.adriano.agoravai.Venda.service.FornecedorService
import javax.validation.Valid

@RestController
@RequestMapping(value = ["/v1/fornecedor"])
class FornecedorEndpoint : Contract.Endpoint<Fornecedor> {

    @Autowired
    private lateinit var service: FornecedorService

    @PostMapping
    override fun insert(@Valid @RequestBody obj: Fornecedor): ResponseEntity<Unit> {
        try {
            return service.insert(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    @PutMapping(value = ["/{id}"])
    override fun update(@Valid @RequestBody obj: Fornecedor, @PathVariable id: Int): ResponseEntity<Unit> {
        try {
            return service.update(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    @GetMapping(value = ["/{id}"])
    override fun getById(@PathVariable id: Int): ResponseEntity<Fornecedor> {
        try {
            return service.getById(id)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    @GetMapping
    override fun getAll(): ResponseEntity<List<Fornecedor>> {
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