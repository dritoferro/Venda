package tagliaferro.adriano.agoravai.Venda.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Entity
data class Fornecedor(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val _id: Int?,

        @field:NotNull(message = "A razao social is necessary")
        val razao_social: String,

        @field:NotNull(message = "A nome fantasia is necessary")
        val nome_fantasia: String,

        @field:NotNull(message = "A cnpj is necessary")
        val cnpj: String,

        @field:NotEmpty(message = "A neighborhood is necessary")
        val endereco_id: Int,

        @field:NotEmpty(message = "A telefone is necessary")
        val telefone_id: Int,

        @field:NotNull(message = "An email address is necessary")
        @field:Email
        val email: String
)