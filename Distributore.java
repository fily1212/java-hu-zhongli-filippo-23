import java.util.Scanner;
public class Distributore {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero da 1 a 99");
        int centesimi = Integer.parseInt(tastiera.nextLine());
        int cent50 = centesimi / 50;
        centesimi = centesimi - cent50*50;
        int cent20 = centesimi / 20;
        centesimi = centesimi - cent20*20;
        int cent10 = centesimi / 10;
        centesimi = centesimi - cent10*10;
        int cent5 = centesimi / 5;
        centesimi = centesimi - cent5*5;
        int cent2 = centesimi / 2;
        centesimi = centesimi - cent2*2;
        int cent1 = centesimi;
        System.out.println("monete da 50 cent: " +cent50 + "\n" +
        "monete da 20 cent: " +cent20 + "\n" +
        "monete da 10 cent: " +cent10 + "\n" +
        "monete da 5 cent: " +cent5 + "\n" +
        "monete da 2 cent: " +cent2 + "\n" +
        "monete da 1 cent: " +cent1);        
    }
}
