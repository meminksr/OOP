public class Personel {
    private final int personelNo;
    private String adSoyad;
    private double maas;

    private static int personelSayisi = 0;

    public Personel(String adSoyad, double maas) {
        personelSayisi++;
        this.personelNo = personelSayisi;
        setAdSoyad(adSoyad);
        setMaas(maas);


    }

    public double getMaas() {
        return maas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setMaas(double maas) {
        if (maas > 0) {
            this.maas = maas;
        } else {
            System.out.println("gecersiz sayi");
        }
    }

    public static int getPersonelSayisi() {
        return personelSayisi;
    }

    public void bilgileriGoster() {
        System.out.println("Personel No: " + personelNo);
        System.out.println("Personel Ad Soyad: " + adSoyad);
        System.out.println("Maas: " + maas + " TL");
        System.out.println("------------------------------");
    }


}

