package tagliaferro.adriano.agoravai.Venda.endpoint

import org.springframework.http.ResponseEntity
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Venda_Final

class Venda_FinalEndpoint : Contract.Endpoint<Venda_Final> {
    override fun insert(obj: Venda_Final): ResponseEntity<Venda_Final> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(obj: Venda_Final, id: Int): ResponseEntity<Unit> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getById(id: Int): Venda_Final {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<Venda_Final> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(id: Int): ResponseEntity<Unit> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}