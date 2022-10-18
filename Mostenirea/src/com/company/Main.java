package com.company;

class Locuinta {
    private String adresa;
    Locuinta(String adresa) {
        this.adresa = adresa;
    }
    public String getAdresa() {
        return adresa;
    }
}

class Apartament extends Locuinta {
    private int numarCamere;
    Apartament(String adresa, int numarCamere) {
        super(adresa);
        this.numarCamere = numarCamere;
    }
    public int getNumarCamere() {
        return numarCamere;
    }
}

public class Main {

    public static void main(String[] args) {
         a = new Apartament("Vasile Alecsandri 16",3);
        System.out.println(a.getNumarCamere());
    }
}
