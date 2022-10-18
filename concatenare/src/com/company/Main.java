package com.company;

class Elev {
    private String numeComplet;
    private int medieAbsolvire;
    Elev() {}
    Elev(String nume, int medie) {
        numeComplet = nume;
        medieAbsolvire = medie;
    }
}

public class Main {

    public static void main(String[] args) {
        Elev[] elevi = new Elev[numeElevi.length];
        int pozitie;
        for (pozitie = 0; pozitie < numeElevi.length; pozitie++) {
            elevi[pozitie] = new Elev(numeElevi[pozitie], 10);
        }
    }
}
