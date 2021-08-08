package src.com.rsk
    fun main(args:Array<String>)
    {
        display("Hello, World")
    }

    fun display(message:String, loglevel: Int = 1): Boolean{
        println(message + loglevel)
        return true
    }

fun max(a:Int, b:Int): Int = if(a>b) a else b
