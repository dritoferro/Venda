package tagliaferro.adriano.agoravai.Venda.model

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Venda_Final
import tagliaferro.adriano.agoravai.Venda.repository.VendaFinalRepository

@Repository
class Venda_FinalModel : Contract.Model<Venda_Final> {

    @Autowired
    private lateinit var repo: VendaFinalRepository

    override fun insert(obj: Venda_Final): Venda_Final {
        try {
            return repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun update(obj: Venda_Final) {
        try {
            repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getById(id: Int): Venda_Final {
        try {
            return repo.findById(id).get()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getAll(): List<Venda_Final> {
        try {
            val vendas = ArrayList<Venda_Final>()

            repo.findAll().map { it -> vendas.add(it) }

            return vendas
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