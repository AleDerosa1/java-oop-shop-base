package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public float prezzobase;
    public float iva;

    public Prodotto (String nome, String descrizione, float prezzobase, int iva){
        Random numero = new Random();
        this.codice = numero.nextInt(1000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzobase = prezzobase;
        this.iva = 22;
    }

    //METODO PER OTTENRE PREZZO BASE
    public float getPrezzoBase(){
        return prezzobase;
    }

    public void setPrezzoBase(float prezzobase) {
        this.prezzobase = prezzobase;
    }

    //METODO PER OTTENERE PREZZO CON IVA
    public float getPrezzoIva(){
        return prezzobase + (prezzobase * iva / 100);
    }


    public void setPrezzoIva(int iva) {
        this.iva = iva;
    }

    //METODO PER OTTENERE NOME ESTESO (NOME+CODICE)
    public String getNomeCodice(){
        return nome + "-" + codice;
    }


    public int getCodice() {
        return codice;
    }



    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescrizione() {
        return descrizione;
    }


    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

   

  


   






    
}
