class Age() {
    var age: Int = 0
        get() = field
        set(value) {
            field = if (value < 18)
                18
            else if (value >= 18 && value <= 30) {
                value
            } else
                value - 3
        }
    var actualAge : Int = 0
}

fun main(a: Array<String>){
    var mira= Age()
    mira.age= 18
    mira.actualAge = 18
    println("Mira's pretended age is: ${mira.age}");
    println("Mira's pretended age is: ${mira.actualAge}");

    var Fatiha= Age()
    Fatiha.age= 25
    Fatiha.actualAge = 28

    println("Fatiha's pretended age is:${Fatiha.age} ");
    println("Fatiha's age is:${Fatiha.actualAge} ")
}