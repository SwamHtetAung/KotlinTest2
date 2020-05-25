class Entity private constructor(val id : String){
    companion object{
        const val id = "id"
        fun create() = Entity(id)

    }
}

fun main() {
    val entity = Entity.create()
    println(entity.id)
}