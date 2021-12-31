open class Persons(name : String, age : Int){
    init {
        println("I am $name and age is $age")
    }
    fun general() = println("I eat food")
    open fun entertain() = println("I dont want to make fun of anyone")
}
fun main(a: Array<String>){
    var p1 = object : Persons("Robin", 22){
         override fun entertain() = println("I make fun")
    }
    p1.entertain()
    p1.general()
}