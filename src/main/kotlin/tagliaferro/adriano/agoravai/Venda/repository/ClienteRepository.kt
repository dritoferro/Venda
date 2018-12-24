package tagliaferro.adriano.agoravai.Venda.repository

import org.springframework.data.repository.PagingAndSortingRepository
import tagliaferro.adriano.agoravai.Venda.domain.Cliente

interface ClienteRepository : PagingAndSortingRepository<Cliente, Int> {
}