package com.example.demo.domainc
typealias jians=(Int, Int)->Int
data class User(val name: String, val age: Int)
data class Employees(val name: String, val age:String){

}
data class Mars(var name: String, val age: Int){

}

fun main(args: Array<String>) {
    var jian=User("wang",21)
    var mar =Mars("wang",21)
    mar.name="mark"
//    println(mar.name)
//    var employees=Employees("jian",)
var a:String?
    a="text"

// val l=   a?.equals()?:-1
//println(l)
//    println(employees.age)
//    jian?.apply{
//        println(name)
//        println(age)
//
//    }
    var (name,age)=jian
 var ss ={
     x:Int, y:Int->{
     x+y
 }

 }

    var bb:jians={
        x,y->  if (x < y){
        x
    }else{
        y
    }
    }
//println(ss(1,2))
//    println("myname,$name,myage,$age")
    var list = listOf(1, 2, 3, 4, 5, 6)
//    list.forEach(::println)


//    val newList = list.map {
//        //对集合中的数据进行操作，然后赋值给新的集合
//        (it * 2).toString()
//    }.forEach(::println)
}