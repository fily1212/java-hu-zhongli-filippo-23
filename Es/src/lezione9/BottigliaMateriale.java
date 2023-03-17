package lezione9;

public class BottigliaMateriale extends BottigliaConTappo{
    private Materiale m;

    public BottigliaMateriale(int capacita, Materiale m) {
        super(capacita);
        this.m = m;
    }

    public BottigliaMateriale(int capacita, int quantita, Materiale m) {
        super(capacita, quantita);
        this.m = m;
    }

    @Override
    public String toString() {
        return super.toString() + " " + m;
    }
}
