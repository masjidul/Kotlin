class Structure(){
    infix fun createPyramid(rows : Int){
        var k = 0;
        for (i in 1..rows){
            k = 0
            for (i in 1..rows-i){
                print("  ")
            }
            while(k != i*2-1){
                print("* ")
                ++k
            }
            println()
        }
    }
}


fun main(a: Array<String>){
    val p = Structure()
    p createPyramid 4
    var a = true;
    var b = false;
    var result = a or b;
    println(result)
    result = a and b;
    println(result)
}