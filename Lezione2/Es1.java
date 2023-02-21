import java.util.Scanner;
public class Es1{
    public static void main(String[] args){
        System.out.println("Inserisci tre numeri");
        Scanner tastiera = new Scanner(System.in);
        int a = Integer.parseInt(tastiera.nextLine());
        int b = Integer.parseInt(tastiera.nextLine());
        int c = Integer.parseInt(tastiera.nextLine());
        double media = (a+b+c)/3;
        System.out.println("La media è " + media);
    }
}