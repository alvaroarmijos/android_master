package com.example.androidmaster

fun main(){
//    inmutableList()
    mutableList()
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    weekDays.add(0, "Holiday")
    println(weekDays)

}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")

    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())

    //Filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach { println(it) }

}