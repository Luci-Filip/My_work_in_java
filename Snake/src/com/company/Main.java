/*
Snake
Poveste
Unul dintre jocurile tale preferate este Snake, iar acum că știi destul de bine programare, vrei să îți creezi propriul
tău joc Snake. Inițial vrei doar să simulezi mutările șarpelui și să le detectezi pe cele invalide.
În jocul de Snake un șarpe se mișcă prin pătratele unui grid în direcțiile sus, jos, stânga și dreapta în funcție de
comenzile jucătorului.
În jocul tău, șarpele se va deplasa printr-un grid de 15 linii și 17 coloane, iar acesta se va deplasa doar atunci
când primește o comandă de la jucător. Singura mutare invalidă este atunci când șarpele se lovește de un zid
(încearcă să iasă în afara gridului). Acest gen de mutări vor fi ignorate, iar șarpele va rămâne în aceeași poziție.
Poziția inițială a șarpelui este în mijlocul tablei (linia 8 coloana 9). Liniile tablei și coloanele tablei sunt numerotate
începând cu 1.
Află câte deplasări valide a făcut șarpele.
Cerință
În această problemă va trebui să scrii o clasă Snake care conține următoarele metode:
deplasare(int) - numărul primit ca parametru semnifică direcția în care șarpele se va deplasa: 0 - sus, 1 -
dreapta, 2 - jos, 3 - stânga
mutariValide() - Returnează numărul de mutări valide făcute de către șarpe până la momentul curent.
Exemplu

// clasa ta aici...

public class prog {
 public static void main(String[] args) {
    Snake joc = new Snake();
    joc.deplasare(1);
    System.out.println(joc.mutariValide()); // 1
    for (int i = 0; i < 100; ++i) {
        joc.deplasare(0);
    }
    System.out.println(joc.mutariValide()); // 8
 }
}

 */
package com.company;

class Snake {
    private int counter = 0, line = 8, column = 9;
    void deplasare (int operation) {
        if (operation == 0 && line - 1 > 0) {
            --line;
            ++counter;
        }
        if (operation == 1 && column - 1 > 0) {
            --column;
            ++counter;
        }
        if (operation == 2 && line + 1 <= 15) {
            ++line;
            ++counter;
        }
        if (operation == 3 && column + 1 <= 17) {
            ++column;
            ++counter;
        }
    }

    int mutariValide () {
        return counter;
    }
}

public class Main {

    public static void main(String[] args) {
        Snake joc = new Snake();
        joc.deplasare(1);
        System.out.println(joc.mutariValide()); // 1
        for (int i = 0; i < 100; ++i) {
            joc.deplasare(0);
        }
        System.out.println(joc.mutariValide()); // 8
    }
}