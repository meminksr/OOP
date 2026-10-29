void main() {

    Dikdortgen d1 = new Dikdortgen();
    d1.en = 4.0;
    d1.boy = 8.0;
    Dikdortgen d2 = new Dikdortgen(6.0);
    Dikdortgen d3 = new Dikdortgen(5.0, 3.0);
    System.out.println("d1 değeri");
    d1.alanHesapla();
    d1.cevreHesapla();
    System.out.println("d2 değeri");
    d2.kareAlan();
    System.out.println("d3 değeri");
    d3.alanHesapla();
    d3.cevreHesapla();

}