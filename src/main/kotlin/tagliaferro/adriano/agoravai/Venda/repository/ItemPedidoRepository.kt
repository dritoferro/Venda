package tagliaferro.adriano.agoravai.Venda.repository

import org.springframework.data.repository.PagingAndSortingRepository
import tagliaferro.adriano.agoravai.Venda.domain.Item_Pedido

interface ItemPedidoRepository : PagingAndSortingRepository<Item_Pedido, Int> {
}