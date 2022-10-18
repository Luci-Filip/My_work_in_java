/*
Ordonare meeting-uri

Campionatul de Șeptică a fost un succes în companie și angajații sunt acum mai productivi ca niciodată, după o
săptămână întreagă de jocuri. Au început să își programeze meeting-uri de dimineața până seara în fiecare din
sălile din clădirea ta. Totuși, când ai intrat și tu pe sistemul intern de planificare ai observat că, după ce selectezi
un meeting room, îți apar toate meeting-urile care au fost planificate în acel spațiu într-o ordine aleatoare. Ți-ar
plăcea mai mult să le vezi sortate după ora la care încep, ca să poți să vezi ușor la care moment de timp e
disponibilă sala.
Te-ai uitat peste cod și ai găsit clasa care salvează datele despre un meeting. Clasa se numește Meeting și are 2
câmpuri private de tip Calendar, dataInceput și dataSfarsit. Ea mai conține și un constructor care primește 2
parametri de tip Calendar, dataInceput și dataSfarsit, pe baza cărora actualizează valorile câmpurilor clasei. Dacă
dataSfarsit e o dată mai mică decât dataInceput, constructorul aruncă o excepție de tipul IllegalArgumentException
cu un mesaj sugestiv. În plus, clasa trebuie să implementeze metoda toString(), care returnează un String de
forma dataInceput -> dataSfarsit, unde datele sunt în formatul zz/ll/aaaa hh:mm:ss (exemplu: 01/04/2019 11:20:00 ->
01/04/2019 11:50:00).
Sarcina ta e să implementezi clasa Meeting, care să conțină membrii specificați mai sus și să implementeze clasa
Comparable. Metoda compareTo trebuie să compare obiectele în funcție de data de început.
Exemplu
import java.text.*;
import java.util.*;
// clasa ta aici
public class prog {
 public static void main(String[] args) {
 try {
 List<Meeting> l = new ArrayList<>();
 l.add(new Meeting(new GregorianCalendar(2019, Calendar.APRIL, 1, 11, 20, 0),
 new GregorianCalendar(2019, Calendar.APRIL, 1, 11, 50, 0)));
 l.add(new Meeting(new GregorianCalendar(2019, Calendar.MARCH, 3, 11, 20, 0),
 new GregorianCalendar(2019, Calendar.MARCH, 5, 11, 50, 0)));
 Collections.sort(l);
 System.out.println(l);
 // Se va afisa intai "03/03/2019 11:20:00 -> 05/03/2019 11:50:00", urmat de "01/04/2019 11:20:00 ->
01/04/2019 11:50:00"
 } catch (IllegalArgumentException e) {
 System.out.print(e.getMessage()); // Nu va afisa nimic
 }
 }
}
Bonus Încearcă să rezolvi problema fără să primești avertizări la compilare
 */
package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

class Meeting implements Comparable<Meeting> {
    private final Calendar start;
    private final Calendar end;

    public Meeting(Calendar start, Calendar end) {
        this.start = start;
        this.end = end;
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException();
        }
    }

    public Calendar getStart() {
        return start;
    }

    public int compareTo(Meeting m) {
        return this.start.compareTo(m.getStart());
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return sdf.format(start.getTime()) + " -> " + sdf.format(end.getTime());
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            List<Meeting> l = new ArrayList<>();
            l.add(new Meeting(new GregorianCalendar(2019, Calendar.APRIL, 1, 11, 20, 0),
                    new GregorianCalendar(2019, Calendar.APRIL, 1, 11, 50, 0)));
            l.add(new Meeting(new GregorianCalendar(2019, Calendar.MARCH, 3, 11, 20, 0),
                    new GregorianCalendar(2019, Calendar.MARCH, 5, 11, 50, 0)));
            Collections.sort(l);
            System.out.println(l);
            // Se va afisa intai "03/03/2019 11:20:00 -> 05/03/2019 11:50:00", urmat de "01/04/2019 11:20:00 -> 01/04/2019 11:50:00"
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());  // Nu va afisa nimic
        }
    }
}
