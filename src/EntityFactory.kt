import java.util.*

object EntityFactory {
    fun create() = Entity(UUID.randomUUID(), "balls")
}

class Entity (val id : UUID, val name : String){
    override fun toString(): String {
        return ("id:$id \nname:$name")
    }
}

enum class Months{
    January,
    February,
    March
}

fun main() {
    val entity = EntityFactory.create()
    println(entity)

    val month = Months.January.toString()
    println(month)
}
