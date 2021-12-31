fun main(args : Array<String>){
    val numbers = intArrayOf(1,5,7,8,9)
    if (50 in numbers){
        println("50 in numbers array")
    }
    else{
        println("not in numbers")
    }

    //index access operator
    println(numbers[2])
    numbers[2] = 12;
    println(numbers[2])
}