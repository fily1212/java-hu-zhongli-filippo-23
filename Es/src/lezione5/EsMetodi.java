package lezione5;

import java.util.Random;
import java.util.Scanner;

public class EsMetodi {
    /** metodo dado() che restituisce un numero da 1 a 6. Usare la classe Random
     * @return      int da 1 a 6
     */
    public static int dado(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    /**
     * metodo tuttiPari(int n) che chiede n numeri e ritorna true se sono tutti pari
     * non usare array (non memorizzare i numeri)
     * @param n quanti numeri chiedere
     * @return      true se tutti i numeri chiesti sono pari, altrimenti false
     */

    public static boolean tuttiPari(int n) {

        Scanner tastiera = new Scanner(System.in);
        boolean pari = true;
        for(int i = 0; i< n; i++){
            int num = Integer.parseInt(tastiera.nextLine());
            /*if (num % 2 != 0 ){
                pari = false;
            }*/
            pari = pari && num % 2 == 0;
        }
        return pari;

    }

    public static String soloVocali(String s){
        String vocali = "";

        for(int i = 0; i < s.length(); i++ ){
            if("AEIOUaeiou".contains(s.substring(i,i+1)))
                vocali += s.substring(i,i+1);
        }
        return vocali;

    }
    /**
    * metodo soloVocali(String s) che restituisce le vocali della stringa
     * esempio: "Ciao come stai?" -> "iaooeai"
     * @param   s   una stringa
     * @return      le vocali della stringa
     * */

    /*
    * Scrivere un programma ContinuaFino che chiede all'utente di inserire una sequenza di
interi. Il programma continua a chiedere all'utente di inserire valori
 tanto che i valori inseriti soddisfano
almeno una delle seguenti condizioni:
- è negativo e divisibile per 2
- è positivo e divisibile per 3
Al termine il programma stampa la somma di tutti i valori inseriti escluso quello ha violato le condizioni.
Risolvere questo esercizio senza usare array.
* */
    public static int continuaFino(){
        Scanner tastiera = new Scanner(System.in);
        boolean continua = true;
        int somma = 0;
        while(continua){
            int num = Integer.parseInt(tastiera.nextLine());
            if(num < 0 && num % 2 == 0 || num > 0 && num % 3 == 0){
                somma += num;
            }else
                continua = false;
        }
        return somma;
    }

    public static void main(String[] args) {
        System.out.println(dado());
//        System.out.println(tuttiPari(5));
        System.out.println(continuaFino());
    }

}
