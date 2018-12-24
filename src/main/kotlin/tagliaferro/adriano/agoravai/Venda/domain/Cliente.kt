package tagliaferro.adriano.agoravai.Venda.domain

import java.time.LocalDate

data class Cliente(
        val _id : Int,
        val nome : String,
        val cpf : String,
        val data_nascimento : LocalDate,
        val endereco_id : Endereco,
        val telefone_id : Telefone,
        val email : String
)