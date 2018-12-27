package tagliaferro.adriano.agoravai.Venda.domain

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Cliente(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val _id: Int?,
        val nome: String,
        val cpf: String,
        val data_nascimento: LocalDate,
        val endereco_id: Int,
        val telefone_id: Int,
        val email: String
)