import java.util.*

enum class EntitiyType{
    easy,
    medium,
    hard;

    fun getUppedName() = name.toUpperCase()
    fun getCapitalName() = name.capitalize()
}

object EntityFactory {
    fun create(type : EntitiyType) : Entity{
        var id = UUID.randomUUID().toString()
        val name = when(type){
            EntitiyType.easy -> type.name
            EntitiyType.medium -> type.getUppedName()
            EntitiyType.hard -> type.getCapitalName()
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
    val EasyEntity = EntityFactory.create(EntitiyType.easy)
    println(EasyEntity)

    val MediumEntity = EntityFactory.create(EntitiyType.medium)
    println(MediumEntity)

    val HardEntity = EntityFactory.create(EntitiyType.hard)
    println(HardEntity)

}
