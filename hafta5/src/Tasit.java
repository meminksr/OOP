public class Tasit {
    private String marka;
    private int hiz;

    Tasit(String marka, int hiz) {
        this.marka = marka;
        this.hiz = hiz;
    }

    public String getMarka() {
        return marka;
    }

    public int getHiz() {
        return hiz;

    }
    public void bilgiGoster(){
        System.out.println(marka+"-"+hiz);
    }

}
