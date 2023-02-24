package lezione3;

import java.util.Scanner;

public class EsIf {
    public static void main(String[] args) {
        /* Inserisci un nome, se inizia per A
        scrivi ciao altrimenti buongiorno */
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String nome = tastiera.nextLine();
        if (nome.substring(0,1).equalsIgnoreCase("A"))
            System.out.println("Ciao");
        else
            System.out.println("Buongiorno");

        /* inserire giorno e mese e dire se può essere una data*/

    }
}
