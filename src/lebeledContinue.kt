fun gatName(name1 : String , name2 : String) : String = "$name1 $name2"

fun main(a: Array<String>){
    var num = 4.55;
    var num2 = 5.5;
    println(addMore(num, num2))

    println(gatName("Masjidul", "Robin"))
   here@ for (i in 1..5){
        for (j in 1..4){
            if (i == 4 || j == 4)
                continue@here
            println("i = $i : j = $j")
        }
    }
}
fun addMore(n1 : Double, n2 : Double): Int {
    var sum = (n1+n2).toInt()
    return  sum
}