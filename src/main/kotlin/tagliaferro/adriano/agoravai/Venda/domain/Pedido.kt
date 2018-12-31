package tagliaferro.adriano.agoravai.Venda.domain

import java.time.LocalDate
import javax.persistence.Entity

@Entity
data class Pedido(
        val _id : Int,
        val item_pedido_id : List<Item_Pedido>,
        val total : Double,
        val data_pedido : LocalDate
)