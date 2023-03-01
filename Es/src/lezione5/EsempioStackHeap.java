package lezione5;

public class EsempioStackHeap {

    public static int m2(int n){
        return 2-n;
    }

    public static int m1(int n){
        return n*m2(10);
    }
    /* NO perché la firma è la stessa
    public static void m1(int n){
        System.out.println(n);
    }
    */

    // SI perché i parametri sono diversi
    public static int m1(double n){
        return (int)n;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        for(int i = 0; i < 2; i++){
            a+=b;
        }
        int c = m1(a);
        String s = "Ciao";
    }
}
