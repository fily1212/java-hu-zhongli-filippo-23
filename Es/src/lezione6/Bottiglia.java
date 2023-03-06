package lezione6;

import java.util.Objects;

public class Bottiglia {
    private int capacita;
    private int quantita;

    public Bottiglia(int capacita){
        this(capacita, 0);
    }

    public Bottiglia(int capacita, int quantita) {
        if(capacita < 0)
            this.capacita = 0;
        else
            this.capacita = capacita;
        if(quantita < 0)
            this.quantita = 0;
        else
            this.quantita = quantita;

    }

    @Override
    public String toString() {
        return "B: " +
                "c " + capacita +
                ", q " + quantita;
    }

    public void riempi(int q) {
        if(q < 0)
            System.out.println("Errore");
        else{
            quantita += q;
            if(quantita > capacita){
                quantita = capacita;
            }
        }
    }

    public void svuota(int q) {
        if(q < 0){
            System.out.println("Errore");
        }else{
            quantita = Math.max(0,quantita-q);
        }
    }
}
