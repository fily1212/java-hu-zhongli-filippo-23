import java.util.Scanner;
public class Booleani {
    public static void main(String[] args) {
        // not !
        // and &&
        // or ||
        Scanner tastiera = new Scanner(System.in);
        boolean a = true;
        boolean b = false;
        // == != < > <= >=
        int num = Integer.parseInt(tastiera.nextLine());
        boolean positivo = num > 0;
        boolean pari = num % 2 == 0;
        // true se...
        // numero compreso tra 0 e 10
        boolean compreso = num <=10 && num >=0;
        //  numero pari o minore di 5
        boolean pari5 = num % 2 == 0 || num < 5; 
        // numero maggiore di 1000 che finisce per 3
        boolean maggiore = num > 1000 && num % 10 == 3;
        // se è un anno bisestile se è divisibile per 4 e non per 100, 
        // o se è divisibile per 400
        // 2012: SI 2020: SI 2000: SI 1900:NO 2100: NO 2023: NO
        boolean bisestile = num % 4 == 0 && !(num % 100 ==0) || num % 400 == 0;

        // non è un triangolo se un lato è più grande della somma degli altri due
        int n1=1,n2=2,n3=2;
        boolean triangolo = (n1 < n2+n3) && (n2 < n1 + n3 ) && (n3 < n1+n2);

    }    
}
