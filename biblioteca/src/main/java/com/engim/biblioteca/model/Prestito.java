package com.engim.biblioteca.model;

import java.util.Date;

public class Prestito {
    private Date dataInizio;
    private Date dataFine;
    private Utente utente;
    private Libro libro;

    public Prestito() {
    }

    public Prestito(Utente utente, Libro libro) {
        this.utente = utente;
        this.libro = libro;
        dataInizio = new Date();
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
