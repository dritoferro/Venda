package tagliaferro.adriano.agoravai.Venda.model

import org.springframework.beans.factory.annotation.Autowired
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Endereco
import tagliaferro.adriano.agoravai.Venda.repository.EnderecoRepository

class EnderecoModel : Contract.Model<Endereco> {

    @Autowired
    private lateinit var repo: EnderecoRepository

    override fun insert(obj: Endereco) {
        try {
            repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun update(obj: Endereco) {
        try {
            repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getById(id: Int): Endereco {
        try {
            return repo.findById(id).get()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getAll(): List<Endereco> {
        try {
            val enderecos = ArrayList<Endereco>()

            repo.findAll().map { it -> enderecos.add(it) }

            return enderecos
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