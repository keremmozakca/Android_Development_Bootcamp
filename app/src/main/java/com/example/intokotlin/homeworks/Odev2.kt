package com.example.intokotlin.homeworks

class Odev2 {
    // Convert celcius to fahrenheit
    fun celciusToFahrenheit(C: Double) : Double{
        return 1.8 * C + 32
    }

    fun dikdortgenCevreHesapla (en: Double, boy: Double){
        println("Dikdörtgenin Çevresi: ${2 * (en + boy)}")
    }

    fun faktoriyelHesapla(sayi: Int) : Int{
        if(sayi >= 0){
            if(sayi == 0 || sayi == 1){
                return 1
            }else{
                return sayi * faktoriyelHesapla(sayi - 1)
            }
        }else{
            println("Negatif sayılar için faktöriyel hesaplanamaz.")
            return 0
        }
    }

    fun aHarfiSayaci(metin: String){
        var sayac = 0
        for (harf in metin){
            if((harf == 'a') || (harf == 'A')){
                sayac++
            }
        }
        println("Girilen Metin: $metin \n " +
                "A Harfi Sayısı: $sayac")
    }

    fun icAcilarToplami(kenarSayisi: Int): Int{
        return (kenarSayisi-2) * 180
    }

    fun maasHesapla(calismaSaati: Int) : Int{
        val calismaSaatBasi = 10
        val mesaiSaatBasi = 20
        var kazanc = 0
        if(calismaSaati > 160){
            var mesaiSaati = calismaSaati - 160
            var calismaUcret = calismaSaatBasi * 160
            var mesaiUcret = mesaiSaati * mesaiSaatBasi
            kazanc = calismaUcret + mesaiUcret
        }else{
            kazanc = calismaSaati * calismaSaatBasi
        }
        return kazanc
    }

    fun internetFaturaHesaplama(kota : Int, harcanan: Int) :Int{
        val gigabyteBasi = 2
        val asimUcreti = 4
        if(harcanan > kota){
            return (kota * gigabyteBasi) + (harcanan - kota) * asimUcreti
        }else{
            return harcanan * gigabyteBasi
        }
    }

    fun test_ornegi(){
        var fahrenheit = celciusToFahrenheit(25.0)
        println("25 Celsius is equal to $fahrenheit degree")
        println("--------------------------------")
        dikdortgenCevreHesapla(10.0, 20.0)
        println("--------------------------------")
        var faktoriyelSonuc = faktoriyelHesapla(6)
        println("6! = $faktoriyelSonuc")
        println("--------------------------------")
        aHarfiSayaci("Korkma! Sönmez bu şafaklarda yüzen al sancak")
        println("--------------------------------")
        var besgenIcAcilarToplami = icAcilarToplami(5)
        println("Beşgenin iç açılar toplamı $besgenIcAcilarToplami'dır.")
        println("--------------------------------")
        var maas1 = maasHesapla(180)
        var maas2 = maasHesapla(100)
        println("Maaş 1: $maas1")
        println("Maaş 2: $maas2")
        println("--------------------------------")
        var internetFatura1 = internetFaturaHesaplama(10, 9)
        var internetFatura2 = internetFaturaHesaplama(20, 26)
        println("İnternet Faturası 1: $internetFatura1")
        println("İnternet Faturası 2: $internetFatura2")
    }
}