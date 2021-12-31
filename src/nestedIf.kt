fun main(a: Array<String>){
    val n1 =3
    val n2 =9
    val n3 = 4

   val max =  if(n1>n2){
        if(n1>n3)
            n1
        else
            n3
    }
    else {
        if(n2 > n3)
            n2
       else
           n3
   }
    println(max)
}