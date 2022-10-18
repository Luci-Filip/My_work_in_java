/*
Datorii

Poveste
De când ai învățat programare și ai reușit să te angajezi ca programator, ai observat că prietenii tăi se
împrumută tot mai des de la tine. Într-o zi, când ai vrut să te duci la magazin și ai observat că nu mai ai bani la
tine, ai decis că nu se mai poate așa și ți-ai implementat un sistem de monitorizare a datoriilor. Acum vei ști exact
câte împrumuturi ai dat și care e valoarea totală a împrumuturilor la fiecare moment de timp.
Pentru că totuși vrei să îți vezi banii înapoi, nu vei împrumuta niciodată un prieten de mai multe ori, iar atunci
când ți se restituie datoria, vei primi toată suma înapoi.
Cerință
În această problemă va trebui să definești o clasă Datorii care conține următoarele metode:
imprumut(int) - în momentul apelului, vei împrumuta suma transmisă ca parametru
restituire(int) - în momentul apelului ți se restituie suma de bani transmisă ca parametru
În plus, clasa va trebui să aibă următoarele câmpuri statice și publice:
numar_datornici - numărul de prieteni care îți datorează bani
suma_datorata - suma totală pe care ți-o datorează prietenii
Restricții
Se consideră că fiecare împrumut provine de la o persoană diferită.
Restituirea se va face tot timpul pentru întreaga sumă datorată, o singură dată.
Exemplu

// clasa ta aici...

public class prog {
 public static void main(String[] args) {
    Datorii datorii = new Datorii();
    datorii.imprumut(3);
    datorii.imprumut(23);
    System.out.println(Datorii.numar_datornici + " " + Datorii.suma_datorata); // 2 26
    datorii.restituire(23);
    System.out.println(Datorii.numar_datornici + " " + Datorii.suma_datorata); // 1 3
    }
}
 */
package com.company;

import java.util.ArrayList;
import java.util.List;

class Datorii {
    private List<Integer> datornici = new ArrayList<>();

    public static int numar_datornici, suma_datorata;

    void imprumut (int valoare) {
        datornici.add(valoare);
        numar_datornici = datornici.size();

        int suma = 0;
        for (Integer integer : datornici)
            suma = suma + integer;
        suma_datorata = suma;
    }

    void restituire (int valoare) {
        datornici.remove(new Integer(valoare));
        numar_datornici = datornici.size();

        int suma = 0;
        for (Integer integer : datornici)
            suma = suma + integer;
        suma_datorata = suma;
    }
}

public class Main {

    public static void main(String[] args) {
        Datorii datorii = new Datorii();
        datorii.imprumut(3);
        datorii.imprumut(23);
        //datorii.imprumut(44);
        System.out.println(Datorii.numar_datornici + " " + Datorii.suma_datorata); // 2 26
        datorii.restituire(23);
        //datorii.restituire(3);
        System.out.println(Datorii.numar_datornici + " " + Datorii.suma_datorata); // 1 3
    }
}
