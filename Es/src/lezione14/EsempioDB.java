package lezione14;

import java.io.IOException;

public class EsempioDB {

    public static int m1() throws IOException {
        throw new IOException();

    }
    public static void main(String[] args) {
        try{
            m1();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
