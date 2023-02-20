import java.util.Scanner;
public class OperazioniAritmetiche {
    /* Esercizio: chiedere base e altezza di un rettangolo 
    e restituire il perimetro

    Chiedere il numero dei lati del poligono, 
    farli inserire e restituire il perimetro
    */

    public static void main(String[] args) {
            
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Ciao, mi diresti la tua base? ");
        int base = Integer.parseInt(tastiera.nextLine());
        System.out.println("altezza?");
        int altezza = Integer.parseInt(tastiera.nextLine());
        System.out.println((base+altezza)*2);
        double diagonale = Math.sqrt(Math.pow(base,2)+Math.pow(altezza,2));
        double dApprossimata = Math.round(diagonale*100)/100.0;
        System.out.println(dApprossimata);
    }



}
