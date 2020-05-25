class Person (val firstName: String = "Peter", val lastName: String = "Parker"){
    var nickName : String? = null

    fun display (){
        var nickNameToDisplay  = nickName ?: "no nickName"
        println("$firstName ($nickNameToDisplay) $lastName")
    }
}



// 2 => [variable] nickName, [method] display