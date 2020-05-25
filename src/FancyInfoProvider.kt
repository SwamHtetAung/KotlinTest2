class FancyInfoProvider : BasicInfoProvider() {
    override val infoProvider: String
        get() = "Fancy Info Provider"

    override fun printInfo(p1: Person) {
        super.printInfo(p1)
        println("Fancy Info")
    }

    override val sessionPrefix: String
        get() = "PrintSession from checkType method - Fancy Session"

}

