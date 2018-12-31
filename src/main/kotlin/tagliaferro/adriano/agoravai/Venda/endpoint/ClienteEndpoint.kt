package tagliaferro.adriano.agoravai.Venda.endpoint

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Cliente
import tagliaferro.adriano.agoravai.Venda.service.ClienteService
import javax.validation.Valid

@RestController
@RequestMapping(value = ["/v1/cliente"])
class ClienteEndpoint : Contract.Endpoint<Cliente> {

    @Autowired
    private lateinit var cliente: ClienteService

    @PostMapping
    override fun insert(@Valid @RequestBody obj: Cliente): ResponseEntity<Unit> {
        try {
            return cliente.insert(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    @PutMapping(value = ["/{id}"])
    override fun update(@Valid @RequestBody obj: Cliente, @PathVariable id: Int): ResponseEntity<Unit> {
        try {
            return cliente.update(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    @GetMapping(value = ["/{id}"])
    override fun getById(@PathVariable id: Int): ResponseEntity<Cliente> {
        try {
            return cliente.getById(id)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    @GetMapping
    override fun getAll(): ResponseEntity<List<Cliente>> {
        try {
            return cliente.getAll()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    @DeleteMapping(value = ["/{id}"])
    override fun delete(@PathVariable id: Int): ResponseEntity<Unit> {
        try {
            return cliente.delete(id)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }


}