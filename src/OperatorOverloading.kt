class Over(val x: Int = 0, val y: Int = 10){
    operator fun plus(p: Over): Over{
        return Over(x + p.x, y + p.y)
    }
    //operator fun dec() = Over(--x, --y)
}
fun main(a: Array<String>){
    val xx = 50
    val yy = 20
    val xs = Over(xx, yy)
    val ys = Over(20, 50)
    //var xd = Over(58,96)
   // --xd

    var sums = Over()
    sums = xs + ys

    println("Sum = ${sums.x}, ${sums.y}")


}