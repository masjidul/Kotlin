fun main(args: Array<String>){
    var name = "Masjidul"
    var num = 45.55F //compiler automatically understands data types Ctrl+Shift+P to know data types
    val constant = 1109 //val cant be changed
    println("$num")
    println("value: "+name);

    //alternative way
    var name2 : String
    name2 = "Robin";

    //if i dont sure about data types
    var test : Number = 34.5
    test = 23
    test = 67L //casting types

    println("$test")
}