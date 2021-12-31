fun main(a: Array<String>){
    val n1 = 1;
    val n2 = 4;
    println("enter an valid operator: ");
    val operator = readLine()
    val result = when (operator){
        "+" -> n1+n2;
        "-" -> n1-n2;
        "*" ->n1*n2;
        "/" -> n1/n2;
        else -> ("invalid operator");
    }
    println(result)

    when (operator){
        "+" -> println("${n1+n2}")
        "-" -> println("$n1 - $n2 = ${n1 - n2}")

        else -> println("invalid")
    }

    val n = 0;
    when(n){
        1,2,3 -> println("n is positive")
        0-> println("n is zero")
        -1,-2-> println("n is negative")
    }

    when(n1){
       in 1..10 -> println("positive between 1 -10")
        in 12..100 -> println("positive between 11-100")
    }
    /*var n21 = "i am"
    when(n21){
        is Int -> println(n21 + 2)
        is String -> println(n21.length + 2)
        is IntArray -> println(n21.sum())

        "cat" -> println("Cat?")
        12.toString() -> println("12?")
        2 -> print("2")
    }
    */

    var n22 = "2"
    when(n22){
        "cat" -> println("Cat?")
        12.toString() -> println("12?")
        2.toString() -> print("2")
    }
}