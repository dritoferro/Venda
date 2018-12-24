package tagliaferro.adriano.agoravai.Venda.repository

import org.springframework.data.repository.PagingAndSortingRepository
import tagliaferro.adriano.agoravai.Venda.domain.Fornecedor

interface FornecedorRepository : PagingAndSortingRepository<Fornecedor, Int> {
}