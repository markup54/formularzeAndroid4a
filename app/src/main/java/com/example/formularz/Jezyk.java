package com.example.formularz;

public class Jezyk {
    private String nazwa;
    private int idObrazka;

    public Jezyk(String nazwa, int idObrazka) {
        this.nazwa = nazwa;
        this.idObrazka = idObrazka;
    }

    @Override
    public String toString() {
        return "nazwa=" + nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }
}
