package com.onaar.myapplication;

public class Rodzaj {
    private String nazwa;

    private int dlugosc;

    private int waga;

    private String sposob;

    private boolean czyOkres;

    public Rodzaj(String nazwa,int dlugosc,int waga,String sposob,boolean czyOkres){
        this.nazwa = nazwa;
        this.dlugosc = dlugosc;
        this.waga = waga;
        this.sposob = sposob;
        this.czyOkres = czyOkres;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public int getWaga() {
        return waga;
    }

    public String getSposob() {
        return sposob;
    }

    public boolean isCzyOkres() {
        return czyOkres;
    }
}
