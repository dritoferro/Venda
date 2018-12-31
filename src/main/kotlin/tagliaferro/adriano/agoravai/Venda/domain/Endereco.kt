package tagliaferro.adriano.agoravai.Venda.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Entity
data class Endereco(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val _id: Int?,

        @NotNull(message = "A street address is necessary")
        val endereco_rua: String,

        @NotEmpty(message = "The street number house is necessary")
        val endereco_num: Int,

        val endereco_comp: String,

        @NotNull(message = "A neighborhood is necessary")
        val endereco_bairro: String,

        @NotNull(message = "A Postal number is necessary")
        val endereco_cep: String,

        @NotNull(message = "The city name is necessary")
        val endereco_cidade: String,

        @NotNull(message = "The state is necessary")
        val endereco_uf: String
)