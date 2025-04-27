package com.example.intokotlin.standart_programlama

fun main(){

    val yas = 17

    if(yas >= 18){ // true
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz")
    }

    val ka = "admin"
    val s = 123456
    val sayi = 10

    if((ka == "admin") && (s == 123456)){ // && = And(ve), true && true ise true olur, diğer durumlarda false olur.
        println("Hoşgeldiniz")
    }else{
        println("Hatalı giriş")
    }

    if((sayi == 9) || (sayi == 10)){ // || = Or(veya), false || false ise false olur, diğer durumlarda true olur.
        println("Sayı 9 veya 10'dur.")
    }else{
        println("Sayı 9 veya 10 değildir.")
    }

    // When, Diğer dillerde Switch
    val number = 1

    when(number){
        1 -> println("Sayı 1'dir")
        2 -> println("Sayı 2'dir")
        else -> println("Tanımlanmayan sayı")
    }
}