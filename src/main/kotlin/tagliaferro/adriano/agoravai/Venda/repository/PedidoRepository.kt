package tagliaferro.adriano.agoravai.Venda.repository

import org.springframework.data.repository.PagingAndSortingRepository
import tagliaferro.adriano.agoravai.Venda.domain.Pedido

interface PedidoRepository : PagingAndSortingRepository<Pedido, Int> {
}