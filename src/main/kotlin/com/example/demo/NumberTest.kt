package com.example.demo

 open class NumberTest(num: Int) {
private var num :Int = num

    companion object Hello{
        @JvmField
        var flag = false
        @JvmStatic
        fun plus(num: Int):Int {
            return num
        }
    }
    fun kali(num:Int){
//     var colors =listOf("red","blue")
//        println(colors)
        when(num){
            1 -> {println("i am 1")}
            2 -> {println("iam 2")}
        }
    }
}
fun NumberTest.ubuntu(){
    for (i in 9 downTo 1) print(i)

}
class body(): NumberTest(2) {
fun cent(){
super.kali(2)
}
}

fun main(args: Array<String>) {
   var ns =NumberTest(2)
    ns.ubuntu()
//   ns.kali(2)
//    var bo =body()
//bo.cent()
}