abstract class Animal(name : String){
    init {
        println("My name is Robin")
    }
    fun displayWeight(wt: Int){
        println("")
    }
    abstract fun displayJob(details : String);
}

class Human(name: String) : Animal(name){
    override fun displayJob(details: String){
        println(details)
    }
}

fun main(a: Array<String>){
    var human = Human("Robin")
    human.displayWeight(74)
    human.displayJob("I am a Student")
}