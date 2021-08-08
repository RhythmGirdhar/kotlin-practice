package src.com.rsk

fun main(args: Array<String>){
    val text = "With     Multiple      Whitespace"
    println(replaceWithWhiteSpace(text))
    println(text.replaceWithWhiteSpaceEx())
}

fun replaceWithWhiteSpace(value: String): String{
    var regex = Regex("\\s+")
    return regex.replace(value, "+")
}

fun String.replaceWithWhiteSpaceEx(): String{
    var regex = Regex("\\s+")
    return regex.replace(this, "+")
}