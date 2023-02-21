import java.util.Scanner;
public class Es1{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        /*
        System.out.println("Inserisci tre numeri");
        
        int a = Integer.parseInt(tastiera.nextLine());
        int b = Integer.parseInt(tastiera.nextLine());
        int c = Integer.parseInt(tastiera.nextLine());
        double media = (a+b+c)/3;
        System.out.println("La media è " + media);*/

        /* Chiedere all'utente un numero di 4 cifre e stampare la prima, 
        seconda terza e quarta cifra 
        2010
        
        2
        0
        1
        0
        */
        System.out.println("Inserisci un numero da 4 cifre");
        int n = Integer.parseInt(tastiera.nextLine());
        System.out.println(n/1000);
        n = n%1000;
        System.out.println(n/100);
        n = n%100;
        System.out.println(n/10);
        n = n%10;
        System.out.println(n);
        
        /**/
        double fa = Double.parseDouble(tastiera.nextLine());
        double gradiCelsius = 5 * (fa - 32 ) / 9;
        gradiCelsius = Math.round(gradiCelsius*100)/100.0;
    }
}