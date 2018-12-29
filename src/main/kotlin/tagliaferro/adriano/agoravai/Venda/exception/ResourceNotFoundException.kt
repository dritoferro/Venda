package tagliaferro.adriano.agoravai.Venda.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class ResourceNotFoundException(override val message: String?) : RuntimeException()