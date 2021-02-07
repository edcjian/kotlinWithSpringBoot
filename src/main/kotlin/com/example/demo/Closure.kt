package com.example.demo

import java.util.stream.IntStream

typealias stds=(Int, Int) -> Int
fun makeFun():()->Unit{
    var conut = 0
    return fun(){   //返回一个匿名函数，这个函数持有count的状态
        println(++conut)
    }
}

var cl =fun(x: Int, y: Int): Int {
    return x + y
}
var sums :stds ={x, y->x+y}
val sum = { x: Int, y: Int -> x + y }
fun adds(x:Int,sum: stds = { x, y -> x + y }): Int {
return x+sum(x,3)
}
infix fun Int.add(x: Int): Int {
    return this + x
}
//val product = items.fold(1) { acc:Int, e:Int -> acc * e }
fun jars(x:Int,y:Int):Int=x+y
fun main() {
//    val mMap = mutableMapOf(0 to "秦", 1 to "川", 2 to "小", 3 to "将")
//    mMap.put(4, "kotlin")
//    mMap.put(5, "in")
//    mMap.put(6, "android")
////    println(mMap)
//mMap.mapValues { entry ->"${entry.value}"}.forEach(::println)
    var b:String?="asd"
    var c:Int?=null
    var j =c?.toString() ?:-1
//    val l = b?.length ?: -1
//    println(l)
    println(j)
//    var cars =mapOf()
//var lists = 1..10
//
//    lists.filter{
//     it>3
//   }.map(::println)
//    val makeFun = makeFun() //函数调用，返回一个函数
//    makeFun()       //调用这个返回的函数，此时makeFun持有makeFun()内部变量的状态
//    makeFun()
//    makeFun()
//   println(adds(1))
//    println(100 add 200)
//    println(cl(1,2))
}
