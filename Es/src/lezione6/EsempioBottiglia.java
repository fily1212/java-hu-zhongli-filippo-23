package lezione6;

public class EsempioBottiglia {
    public static void main(String[] args) {
        Bottiglia b1 = new Bottiglia(500);
        System.out.println(b1);
        b1.riempi(-500);
        System.out.println(b1);
        b1.svuota(50);
        System.out.println(b1);
    }
}
