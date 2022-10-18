/*
Date calendaristice valide
Compania la care lucrezi folosește un plugin care parcurge textul mailului pe care îl compui și detectează
bucățile de text care reprezintă date calendaristice valide, pentru a putea să organizezi ușor meeting-uri chiar
din clientul de email!
Recent, cel care se ocupă de menținerea codului pentru plugin a observat că verificarea datelor calendaristice
se făcea manual și vor să actualizeze acea metodă pentru a folosi clasa SimpleDateFormat din Java.
Sarcina ta e, pentru început, să scrii definiția unei metode care primește ca parametru un șir de String-uri,
reprezentând grupurile de cuvinte din email care ar putea reprezenta date. Metoda va returna numărul de
String-uri care încep cu date calendaristice valide, în formatul zz/ll/aaaa, iar pentru a verifica dacă un String e o
dată validă va trebui să te folosești de clasa SimpleDateFormat. Consultă documentația și caută informații
suplimentare pe internet pentru a afla în ce fel o poți folosi pentru a verifica dacă o dată e validă sau nu.
Cerință
Scrie o clasă ValidatorDate care să conțină o metodă publică numaraDateValide.
Metoda va primi ca parametru un șir de String (String[]) și va returna un int reprezentând numărul de String-uri
din șir care respectă formatul zz/ll/aaaa.
Semnătură metodă:
public static int numaraDateValide(String[] cuvinte)
Exemplu

// clasa ta aici

public class prog {
 public static void main(String[] args) {
 System.out.println(ValidatorDate.numaraDateValide(new String[]{"Astazi", "este", "01/04/2019", "01/13/2019",
 "29/02/200s"}));
 // 2
 }
}

 */
package com.company;

import java.text.SimpleDateFormat;

class ValidatorDate {
    public static int numaraDateValide(String[] cuvinte) {
        int count = 0;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        for (String date : cuvinte) {
            try {
                format.parse(date);
                ++count;
            } catch (Exception e) {
                System.out.println("Data " + '"' + date + '"' + " nu este o data valida");
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(ValidatorDate.numaraDateValide(new String[]{"Astazi", "este", "01/04/2019", "01/13/2019",
                "29/02/200s"}));
        // 2
    }
}
