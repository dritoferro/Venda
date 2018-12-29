package tagliaferro.adriano.agoravai.Venda.domain

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Entity
data class Cliente(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val _id: Int?,

        @NotNull(message = "Nome can't be null")
        val nome: String,

        @NotNull(message = "CPF must be informed")
        val cpf: String,

        @NotNull(message = "data_nascimento must be necessary")
        val data_nascimento: LocalDate,

        @NotEmpty(message = "endereco_id must be informed")
        val endereco_id: Int,

        @NotEmpty(message = "Telefone must not be null")
        val telefone_id: Int,

        @Email(message = "Email must not be null", regexp = "*@*.*")
        val email: String
)