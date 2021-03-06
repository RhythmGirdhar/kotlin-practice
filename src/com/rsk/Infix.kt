package src.com.rsk

fun main(args:Array<String>){

    val h1 = Header("H1")
    val h2 = Header("H2")
    val h3 = h1 plus h2

    println(h3.Name)
}

class Header(var Name: String){}

    infix fun Header.plus(other: Header): Header{
        return Header(this.Name + other.Name)
    }
