package com.example.intokotlin.nesnetabanliprogramlama

fun main(){
    val f = Fonksiyonlar()

    //void: Unit
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç: $gelenSonuc")

    //parametre
    f.selamla3("Zeynep")

    f.topla(10, 20, "Beyza")
}