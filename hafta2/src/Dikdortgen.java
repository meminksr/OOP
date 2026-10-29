public class Dikdortgen {
    double en;
    double boy;

    public Dikdortgen() {

    }

    public Dikdortgen(double en) {
        this.en = en;
    }

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    public void alanHesapla() {
        double alan = en * boy;
        System.out.println("alan hesabı" + alan);
    }

    public void cevreHesapla() {
        double cevre = (en * boy)*2;
        System.out.println("cevre hesabı" + cevre);
    }
    public void kareAlan() {
        double kare = en * en;
        System.out.println("kare alan hesabı" + kare);
    }
}



