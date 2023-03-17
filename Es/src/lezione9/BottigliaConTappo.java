package lezione9;


import lezione6.Bottiglia;

import java.io.Serializable;

public class BottigliaConTappo extends Bottiglia{

    private boolean aperta;

    public BottigliaConTappo(int capacita) {
        super(capacita);
        this.aperta = true;
    }

    public BottigliaConTappo(int capacita, int quantita) {
        super(capacita, quantita);
        this.aperta = true;
    }

    public void apri(){
        this.aperta = true;
    }

    public void chiudi(){
        this.aperta = false;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + (aperta?"Aperta":"Chiusa");
    }

    @Override
    public void riempi(int q) {
        if(aperta)
            super.riempi(q);
    }

    @Override
    public void svuota(int q) {
        if(aperta)
            super.svuota(q);
    }

}
