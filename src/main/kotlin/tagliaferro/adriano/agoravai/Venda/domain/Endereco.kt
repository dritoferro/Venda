package tagliaferro.adriano.agoravai.Venda.domain

data class Endereco(
        val _id : Int,
        val endereco_rua : String,
        val endereco_num : Int,
        val endereco_comp : String,
        val endereco_bairro : String,
        val endereco_cep : String,
        val endereco_cidade : String,
        val endereco_uf : String
)