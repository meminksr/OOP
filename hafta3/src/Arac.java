public class Arac {
    private  int toplamArac = 0;
    private final int id;
    private String plaka;

    public Arac(String plaka) {
        toplamArac++;
        this.id = toplamArac;
        this.plaka = plaka;
    }

    public int getToplamArac() {
        return toplamArac;
    }

    public int getId() {
        return id;
    }
}