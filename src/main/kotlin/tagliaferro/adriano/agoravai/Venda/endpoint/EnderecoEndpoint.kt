package tagliaferro.adriano.agoravai.Venda.endpoint

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Endereco
import tagliaferro.adriano.agoravai.Venda.service.EnderecoService

@RestController
@RequestMapping(value = ["/v1/endereco"])
class EnderecoEndpoint : Contract.Endpoint<Endereco> {

    @Autowired
    private lateinit var service: EnderecoService

    override fun insert(obj: Endereco): ResponseEntity<Unit> {
        try {
            return service.insert(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun update(obj: Endereco, id: Int): ResponseEntity<Unit> {
        try {
            return service.update(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getById(id: Int): ResponseEntity<Endereco> {
        try {
            return service.getById(id)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getAll(): ResponseEntity<List<Endereco>> {
        try {
            return service.getAll()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun delete(id: Int): ResponseEntity<Unit> {
        try {
            return service.delete(id)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}