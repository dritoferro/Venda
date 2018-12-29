package tagliaferro.adriano.agoravai.Venda.domain

data class Produto(
        val _id : Int,
        val descricao : String,
        val fornecedor_id : Fornecedor,
        val quantidade : Int,
        val preco : Double,
        val status : Boolean
)