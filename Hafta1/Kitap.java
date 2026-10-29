package com.Hafta1;

/**
 *
 * @author BURAK
 */
public class Kitap {

    String kitapAdi;
    String kitapBolum;
    int isbn;

    public Kitap(String kitapAdi, String kitapBolum, int isbn) {
        this.kitapAdi = kitapAdi;
        this.kitapBolum = kitapBolum;
        this.isbn = isbn;
    }

    public Kitap() {
    }




    public void kitapYazdir(){
        System.out.println("Kitap Adı: "+kitapAdi);
        System.out.println("Kitap Bolum: "+kitapBolum);
        System.out.println("Kitap ISBN: "+isbn);
    }




}