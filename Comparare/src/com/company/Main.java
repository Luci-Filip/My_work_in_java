/*
Comparare

Poveste
Tocmai te-ai înscris în cursa pentru obținerea postului de programator la o firmă care se va ocupa de crearea
unei aplicații care urmează să fie folosită în toate universitățile din Cluj pentru a ușura munca în sesiunea de
admitere atunci când se distribuie locurile la buget în funcție de mediile obținute de elevii claselor a XII-a.
Pentru a obține oferta de angajare și a lucra la aplicație trebuie mai întâi să creezi un program care primește
numele a doi elevi împreună cu mediile acestora și returnează numele elevului cu media cea mai mare.
Cerință
În această problemă va trebui să definești o clasă numită Comparare care conține o singură metodă String compara.
Metoda va primi ca parametrii numele a doi elevi și două numere de tip double reprezentând mediile acestora și
va returna numele elevului cu cea mai mare medie.
Restricții și precizări
În cazul în care valoarea mediilor celor doi elevi este egală, se va afișa numele elevului care este mai mic
din punct de vedere lexicografic.
Semnătură metodă:
public String compara(String numeElev1, double medieElev1, String numeElev2, double medieElev2)
Exemplu
class Elev {
 private String nume;
 private double mediaNotelor;

 Elev(String n, double medie) {
 this.nume = n;
 this.mediaNotelor = medie;
 }
}
// clasa ta aici...
public class prog {
 public static void main(String[] args) {
 Comparare c = new Comparare();
 System.out.println(c.compara("Andrei", 8.95, "Radu", 8.94)); // va afisa Andrei
 }
}

 */
package com.company;

class Elev {
    private String nume;
    private double mediaNotelor;

    Elev(String n, double medie) {
        this.nume = n;
        this.mediaNotelor = medie;
    }
}

class Comparare {

    public String compara(String numeElev1, double medieElev1, String numeElev2, double medieElev2) {
        if (medieElev1 >= medieElev2 && numeElev1.compareTo(numeElev2) < 0) {
            return numeElev1;
        }
        if (medieElev1 >= medieElev2 && numeElev1.compareTo(numeElev2) > 0) {
            return numeElev1;
        }
        return numeElev2;
    }
}

public class Main {

    public static void main(String[] args) {
        Comparare c = new Comparare();
        System.out.println(c.compara("Andrei", 8.95, "Radu", 8.94)); // va afisa Andrei
        System.out.println(c.compara("Andrei 1", 8.94, "Andrei 2", 8.94)); // va afisa Andrei 1
    }
}
