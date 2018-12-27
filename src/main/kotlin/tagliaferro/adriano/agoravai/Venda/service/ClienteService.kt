package tagliaferro.adriano.agoravai.Venda.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Cliente
import tagliaferro.adriano.agoravai.Venda.model.ClienteModel

@Service
class ClienteService : Contract.Service<Cliente> {

    @Autowired
    private lateinit var model: ClienteModel

    override fun insert(obj: Cliente): ResponseEntity<Unit> {
        try {
            val success = model.insert(obj)
            if (success._id != null) {
                val uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(success._id).toUri()
                return ResponseEntity.created(uri).build()
            } else {
                return ResponseEntity.badRequest().build()
            }
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun update(obj: Cliente, id: Int): ResponseEntity<Unit> {
        try {
            val cliente = model.getById(id)
            if (cliente._id != null) {
                model.update(obj)
                return ResponseEntity.ok().build()
            } else {
                return ResponseEntity.badRequest().build()
            }
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getById(id: Int): ResponseEntity<Cliente> {
        try {
            val cliente = model.getById(id)
            if (cliente._id != null) {
                return ResponseEntity.ok(cliente)
            } else {
                return ResponseEntity.badRequest().build()
            }
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getAll(): ResponseEntity<List<Cliente>> {
        try {
            val clientes = model.getAll()
            return ResponseEntity.ok(clientes)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun delete(id: Int): ResponseEntity<Unit> {
        try {
            model.delete(id)
            val cliente = model.getById(id)
            if (cliente._id == null) {
                return ResponseEntity.ok().build()
            } else {
                return ResponseEntity.badRequest().build()
            }
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}