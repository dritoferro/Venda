package tagliaferro.adriano.agoravai.Venda.model

import org.springframework.beans.factory.annotation.Autowired
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Pedido
import tagliaferro.adriano.agoravai.Venda.repository.PedidoRepository

class PedidoModel : Contract.Model<Pedido> {

    @Autowired
    private lateinit var repo: PedidoRepository

    override fun insert(obj: Pedido) {
        try {
            repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun update(obj: Pedido) {
        try {
            repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getById(id: Int): Pedido {
        try {
            return repo.findById(id).get()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getAll(): List<Pedido> {
        try {
            val pedidos = ArrayList<Pedido>()

            repo.findAll().map { it -> pedidos.add(it) }

            return pedidos
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun delete(id: Int) {
        repo.deleteById(id)
    }
}