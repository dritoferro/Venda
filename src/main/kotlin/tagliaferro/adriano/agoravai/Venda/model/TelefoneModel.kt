package tagliaferro.adriano.agoravai.Venda.model

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Telefone
import tagliaferro.adriano.agoravai.Venda.repository.TelefoneRepository

@Repository
class TelefoneModel : Contract.Model<Telefone> {

    @Autowired
    private lateinit var repo: TelefoneRepository

    override fun insert(obj: Telefone): Telefone {
        try {
            return repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun update(obj: Telefone) {
        try {
            repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getById(id: Int): Telefone {
        try {
            return repo.findById(id).get()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getAll(): List<Telefone> {
        try {
            val telefones = ArrayList<Telefone>()

            repo.findAll().map { it -> telefones.add(it) }

            return telefones
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