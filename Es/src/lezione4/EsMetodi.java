package lezione4;

public class EsMetodi {

    /* public static void nome( parametri){
        corpo
    }
    * */
    public static void saluta(){
        System.out.println("Ciao");
    }

    public static int somma(int n1, int n2){
        return n1 + n2;
    }

    public static int max(int n1, int n2){
        if(n1 > n2)
            return n1;
        else
            return n2;
    }

    public static void main(String[] args) {
//        saluta();
//        int a = somma(1,2);
        int b = max(3,56);
        System.out.println(b);
    }

}
