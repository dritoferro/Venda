package tagliaferro.adriano.agoravai.Venda.repository

import org.springframework.data.repository.PagingAndSortingRepository
import tagliaferro.adriano.agoravai.Venda.domain.Venda_Final

interface VendaFinalRepository : PagingAndSortingRepository<Venda_Final, Int> {
}