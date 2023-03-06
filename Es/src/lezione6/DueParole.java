package lezione6;

public class DueParole {
    public static void main(String[] args) {
        String s1 = "Coccodrillo";
        String s2 = "Cocomero";
        stampaInComune(s1,s2);
        stampaInComune2(s1,s2);
    }

    private static void stampaInComune2(String s1, String s2) {
        String inComune = "";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        for(int i = 0; i < s1.length(); i++){
            for(int j = 0; j < s2.length(); j++){
                if(inComune.contains(s1.substring(i,i+1)))
                    break;
                else if(s1.charAt(i) == s2.charAt(j))
                    inComune += s1.charAt(i);
            }
        }
        System.out.println(inComune);
    }

    private static void stampaInComune(String s1, String s2) {
        String inComune = "";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        for(int i = 0; i < s1.length(); i++){
            if(s2.contains(s1.substring(i,i+1)) &&
                    !inComune.contains(s1.substring(i,i+1)))
                inComune += s1.substring(i,i+1);
        }
        System.out.println(inComune);
    }



}
