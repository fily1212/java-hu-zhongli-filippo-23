package lezione7;

public class Ricorsione {

    public static void m1(){
        //if(CONDIZIONE PER TERMINARE)
            // caso base
        //else
        // chiamata ricorsiva
        m1();
    }

    public static void countdown(int i){
        System.out.println(i);
        if(i > 0 )
            countdown(i-1);
    }

    /*ES1: fattoriale */
    public static int fattoriale(int n){
        if(n==0)
            return 1;
        return n*fattoriale(n-1);
    }

    /*ES2: metodo ricorsivo che stampa
    numeri pari da 0 a n*/
    public static void stampaPari(int n){
        if(n > 0)
            stampaPari(n-1);
        if(n%2==0){
            System.out.println(n);
        }

    }

    public static void stampaPariAux(int i, int n){
        System.out.println(i);
        if (i < n)
            stampaPariAux(i+2,n);
    }

    public static void main(String[] args) {
        countdown(10);
        stampaPari(15);
        System.out.println("..........");
        stampaPariAux(0,6);
        stampaPari(6);
    }


}
