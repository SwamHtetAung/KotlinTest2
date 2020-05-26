import java.util.*

enum class EntitiyType{
    help,
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
            EntitiyType.help -> type.getUppedName()
        }
        return when(type){
            EntitiyType.easy -> Entity.Easy(id, name)
            EntitiyType.medium -> Entity.Medium(id, name)
            EntitiyType.hard -> Entity.Hard(id, name, 2f)
            EntitiyType.help -> Entity.Help
        }
    }
}

sealed class Entity {
    object Help : Entity() {
        val name = "Help (from sealed class)"
    }
    data class Easy(var id: String, var name: String) : Entity()
    data class Medium(var id: String, var name: String) : Entity()
    data class Hard(var id: String, var name: String, var multiply : Float) : Entity()
}


fun main() {
    val EasyEntity : Entity = EntityFactory.create(EntitiyType.help)
    val msg = when(EasyEntity){
        Entity.Help -> Entity.Help.name
        is Entity.Easy -> "Easy"
        is Entity.Medium -> "Medium"
        is Entity.Hard -> "Hard"
    }
    println(msg)
}
