package tagliaferro.adriano.agoravai.Venda.domain

import javax.persistence.Entity

@Entity
data class Telefone(
        val _id : Int,
        val telefone_celular : String,
        val telefone_residencial : String,
        val telefone_comercial : String,
        val telefone_recados : String
)