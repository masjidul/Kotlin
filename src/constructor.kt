class Behaviour(name : String , age : Int){
    val fname : String
    val ageP : Int
    init {
        fname = name.capitalize();
        ageP = age
        println(fname);
        print(ageP)

    }
}

fun main(a: Array<String>){
    val info = Behaviour("robin", 22)
    val p1 = AuthLog("Bad Name")
}

open class Log(){
    var data: String = ""
    var no_Data = 0
    constructor(_data: String) : this() {

    }
    constructor(_data: String, _no_Data: Int) : this() {
        data = _data
        no_Data = _no_Data
        println("$data: $no_Data times")
    }
}

class AuthLog: Log{
    constructor(_data: String): this("From Authlog -> "+ _data, 10){

    }
    constructor(_data: String, _no_Data: Int): super (_data, _no_Data){

    }
}

/*
open class Log {
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String) {

    }
    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}

class AuthLog: Log {
    constructor(_data: String): this("From AuthLog -> " + _data, 10) {
    }

    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {
    }
}
*/