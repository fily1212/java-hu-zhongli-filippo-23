package lezione3;

import java.util.Scanner;

public class DataCorretta {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un giorno: ");
        int giorno = tastiera.nextInt();
        System.out.println("Inserisci un mese: ");
        int mese = tastiera.nextInt();
        int soglia = 31;
        if(mese == 2)
            soglia = 28;
        else if(mese == 1 || mese == 3 || mese == 5 || mese == 7 ||
                mese == 8 || mese == 10 || mese == 12)
            soglia = 31;
        else if(mese == 4 || mese == 6 || mese == 9 || mese == 11)
            soglia = 30;
        boolean corretto = 1 <= mese && mese <= 12  &&
                1 <= giorno && giorno <= soglia;


        if(corretto) System.out.println("OK");
        else System.out.println("NO");
    }
}
