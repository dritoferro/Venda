package tagliaferro.adriano.agoravai.Venda.endpoint

import org.springframework.http.ResponseEntity
import tagliaferro.adriano.agoravai.Venda.Contract
import tagliaferro.adriano.agoravai.Venda.domain.Telefone

class TelefoneEndpoint : Contract.Endpoint<Telefone> {
    override fun insert(obj: Telefone): ResponseEntity<Unit> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(obj: Telefone, id: Int): ResponseEntity<Unit> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getById(id: Int): ResponseEntity<Telefone> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): ResponseEntity<List<Telefone>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(id: Int): ResponseEntity<Unit> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}