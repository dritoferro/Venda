package tagliaferro.adriano.agoravai.Venda.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.BAD_REQUEST)
class ResourceWithoutIdException(override val message : String? = "Objeto sem id especificado") : RuntimeException()