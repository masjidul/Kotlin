class Intro{
    companion object test(name: String, age : Int){
        println("My name is $name and age is $age")
    }
}

fun main(a: Array<String>){
    var me = Intro()
    me.test("robin", 22)
}