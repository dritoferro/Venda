package tagliaferro.adriano.agoravai.Venda.model

import org.springframework.beans.factory.annotation.Autowired
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Produto
import tagliaferro.adriano.agoravai.Venda.repository.ProdutoRepository

class ProdutoModel : Contract.Model<Produto> {

    @Autowired
    private lateinit var repo: ProdutoRepository

    override fun insert(obj: Produto) {
        try {
            repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun update(obj: Produto) {
        try {
            repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getById(id: Int): Produto {
        try {
            return repo.findById(id).get()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getAll(): List<Produto> {
        try {
            val produtos = ArrayList<Produto>()

            repo.findAll().map { it -> produtos.add(it) }

            return produtos
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