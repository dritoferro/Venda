package tagliaferro.adriano.agoravai.Venda.model

import org.springframework.beans.factory.annotation.Autowired
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Item_Pedido
import tagliaferro.adriano.agoravai.Venda.repository.ItemPedidoRepository

class Item_PedidoModel : Contract.Model<Item_Pedido> {

    @Autowired
    private lateinit var repo: ItemPedidoRepository

    override fun insert(obj: Item_Pedido): Item_Pedido {
        try {
            return repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun update(obj: Item_Pedido) {
        try {
            repo.save(obj)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getById(id: Int): Item_Pedido {
        try {
            return repo.findById(id).get()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    override fun getAll(): List<Item_Pedido> {
        try {
            val itensPedidos = ArrayList<Item_Pedido>()

            repo.findAll().map { it -> itensPedidos.add(it) }

            return itensPedidos
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