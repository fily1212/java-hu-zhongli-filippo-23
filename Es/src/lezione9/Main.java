package lezione9;

import lezione6.Bottiglia;

public class Main {
    public static void main(String[] args) {
        Bottiglia b = new BottigliaConTappo(1500);
        System.out.println(b);
        b.riempi(1300);
        ((BottigliaConTappo)b).chiudi();
        BottigliaConTappo bt = (BottigliaConTappo)b;
        //bt.apri();
        Bottiglia b1 = bt;
        System.out.println(b);
        System.out.println(bt);
        System.out.println(b1);
        BottigliaMateriale bm = new BottigliaMateriale(750, Materiale.VETRO);
        System.out.println(bm);
        Materiale m = Materiale.VETRO;
    }
}
