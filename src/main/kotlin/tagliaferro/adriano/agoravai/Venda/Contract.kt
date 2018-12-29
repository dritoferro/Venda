package tagliaferro.adriano.agoravai.Venda

import org.springframework.http.ResponseEntity

interface Contract {

    interface Model<T> {
        fun insert(obj: T) : T
        fun update(obj: T)
        fun getById(id: Int): T
        fun getAll(): List<T>
        fun delete(id: Int)
    }

    interface Endpoint<T> {
        fun insert(obj: T): ResponseEntity<Unit>
        fun update(obj: T, id: Int): ResponseEntity<Unit>
        fun getById(id: Int): ResponseEntity<T>
        fun getAll(): ResponseEntity<List<T>>
        fun delete(id: Int): ResponseEntity<Unit>
    }

    interface Service<T> {
        fun insert(obj: T): ResponseEntity<Unit>
        fun update(obj: T): ResponseEntity<Unit>
        fun getById(id: Int): ResponseEntity<T>
        fun getAll(): ResponseEntity<List<T>>
        fun delete(id: Int): ResponseEntity<Unit>
        fun checkExists(id : Int)
    }
}