package lezione7;
/*
* scrivere la classe ContoCorrente con l'attributo
* String nome,
* String cognome
* e i metodi preleva e deposita.
* Non è possibile prelevare/depositare un numero negativo
* e non si può prelevare se non ci sono abbastanza soldi.
* I controlli devono essere fatti all'interno di preleva e deposita.
*/
public class ContoCorrente {
    private String nome;
    private String cognome;
    private Persona p;
    private double saldo;
    private int id;
    private static int prossimoId = 0;
    public static final String NOME_BANCA = "Unicredit";

    public static int getProssimoId(){ // nota: il metodo è static
        // return saldo; NO perché è un attributo non static
        return prossimoId; // SI perché è un attributo static
    }

    public ContoCorrente(String nome, String cognome) {
       // this.p = new Persona(nome,cognome);
        this.saldo = 0;
        this.id = prossimoId++;
    }
    public ContoCorrente(Persona p) {
        this.p = p;
        this.saldo = 0;
        this.id = prossimoId++;
    }

    public void preleva(double q){
        if(q < 0){
            System.out.println("Non si può prelevare un numero negativo di denaro");
        }else if(q > saldo)
            System.out.println("Non hai un saldo sufficiente");
        else
            saldo -= q;
    }

    public void deposita(double q){
        if(q < 0)
            System.out.println("Non si può depositare un numero negativo di denaro");
        else
            saldo += q;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
