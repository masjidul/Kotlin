class lamp(){
    private var isOn : Boolean = false;
    fun lightOn(){
        isOn = true;
    }
    fun lightOff(){
        isOn = false;
    }
    fun displayStatus(){
        if (isOn == true){
            println("Light is On")
        } else{
            println("Light is Off")
        }
    }
}

fun main(a: Array<String>){
    var light = lamp()
    //light.lightOn()
    light.displayStatus()
}