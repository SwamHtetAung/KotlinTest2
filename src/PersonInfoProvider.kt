interface PersonInfoProvider {
    val infoProvider : String

    fun printInfo(p1 : Person){
        println(infoProvider)
        p1.display()

    }
}
// 2 => [variable] infoProvider, [method]printInfo

interface SessionInfoProvider {
    fun printSession ()
}
// 1 => [method]printSession

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{

    protected open val sessionPrefix = "Session"

    override val infoProvider: String
        get() = "BasicInfoProvider"

    override fun printSession(){
        return println(sessionPrefix)
    }
}
// own nothing, extended 2 Interfaces [PersonInfoProvider, SessionInfoProvider]

fun checkType (provider : PersonInfoProvider){
    if (provider is SessionInfoProvider) println("yes, PersonInfoProvider") else println("no, it's not")
    (provider as SessionInfoProvider).printSession()
}
// checking type using a variable using keyword "is", change variable type using keyword "as"


fun main() {
    val info = object : BasicInfoProvider(){
        override val infoProvider: String
            get() = "Object test"

    }
    info.printInfo(Person())
    println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
    checkType(info)

}


// 2 interfaces, 1 class, 1 method