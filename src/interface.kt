interface Robin{
   fun attitude(){
        println("idk")
    }
    fun about() {
        println("got own shape")
    }
}
interface Peoples{
    fun about(){
        println("different in shapes")
    }
}

class Robot : Robin, Peoples {
    override fun about(){
        super<Robin>.about()
        super<Peoples>.about()
    }
}

fun main(a: Array<String>){
    var obj = Robot()
    obj.about()


}