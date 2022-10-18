/*
Joc

Poveste
Fericit că tocmai ai acumulat cunoștințe noi de OOP, vrei să le pui în aplicare și să creezi primul tău joc.
Vrei ca jocul tău să fie o luptă între doi jucători. Fiecare jucător are la început 100% viață.
Pe parcursul jocului, un jucător poate să-l lovească pe celălalt jucător. Când un jucător este lovit, acesta pierde
1% din viață.
Pentru că vrei ca jocul tău să fie cât mai personalizabil, vrei să îl lași pe fiecare jucător să își aleagă numele în joc.
Înainte să te apuci de treabă te-ai gândit să implementezi clasa de bază pentru joc:
Cerință
În această problemă va trebui să scrii o clasă Joc care conține următoarele metode:
primesteLovitura(int) - primește ca parametrul id-ul jucătorului lovit (1 pentru primul jucător și respectiv 2,
pentru al doilea)
afiseazaStatus() - afișează pe ecran statusul jocului în următorul format: nume_jucator_1: viata_jucator_1 -
nume_jucator_2: viata_jucator_2
Clasa poate fi instanțiată în 2 moduri:
1. printr-un constructor care primește 2 parametri de tip String care reprezintă numele primului jucător,
respectiv numele celui de-al doilea jucător.
2. printr-un constructor fără parametri, caz în care numele primului jucător va fi Player1 și numele celui de-al
doilea va fi Player2.
Restricții
Se garantează că un jucător nu își va pierde niciodată toată viața.
Exemplu

// clasa ta aici...

public class prog {
 public static void main(String[] args) {
 Joc joc = new Joc();
 joc.primesteLovitura(1);
 joc.afiseazaStatus(); // va afisa Player1: 99 - Player2: 100
 joc = new Joc("Alex", "Andrei");
 joc.primesteLovitura(1);
 joc.primesteLovitura(1);
 joc.primesteLovitura(2);
 joc.afiseazaStatus(); // va afisa Alex: 98 - Andrei: 99
 }
}

 */
package com.company;

class Joc {
    private int viata_jucator_1 = 100, viata_jucator_2 = 100;
    public String nume_jucator_1, nume_jucator_2;

    public Joc(String nume_jucator_1, String nume_jucator_2) {
        this.nume_jucator_1 = nume_jucator_1;
        this.nume_jucator_2 = nume_jucator_2;
    }

    public Joc() {
        this.nume_jucator_1 = "Player1";
        this.nume_jucator_2 = "Player2";
    }

    void primesteLovitura(int id) {
        if (id == 1) {
            --viata_jucator_1;
        }
        if (id == 2) {
            --viata_jucator_2;
        }
    }

    void afiseazaStatus() {
        System.out.println(nume_jucator_1 + ": " + viata_jucator_1 + " - " + nume_jucator_2 + ": " + viata_jucator_2);
    }
}

public class Main {

    public static void main(String[] args) {
        Joc joc = new Joc();
        joc.primesteLovitura(1);
        joc.afiseazaStatus(); // va afisa Player1: 99 - Player2: 100
        joc = new Joc("Alex", "Andrei");
        joc.primesteLovitura(1);
        joc.primesteLovitura(1);
        joc.primesteLovitura(2);
        joc.afiseazaStatus(); // va afisa Alex: 98 - Andrei: 99
    }
}
