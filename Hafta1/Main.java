package com.Hafta1;


public class Main {
    public static void main(String[] args) {

        Ogrenci s1 = new Ogrenci();
        s1.ad="Ayse";
        s1.bolum="Bilgisayar";
        s1.numara=123456;
        s1.bilgiYazdir();

        Ogrenci s2 = new Ogrenci();
        s2.ad="Ahmet";
        s2.bolum="Harita";
        s2.numara=8975;
        s2.bilgiYazdir();

        Kitap k1 =new Kitap("Suc ve Ceza","Deneme",12364);
        k1.kitapYazdir();

        Kitap k2 = new Kitap();
        k2.kitapAdi="Sefiller";
        k2.kitapBolum="Test2";
        k2.isbn=46524;
        k2.kitapYazdir();

    }
}