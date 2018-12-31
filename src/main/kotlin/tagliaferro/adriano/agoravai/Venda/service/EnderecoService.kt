package tagliaferro.adriano.agoravai.Venda.service

import org.elasticsearch.ResourceNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Endereco
import tagliaferro.adriano.agoravai.Venda.exception.ResourceAlreadyExistsException
import tagliaferro.adriano.agoravai.Venda.exception.ResourceWithoutIdException
import tagliaferro.adriano.agoravai.Venda.model.EnderecoModel

@Service
class EnderecoService : Contract.Service<Endereco> {

    @Autowired
    private lateinit var model: EnderecoModel

    override fun insert(obj: Endereco): ResponseEntity<Unit> {
        try {
            if (obj._id == null) {
                val success = model.insert(obj)
                if (success._id != null) {
                    val uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(success._id).toUri()
                    return ResponseEntity.created(uri).build()
                } else {
                    return ResponseEntity.badRequest().build()
                }
            } else {
                throw ResourceAlreadyExistsException()
            }
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun update(obj: Endereco): ResponseEntity<Unit> {
        try {
            if (obj._id != null) {
                checkExists(obj._id)
                model.update(obj)

                return ResponseEntity.ok().build()
            } else {
                throw ResourceWithoutIdException()
            }
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getById(id: Int): ResponseEntity<Endereco> {
        try {
            checkExists(id)
            val obj = model.getById(id)

            return ResponseEntity.ok(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getAll(): ResponseEntity<List<Endereco>> {
        try {
            val objs = ArrayList<Endereco>()
            model.getAll().map { it -> objs.add(it) }

            return ResponseEntity.ok(objs)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun delete(id: Int): ResponseEntity<Unit> {
        try {
            checkExists(id)
            model.delete(id)
            if (model.getById(id)._id == null) {
                return ResponseEntity.ok().build()
            } else {
                return ResponseEntity.badRequest().build()
            }
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun checkExists(id: Int) {
        if (model.getById(id)._id == null) {
            throw ResourceNotFoundException("Objeto não encontrado")
        }
    }
}