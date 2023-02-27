package lezione4;

import java.util.Scanner;

public class EsempioDo {
    public static void main(String[] args) {
        /*Creare una calcolatrice*/
        Scanner tastiera = new Scanner(System.in);
        String risposta;
        int contatore = 0;
        do {
            System.out.println("Cosa vuoi fare? " +
                    "Inserisci il numero dell'operazione:\n" +
                    "1. incrementa \n" +
                    "2. decrementa\n" +
                    "3. esci dal programma");
            risposta = tastiera.nextLine();
            if(risposta.equals("1")){
                contatore ++;
            }else if(risposta.equals("2")){
                contatore --;
            }
            System.out.println(contatore);
        }while(!risposta.equals("3"));

        }

    }

