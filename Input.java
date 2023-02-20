import java.util.Scanner;

public class Input {
    /*public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String s = "ciao";
        s = tastiera.nextLine();
        System.out.println("Ciao " + s);
        int a = tastiera.nextInt();
        int b = Integer.parseInt(tastiera.nextLine());
        
        // ESERCIZIO: scrivere un programma che chieda il nome e l'età
        // e stampi tutto ciò
        // chieda l'età solo se il nome termina con "o"

    }*/

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Ciao, mi diresti il tuo nome? ");
        String nome = tastiera.nextLine();
        System.out.println("Quanti anni hai?");
        int eta = Integer.parseInt(tastiera.nextLine());
        System.out.println("Ciao " + nome + ". Hai " + eta + " anni!");
    }
    
}
