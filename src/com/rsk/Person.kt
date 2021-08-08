package src.com.rsk

class Person (var Name: String){

    fun display()
    {
        print("Display: $Name \n")
    }

    fun displayWithLambda(func: (s:String) -> Unit){
        func(Name)
    }
}