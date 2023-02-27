package lezione4;

import java.util.Scanner;

public class Cicli {
    public static void main(String[] args) {
        // ES stampa da 1 a n
        int n = 100;
        int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }
        /*
        * for (inizializzazione;condizione;aggiornamento){
        *  ISTRUZIONI
        * }
        * */
        for(int j = 0; j < n;j += 2 ){
            int a = 0;
            System.out.println(j);
        }
//        System.out.println(a); NON esiste

        for(int j = 0; j < n;j += 2 )
            System.out.println(j);
// ES chiedere quanti numeri si vuole inserire,
// farli inserire e calcolare la media
        Scanner tastiera = new Scanner(System.in);
        int num = Integer.parseInt(tastiera.nextLine());
        double somma = 0;
        for (int j = 0; j < num; j++){
            somma+=Double.parseDouble(tastiera.nextLine());
        }
        System.out.println(somma/num);
        // ES: chiedere direttamente i numeri e quando viene
        // inserito -1 fermarsi e calcolare la media
        boolean chiedo = true;
        double somma2 = 0;
        int num2 = 0;
        while(chiedo){
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
        double risposta = Double.parseDouble(tastiera.nextLine());

        while(risposta != -1){
            somma2 += risposta;
            num2++;
            risposta = Double.parseDouble(tastiera.nextLine());
            }
        }
       // System.out.println(somma2/num2);

    }

