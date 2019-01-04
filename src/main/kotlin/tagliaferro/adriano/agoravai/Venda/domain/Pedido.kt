package tagliaferro.adriano.agoravai.Venda.domain

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Entity
data class Pedido(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val _id: Int,

        @NotNull(message = "A list of itens must be informed")
        val item_pedido_id: ArrayList<Int>,

        @NotEmpty(message = "A total price is necessary")
        val total: Double,

        @NotNull(message = "The date must be informed")
        val data_pedido: LocalDate
)