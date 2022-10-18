package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Elev implements Comparable {
    private String nume, prenume;
    private double medieGenerala;

    public Elev(String nume, String prenume, double medieGenerala) {
        this.nume = nume;
        this.prenume = prenume;
        this.medieGenerala = medieGenerala;
    }

    public double getMedieGenerala() {
        return medieGenerala;
    }

    public String toString() { // pentru afisarea listei
        return "Nume: " + nume + " Prenume: " + prenume + " Medie generala: " + medieGenerala;
    }

    @Override
    public int compareTo(Object o) {
        Elev a = (Elev) o; // convertim pe o la Elev
        if (medieGenerala > a.getMedieGenerala()) {
            return -1;
        }
        if (medieGenerala < a.getMedieGenerala()) {
            return 1;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Elev> l = new ArrayList<>();
        l.add(new Elev("Popescu", "Andrei", 8.5));
        l.add(new Elev("Ionescu", "Patricia", 7.8));
        l.add(new Elev("Ilie", "Alexandra", 9.6));
        l.add(new Elev("Marin", "Vasile", 8.25));
        Collections.sort(l);
        System.out.println(l); // Se va folosi metoda toString pentru afisarea fiecarui element
    }
}
