package util;

import java.util.Scanner;

public class Util {

    public static void riempi(int[] array){
        Scanner tastiera = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.println("Inserisci un numero: ");
            array[i] = Integer.parseInt(tastiera.nextLine());
        }
    }

    public static int[] crea(int n){
        int[] array = new int[n];
        riempi(array);
        return array;
    }
    


}
