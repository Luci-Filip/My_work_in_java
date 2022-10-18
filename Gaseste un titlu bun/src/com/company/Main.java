/*
Găsește un titlu bun

Pe canalul de YouTube WellCode sunt multe videoclipuri, fiecare cu câte un nume sugestiv. Vrem să testăm dacă
videoclipurile care conțin cuvinte scrise cu inițiale majuscule (exemplu: "Implementează un Joc de 2048") au mai
multe vizualizări decât cele scrise doar cu litere mici. Dacă tot facem asta, de ce să nu folosim doar inițiale
majuscule?
Te-ai oferit să ne ajuți să schimbăm toate numele videoclipurilor de pe canal după noul format, iar apoi să
măsurăm împreună dacă numărul de vizualizări crește sau nu. Trebuie să definești o clasă Translator care
conține o metodă transformaCuMajuscule. Metoda va primi un StringBuffer, ce conține doar litere ale alfabetului
englez și spații și îl va modifica astfel încât fiecare dintre cuvinte să înceapă cu literă mare.
Semnătură metodă:
public static void transformaCuMajuscule(StringBuffer cuvinte)
Exemplu
// clasa ta aici
public class prog {
 public static void main(String[] args) {
 StringBuffer titlu = new StringBuffer("De ce e bine sa participi la concursuri");
 Translator.transformaCuMajuscule(titlu);
 System.out.println(titlu); // De Ce E Bine Sa Participi La Concursuri
 }
}
 */

package com.company;


class Translator {
    public static void transformaCuMajuscule (StringBuffer cuvinte) {

        for (int i = 0; i < cuvinte.length(); ++i) {
            if (i == 0 || cuvinte.charAt(i - 1) == ' ') {
                cuvinte.setCharAt(i, Character.toUpperCase(cuvinte.charAt(i)));
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        StringBuffer titlu = new StringBuffer("De ce e bine sa participi la concursuri");
        Translator.transformaCuMajuscule(titlu);
        System.out.println(titlu); // De Ce E Bine Sa Participi La Concursuri

        /*

        StringBuffer titlu = new StringBuffer("filip rafael andrei");
        Translator.transformaCuMajuscule(titlu);
        System.out.println(titlu);

         */
    }
}
