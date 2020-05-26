import java.util.*

enum class EntitiyType{
    Easy,
    Medium,
    Hard
}

object EntityFactory {
    fun create(type : EntitiyType) : Entity{
        var id = UUID.randomUUID().toString()
        val name = when(type){
            EntitiyType.Easy -> "Easy"
            EntitiyType.Medium -> "Medium"
            EntitiyType.Hard -> "Hard"
        }
        return Entity(id, name)
    }
}

class Entity (val id : String, val name : String){
    override fun toString(): String {
        return ("id:$id \nlevel:$name")
    }
}


fun main() {
    val EasyEntity = EntityFactory.create(EntitiyType.Easy)
    println(EasyEntity)

    val MediumEntity = EntityFactory.create(EntitiyType.Medium)
    println(MediumEntity)

}
