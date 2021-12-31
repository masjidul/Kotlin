open class Person(name: String, age : Int){
    init {
        println("my name is : $name")
        println("my age is: $age")
    }
    open var age : Int = 0
    get() = field
    set(value) { field = value

    }

    open fun Quote(age2: Int){
        println("My age is: $age2")
        println("I am a human being!")
    }

}
class Student (name: String, age: Int): Person(name, age){
    fun student(){
        println("I am a Student")
    }
}

class Teacher(name: String, age: Int) : Person(name, age){
    fun teacher(){
        println("I am a teacher")
    }
}

class Girl(name: String, age: Int): Person(name, age){
    override fun Quote(age2: Int){
        println("I am a girl")
    }
}

class Boy(name: String, age: Int): Person(name, age){
   /* get() = field
    set(value) {
        field = value - 5
    } */
    override var age : Int = 0
    override fun Quote(age2: Int){
        super.Quote(age2)
        println("I can repeat this for : ${age2-9}")
    }
    //println("my age is is: $age")
}
    fun main(a: Array<String>){
    var s = Student("Robin", 22)
    s.student()
    var t = Teacher("Kashem", 67)
    t.teacher()
    var g = Girl("Rita", 22)
    g.Quote(45)
    var b = Boy("Rohan", 12)
        b.Quote(56)

}