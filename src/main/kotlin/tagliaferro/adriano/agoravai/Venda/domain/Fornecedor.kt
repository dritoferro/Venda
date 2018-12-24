package tagliaferro.adriano.agoravai.Venda.domain

data class Fornecedor(
        val _id : Int,
        val razao_social : String,
        val nome_fantasia : String,
        val cnpj : String,
        val endereco_id : Endereco,
        val telefone_id : Telefone,
        val email : String
)