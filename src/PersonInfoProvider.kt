interface PersonInfoProvider {
    val infoProvider : String

    fun printInfo(p1 : Person){
        p1.nickName = "James"
        println(infoProvider)
        p1.display()
    }
}

interface SessionInfoProvider {
    fun printSession ()
}

class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
    override val infoProvider: String
        get() = "BasicInfoProvider"


    override fun printSession(){

        return println("SessionID")
    }
}


fun main() {
    val info = BasicInfoProvider()
    info.printInfo(Person())
    checkType(info)

}

fun checkType (provider : PersonInfoProvider){
    if (provider is SessionInfoProvider) println("yes, PersonInfoProvider") else println("no, it's not")
    (provider as SessionInfoProvider).printSession()

}