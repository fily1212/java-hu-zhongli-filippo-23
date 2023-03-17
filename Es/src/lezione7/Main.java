package lezione7;

public class Main {
    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente("Mario","Rossi");
        conto.deposita(500);
        System.out.println(conto.getSaldo());
        conto.preleva(100);
        System.out.println(conto.getSaldo());
        ContoCorrente.getProssimoId();
        //new ContoCorrente(new Persona("nome","cognome"));
    }
}
