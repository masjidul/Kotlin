fun passArg(ch : Char = 'M', num : Int = 11){
    for (i in 1..num){
        println(ch)
    }
}

fun recurseFactorial(num : Int) :Long{
    return if (num == 1)
        num.toLong()
    else num*recurseFactorial(num-1);
}
tailrec fun Factorial(n : Int, run : Int = 1): Long{
    return if (n == 1) run.toLong() else Factorial(n-1, run*n)
}

fun main(a: Array<String>){
    println(Factorial(5))
    passArg('X', 5)
    println(recurseFactorial(5))
}