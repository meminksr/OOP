public class Main {
    public static void main(String[] args) {
        Arac a1 = new Arac("01 ABC 01");
        Arac a2 = new Arac("31 XYZ 31");
        System.out.println(a1.getId());
        System.out.println(a2.getId());
        System.out.println(
                Arac.getToplamArac());
    }
}
