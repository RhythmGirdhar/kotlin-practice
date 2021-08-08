package src

import src.com.rsk.Person
import java.io.FileReader
import java.io.IOException
import java.util.*


fun main(args: Array<String>){
    print("Hello World\n")

    val rhythm = Person("Rhythm")
    rhythm.display()
    rhythm.displayWithLambda(::printName)
    print("Name is ${rhythm.Name}")


    var numbers = listOf(1,2,3,4,5)
    for(i in numbers){
        println(i)
    }

    var ages = TreeMap<String, Int>()
        ages["Rhythm"] = 23
        ages["Sachchit"] = 29
        ages["Vamshi"] = 28

    for((name, age) in ages){
        println("$name is $age")
    }

    for ((index, element) in numbers.withIndex()){
        println("$element is at $index")
    }


    var reader = FileReader("filename")
    try{
        reader.read()
    } catch(e:IOException){

    }finally{

    }
}

fun printName(name: String){
    println(name)
    var q:Question? = Question()
    q?.Answer = "42"
    println("The answer is ${q?.Answer}")

    var number: Int? = try{
        Integer.parseInt(q?.Answer)
    }catch(e:NumberFormatException){
        null
    }

    print(number)
    q?.display()
 //   q = Question()
}

class Question{
   var Answer: String? = null
   var Question: String = "What is the meaning of life?"

    var CorrectAnswer: String = "42"
    fun display(){
        println("You said $Answer")
    }

    fun printDisplay(){
        when (Answer) {
            CorrectAnswer -> print("Answer is correct")
            else -> print("Answer is wrong")
        }
    }
}

