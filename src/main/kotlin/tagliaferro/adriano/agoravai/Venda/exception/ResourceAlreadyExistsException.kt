package tagliaferro.adriano.agoravai.Venda.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.CONFLICT)
class ResourceAlreadyExistsException(override val message: String? = "Este objeto já possui Id") : RuntimeException()