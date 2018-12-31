package tagliaferro.adriano.agoravai.Venda.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
data class Telefone(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val _id: Int,

        @NotNull(message = "At least one phone number is necessary")
        val telefone_01: String,

        val telefone_02: String,

        val telefone_03: String,

        val telefone_04: String
)