package tagliaferro.adriano.agoravai.Venda.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Entity
data class Produto(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val _id: Int,

        @field:NotNull(message = "A description must be informed")
        val descricao: String,

        @field:NotEmpty(message = "A fornecedor id must be informed")
        val fornecedor_id: Int,

        @field:NotEmpty(message = "A quantity must be informed")
        val quantidade: Int,

        @field:NotEmpty(message = "A price must be informed")
        val preco: Double,

        @field:NotEmpty(message = "A status must be informed")
        val status: Boolean
)