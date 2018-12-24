package tagliaferro.adriano.agoravai.Venda.domain

data class Item_Pedido(
        val _id : Int,
        val produto_id : Produto,
        val quantidade : Int,
        val subtotal : Double
)

