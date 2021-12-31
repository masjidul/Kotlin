fun String.removeFirstLastChar():String = this.substring(1, this.length - 1)
fun main(a: Array<String>){
    val mysen = "I am Robin";
    val result = mysen.removeFirstLastChar()
    println(result)
}