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

        @NotNull(message = "A razao social is necessary")
        val razao_social: String,

        @NotNull(message = "A nome fantasia is necessary")
        val nome_fantasia: String,

        @NotNull(message = "A cnpj is necessary")
        val cnpj: String,

        @NotEmpty(message = "A neighborhood is necessary")
        val endereco_id: Int,

        @NotEmpty(message = "A telefone is necessary")
        val telefone_id: Int,

        @NotNull(message = "An email address is necessary")
        @Email
        val email: String
)