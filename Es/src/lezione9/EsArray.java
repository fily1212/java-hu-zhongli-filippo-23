package lezione9;

import java.util.*;

public class EsArray {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Ciao");
        lista.add("Come");
        lista.add("va");
        lista.get(0);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        lista.set(0,"Hello");
        System.out.println(lista);
        System.out.println(lista.size());

        for(String s : lista){
            System.out.println(s.substring(0,1));
        }

        Map<String,String> rubrica = new HashMap<>();
        rubrica.put("Franco","01123456789");
        System.out.println(rubrica.get("Franco"));

    }

}
