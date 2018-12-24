package tagliaferro.adriano.agoravai.Venda.repository

import org.springframework.data.repository.PagingAndSortingRepository
import tagliaferro.adriano.agoravai.Venda.domain.Telefone

interface TelefoneRepository : PagingAndSortingRepository<Telefone, Int> {
}