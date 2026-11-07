public class Araba extends Tasit{
    private int kapiSayisi;
    public Araba(String marka, int hiz, int kapiSayisi) {
        super(marka, hiz);
        this.kapiSayisi = kapiSayisi;
    }
    public int getKapiSayisi() {
        return kapiSayisi;
    }
}
