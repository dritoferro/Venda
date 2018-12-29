package tagliaferro.adriano.agoravai.Venda.model

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Cliente
import tagliaferro.adriano.agoravai.Venda.repository.ClienteRepository

@Repository
class ClienteModel : Contract.Model<Cliente> {

    @Autowired
    private lateinit var repo: ClienteRepository

    override fun insert(obj: Cliente): Cliente {
        try {
            val reto = repo.save(obj)
            return reto
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun update(obj: Cliente) {
        try {
            repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getById(id: Int): Cliente {
        try {
            return repo.findById(id).get()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getAll(): List<Cliente> {
        try {
            val clients = ArrayList<Cliente>()
            repo.findAll().map { it -> clients.add(it) }

            return clients
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun delete(id: Int) {
        try {
            repo.deleteById(id)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}