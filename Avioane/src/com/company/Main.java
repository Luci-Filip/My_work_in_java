/*
Avioane

Poveste
Entuziast de faptul că deja ai făcut câteva joculețe, vrei să treci la următorul nivel și să lucrezi într-o echipă la un
joc mai complex.
Pentru a împiedica eventualele leak-uri, compania la care lucrezi nu ți-a comunicat decât faptul că jocul va
conține avioane, iar tu trebuie să implementezi o clasă Avion.
În momentul în care un nou avion apare pe ecran, acesta va fi instanțiat prin apelul constructorului său, iar în
momentul când dispare de pe ecran, va fi apelată metoda distrugere(). Pentru a putea afla dacă un avion a fost
distrus, clasa Avion va conține și o metodă boolean eDistrus.
În plus, mai trebuie să implementezi o metodă numarAvioane() care va returna numărul de avioane prezente pe
ecran.

Cerință
În această problemă va trebui să scrii o clasă Avion care conține un constructor și următoarele metode:
distrugere() - în momentul apelului, avionul este distrus și dispare de pe ecran
eDistrus() - returnează true sau false în funcție de starea avionului
numarAvioane() - Returnează numărul de avioane prezent pe ecran
Exemplu
// clasa ta aici...
public class prog {
    public static void main(String[] args) {
    Avion avion = new Avion();
    System.out.println(Avion.numarAvioane()); // 1
    System.out.println(avion.eDistrus()); // false
    avion.distrugere();
    System.out.println(avion.eDistrus()); // true
    System.out.println(Avion.numarAvioane()); // 0
    }
}
 */
package com.company;

class Avion {
    public static int number_plane;
    public boolean ok;

    public Avion() {
        ++number_plane;
        ok = false;
    }

    public void distrugere() {
         --number_plane;
         ok = true;
    }

    boolean eDistrus() {
        if (ok) {
            return true;
        }
        return false;
    }

    public static int numarAvioane () {
        return number_plane;
    }
}

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion();
        System.out.println(Avion.numarAvioane()); // 1
        System.out.println(avion.eDistrus()); // false
        avion.distrugere();
        System.out.println(avion.eDistrus()); // true
        System.out.println(Avion.numarAvioane()); // 0
    }
}
