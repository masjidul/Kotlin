fun main(a: Array<String>){
    for (i in 1..5) println(i);
    for (i in 5..20 step 2) println(i)
    for (i in 5 downTo 1) println(i)

    var pnames= arrayOf("c", "c++", "python", "java")
    for(item in pnames)
        println(item)

    for(item in pnames.indices){
        println(item)
        if(item%2 == 0)
            println(pnames[item])
    }

    var me = "robin";
    for (letter in me ){
        println(letter)
    }
    var ab : Int
    var sum = 0
    for(i in 1..5){
        println("enter a number: ")
        ab = readLine()!!.toInt()
        if (ab<=0)
            continue
        sum +=ab
    }
    println(sum)
}