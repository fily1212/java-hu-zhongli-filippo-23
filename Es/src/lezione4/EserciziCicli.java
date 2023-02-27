package lezione4;

public class EserciziCicli {
    public static void main(String[] args) {
        // ESERCIZIO 1: calcolare la somma dei primi n numeri dispari.
        // esempio: n = 9, calcolare 1 + 3 + 5 + 7+ 9
        int n = 9;
        int somma = 0;
        for(int i = 1; i <= n; i=i+2){
            somma +=i;
        }
        System.out.println(somma);

        // ESERCIZIO 2: invertire una stringa s
        // esempio: s = "ciao", restituire "oaic"

        String s = "ciao";
        String inversa = "";
        for (int i = 0; i < s.length(); i++){
            inversa = s.substring(i,i+1) + inversa;
        }
        System.out.println(inversa);
        // ESERCIZIO 3: programma che controlla se una parola è palindroma
        // esempio: anna : true, carla : false
        s = "anna";
        boolean palindromo = true;
        int i = 0;
        while( i < s.length()/2 ){
            String prima = s.substring(i,i+1);
            String seconda = s.substring(s.length()-1-i,s.length()-i);
            palindromo = palindromo && prima.equalsIgnoreCase(seconda);
            i++;
        }


    }
}
