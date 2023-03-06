package lezione6;

/*
Il parametro String[] args
del metodo main è un parametro
che viene inizializzato all'inizio
del programma con ciò che viene inserito
da terminale dopo "java [nomedelprogramma]".
1) scrivere un programma StampaArgs che stampi il contenuto di args,
 eseguire scrivendo "java StampaArgs parola1 parola2 parola3"
2) scrivere un programma Somma che sommi tutti i numeri dati per argomento (senza sapere a priori quanti argomenti) (esempio di esecuzione "java Somma 2 3 4" deve stampare 9)
*/

public class StampaArgs {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}
