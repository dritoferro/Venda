package tagliaferro.adriano.agoravai.Venda.domain

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Email
import javax.validation.constraints.NotNull

@Entity
data class Cliente(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val _id: Int?,

        @field:NotNull(message = "Nome can't be null")
        val nome: String,

        @field:NotNull(message = "CPF must be informed")
        val cpf: String,

        @field:NotNull(message = "data_nascimento must be necessary")
        val data_nascimento: LocalDate,

        @field:NotNull(message = "endereco_id must be informed")
        val endereco_id: Int,

        @field:NotNull(message = "Telefone must not be null")
        val telefone_id: Int,

        @field:NotNull
        @field:Email(message = "Email must not be null")
        val email: String
)