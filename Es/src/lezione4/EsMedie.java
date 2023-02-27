package lezione4;

import java.util.Scanner;

public class EsMedie {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        // ES: chiedere direttamente i numeri e quando viene
        // inserito -1 fermarsi e calcolare la media
        boolean chiedo = true;
        double somma2 = 0;
        int num2 = 0;
        while(chiedo){
            System.out.println("Inserisci un numero: ");

            double risposta = Double.parseDouble(tastiera.nextLine());
            if(risposta == -1){
                chiedo = false;
            }else{
                somma2 += risposta;
                num2++;
            }
        }
        System.out.println(somma2/num2);

        double somma3 = 0;
        int num3 = 0;

        System.out.println("Inserisci un numero: ");
        double risposta = Double.parseDouble(tastiera.nextLine());

        while(risposta != -1){
            somma3 += risposta;
            num3++;
            System.out.println("Inserisci un numero: ");
            risposta = Double.parseDouble(tastiera.nextLine());
        }
        System.out.println(somma3/num3);

        /*
        double somma4 = 0;
        int num4 = 0;
        do {
            System.out.println("Inserisci un numero: ");
            double risposta2 = Double.parseDouble(tastiera.nextLine());

        }while();
*/
    }


}

