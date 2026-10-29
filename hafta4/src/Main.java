void main() {

    Personel p1 = new Personel("Ahmet", 30000);
    Personel p2 = new Personel("Mehmet", 20000);
    Personel p3 = new Personel("Ayse", 50000);
    Personel p4 = new Personel("Ali", 10000);
    p1.bilgileriGoster();
    p2.bilgileriGoster();
    p3.bilgileriGoster();
    p4.bilgileriGoster();

    p1.setMaas(40000);
    p2.setMaas(-5000);

    System.out.println("p1 yeni deger: " + p1.getMaas());

    System.out.println("Toplam Personel Sayisi: " + Personel.getPersonelSayisi());

}