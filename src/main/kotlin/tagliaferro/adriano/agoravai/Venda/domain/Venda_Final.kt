package tagliaferro.adriano.agoravai.Venda.domain

import java.time.LocalDate

data class Venda_Final(
        val _id : Int,
        val pedido_id : Pedido,
        val cliente_id : Cliente,
        val total : Double,
        val desconto : Double,
        val valor_pago : Double,
        val valor_troco : Double,
        val data_venda : LocalDate,
        val forma_pagamento : String,
        val quantidade_parcela : Int,
        val valor_parcela : Double
)