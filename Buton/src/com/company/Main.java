/*
Buton
Poveste și cerință
După terminarea aplicației de calendar, prietenii tăi au devenit tot mai impresionați de punctualitatea și de
hărnicia ta. După cum știm toți, rezultatele bune în informatică sunt datorate folosirii unei aplicații și nu muncii și
perseverenței continue.
Așa că prietenii tăi vor să folosească aplicația de calendar pe care ai creat-o, în speranța că vor deveni și ei la fel
de buni la programare.
Întrucât ții foarte mult la prestigiul tău, vrei să refaci interfața grafică pentru a le oferi o experiență cât mai
plăcută și ai ajuns la implementarea butoanelor aplicației.
Ai decis că fiecare buton trebuie să implementeze următoarea interfață:
interface Buton {
 public void onClick(Eveniment eveniment);
}
Acum mai trebuie doar să creezi clasele care implementează această interfață, și anume ButonSalvare și
ButonStergere. Fiecare din ele trebuie să implementeze interfața Buton:
Pentru ButonSalvare, în momentul apelării onClick se va apela metoda salvare a obiectului clasei Eveniment
primit ca parametru de onClick()
Pentru ButonStergere , în momentul apelării onClick se va apela metoda stergere a obiectului clasei Eveniment
primit ca parametru de onClick()
Exemplu

class Eveniment {
 public void salvare() {
 System.out.println("Modificari salvate cu succes");
 }
 public void stergere() {
 System.out.println("Eveniment sters cu succes");
 }
}
interface Buton {
 public void onClick(Eveniment eveniment);
}
// clasele tale aici

public class prog {
 public static void main(String[] args) {
    Eveniment eveniment = new Eveniment();
    ButonSalvare butonSalvare = new ButonSalvare();
    butonSalvare.onClick(eveniment); // Modificari salvate cu succes
    ButonStergere butonStergere = new ButonStergere();
    butonStergere.onClick(eveniment); // Eveniment sters cu succes
 }
}

 */
package com.company;

class Eveniment {
    public void salvare() {
        System.out.println("Modificari salvate cu succes");
    }

    public void stergere() {
        System.out.println("Eveniment sters cu succes");
    }
}

interface Buton {
    public void onClick(Eveniment eveniment);
}

class ButonSalvare implements Buton {
    public void onClick(Eveniment eveniment) {
        eveniment.salvare();
    }
}

class ButonStergere implements Buton {
    public void onClick(Eveniment eveniment) {
        eveniment.stergere();
    }
}

public class Main {

    public static void main(String[] args) {
        Eveniment eveniment = new Eveniment();
        ButonSalvare butonSalvare = new ButonSalvare();
        butonSalvare.onClick(eveniment); // Modificari salvate cu succes
        ButonStergere butonStergere = new ButonStergere();
        butonStergere.onClick(eveniment); // Eveniment sters cu succes
    }
}
