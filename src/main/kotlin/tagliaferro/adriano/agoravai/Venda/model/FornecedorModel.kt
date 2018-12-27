package tagliaferro.adriano.agoravai.Venda.model

import org.springframework.beans.factory.annotation.Autowired
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Fornecedor
import tagliaferro.adriano.agoravai.Venda.repository.FornecedorRepository

class FornecedorModel : Contract.Model<Fornecedor> {

    @Autowired
    private lateinit var repo: FornecedorRepository

    override fun insert(obj: Fornecedor): Fornecedor {
        try {
            return repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun update(obj: Fornecedor) {
        try {
            repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getById(id: Int): Fornecedor {
        try {
            return repo.findById(id).get()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getAll(): List<Fornecedor> {
        try {
            val fornecedores = ArrayList<Fornecedor>()

            repo.findAll().map { it -> fornecedores.add(it) }

            return fornecedores
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