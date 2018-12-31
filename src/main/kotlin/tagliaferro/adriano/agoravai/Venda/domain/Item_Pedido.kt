package tagliaferro.adriano.agoravai.Venda.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotEmpty

@Entity
data class Item_Pedido(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val _id: Int,

        @NotEmpty(message = "A product id must be informed")
        val produto_id: Int,

        @NotEmpty(message = "A quantity must be informed")
        val quantidade: Int,

        @NotEmpty(message = "A subtotal is necessary")
        val subtotal: Double
)

