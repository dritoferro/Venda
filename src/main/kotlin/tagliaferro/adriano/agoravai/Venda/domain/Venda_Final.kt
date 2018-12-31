package tagliaferro.adriano.agoravai.Venda.domain

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Entity
data class Venda_Final(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val _id: Int,

        @NotEmpty(message = "A pedido id is necessary")
        val pedido_id: Int,

        val cliente_id: Int,

        @NotEmpty(message = "A total is necessary")
        val total: Double,

        @NotEmpty(message = "A descount is necessary")
        val desconto: Double,

        @NotEmpty(message = "A total paid is necessary")
        val valor_pago: Double,

        @NotEmpty(message = "A change is necessary")
        val valor_troco: Double,

        @NotNull(message = "A date is necessary")
        val data_venda: LocalDate,

        @NotNull(message = "A payment format is necessary")
        val forma_pagamento: String,

        @NotEmpty(message = "A quantity of payments is necessary")
        val quantidade_parcela: Int,

        @NotEmpty(message = "A value of each payment is necessary")
        val valor_parcela: Double
)