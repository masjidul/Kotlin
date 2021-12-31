class People{
    val msg = "I am Robin";
    class Robin{
        fun fooo(){
            println("I create this things");
        }
    }
}

class Outer{
    var msg2 = "I am from Outer"
    inner class Inner{
        fun msgT() = msg2
    }
}
data class User(val name:String, var age : Int);
fun main(a: Array<String>){
    var may = People.Robin()
    var mayb = People()
    may.fooo()
    var msg4 = Outer().Inner()
    msg4.msgT()
    println("From Outer: ${Outer().Inner().msgT()}")

    var user = User("ROBIN", 22)
    println(user.component2())
    var user2 = user.copy("Hamad")
    var u3 = user2.copy()

    //destructuring
    var (name, age) = user
    println(name)

    if (user.equals(user2) == true){
        println("they are equal")
    } else{
        println("NOT equal")
    }
     if(user2.equals(u3) == true){
        println("they are equal")
    } else{
        println("NOT equal")
    }

    println(user.hashCode())
    println(user2.hashCode())
}