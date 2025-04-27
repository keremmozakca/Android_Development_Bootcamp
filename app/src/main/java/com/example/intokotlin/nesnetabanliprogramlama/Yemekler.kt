package com.example.intokotlin.nesnetabanliprogramlama

data class Yemekler (var id:Int, var ad: String, var fiyat:Int){
    // Constructor (init metodu)
    // Bu sınıftan nesne oluştuğunda çalışsın.
    init {
        println("***** Nesne Oluştu *****")
    }
    fun bilgiAl(){
        println("--------------------")
        println("Id: ${id}")
        println("Ad: ${ad}")
        println("Fiyat: ${fiyat}")
    }
    // this: Bulunduğu sınıfı temsil eder. Swift dilinde self
    // super: Kalıtım ile bir üst sınıfı temsil eder.
    // data class ne işe yarar? (get, set, equals, hashCode, toString)
}