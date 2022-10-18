/*
Calendar
Poveste
De când înveți informatică, ai început să fii din ce în ce mai grijuliu legat de timpul tău. Pentru a combina
învățarea informaticii cu gestionarea mai eficientă a timpului, ai decis să-ți creezi propria ta aplicație de
calendar. În ea vei stoca diverse evenimente.
Pentru a stoca un eveniment, ai creat următoarea clasă:
import java.text.SimpleDateFormat;
import java.util.Date;
class Eveniment {
 private Date dataInceput, dataSfarsit;
 private String nume;
 public Eveniment(String dataInceput, String dataSfarsit, String nume) {
 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
 this.dataInceput = format.parse(dataInceput);
 this.dataSfarsit = format.parse(dataSfarsit);
 } catch (Exception e) {
 System.out.println("Data nu este in formatul cerut!");
 }
 this.nume = nume;
 }
 public Date getDataInceput() {
 return dataInceput;
 }
 public Date getDataSfarsit() {
 return dataSfarsit;
 }
 public String getNume() {
 return nume;
 }
}
Ai văzut că totul funcționează conform planului, însă cum tu te pregătești în fiecare zi la aceeași oră timp de 2 ore
la informatică, ai vrea ca aplicația ta să suporte evenimente recurente.
Un eveniment recurent este un eveniment care se repetă o dată la un număr fix de ore.
De exemplu dacă tu te pregătești zilnic la informatică, evenimentul se va repeta o dată la 24 de ore. Astfel, dacă
te-ai pregătit în data de 24 mai 2019 la ora 12:31:00, următoarea dată când se va întâmpla evenimentul va fi în 25
mai 2019 la ora 12:31:00.
Un alt exemplu este atunci când ești bolnav și trebuie să îți iei medicamentul o dată la 8 ore. Astfel, dacă prima
dată ai luat medicamentul la ora 7:30, următoarea dată când îl vei lua va fi la 15:30 și pe urmă la 23:30.

Acum vrei să implementezi clasa EvenimentRecurent, subclasă a clasei Eveniment. Aceasta te va ajuta, pentru o dată
anume, să afli când se va întâmpla următoarea instanță a unui eveniment recurent.
Cerință
În această problemă va trebui să definești o clasă EvenimentRecurent. Ea trebuie să fie subclasă a clasei Eveniment și
să conțină, în plus, următoarea metodă:
urmatorulEveniment(String) - această metodă primește un String care respectă formatul yyyy-MM-dd HH:mm:ss și
returnează un String în același format care reprezintă următorul moment de timp când evenimentul va
începe. Acel moment poate fi exact la momentul de timp primit ca parametru sau imediat după.
În plus, clasa va trebui să implementeze următorul constructor:
EvenimentRecurent(String dataInceput, String dataSfarsit, String nume, int numarOre)
unde numarOre reprezintă numărul de ore după care evenimentul are loc din nou. De exemplu, dacă număr ore
este 24, înseamnă că evenimentul are loc o dată pe zi.
Restricții și precizări
Diferența de timp dintre data primită de urmatorulEveniment și rezultatul metodei nu va fi mai mare de 1 000
de zile
Pentru rezolvarea acestei probleme poți folosi orice clasă din java.util și java.text
Evenimentele se pot suprapune intre ele
Exemplu
import java.text.*;
import java.util.*;
class Eveniment {
 private Date dataInceput, dataSfarsit;
 private String nume;
 // Primeste 2 stringuri in format yyyy-MM-dd HH:mm:ss reprezentand data si ora
 // de inceput si de final a evenimentului si inca un string care contine numele
 // cu care apare evenimentul in calendar
 public Eveniment(String dataInceput, String dataSfarsit, String nume) {
 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
 this.dataInceput = format.parse(dataInceput);
 this.dataSfarsit = format.parse(dataSfarsit);
 } catch (Exception e) {
 System.out.println("Data nu este in formatul cerut!");
 }
 this.nume = nume;
 }
 public Date getDataInceput() {
 return dataInceput;
 }
 public Date getDataSfarsit() {
 return dataSfarsit;
 }
 public String getNume() {
 return nume;
 }
}
// clasa ta aici...

public class prog {
 public static void main(String[] args) {
 EvenimentRecurent er = new EvenimentRecurent("2019-03-09 22:46:00",
 "2019-03-09 23:00:00", "Scris probleme", 24);
 System.out.println(er.urmatorulEveniment("2019-04-19 22:46:23"));
 // 2019-04-20 22:46:00
 }
}
 */
package com.company;

import java.text.*;
import java.util.*;

class Eveniment {
    private Date dataInceput, dataSfarsit;
    private String nume;
    // Primeste 2 stringuri in format yyyy-MM-dd HH:mm:ss reprezentand data si ora
    // de inceput si de final a evenimentului si inca un string care contine numele
    // cu care apare evenimentul in calendar
    public Eveniment(String dataInceput, String dataSfarsit, String nume) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.dataInceput = format.parse(dataInceput);
            this.dataSfarsit = format.parse(dataSfarsit);
            //System.out.println(dataInceput);
            //System.out.println(dataSfarsit);
        } catch (Exception e) {
            System.out.println("Data nu este in formatul cerut!");
        }
        this.nume = nume;
    }

    public Date getDataInceput() {
        //System.out.println(dataInceput);
        return dataInceput;
    }

    public Date getDataSfarsit() {
        //System.out.println(dataSfarsit);
        return dataSfarsit;
    }

    public String getNume() {
        return nume;
    }
}

class EvenimentRecurent extends Eveniment {
    public int numarOre;

    public EvenimentRecurent(String dataInceput, String dataSfarsit, String nume, int numarOre) {
        super(dataInceput, dataSfarsit, nume);
        this.numarOre = numarOre;
    }

    public String urmatorulEveniment(String dataCurenta) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar calendarStart = Calendar.getInstance();
            Calendar calendarStop = Calendar.getInstance();
            calendarStart.setTime(getDataInceput());
            Date dataEvenimentCrt = format.parse(dataCurenta);
            calendarStop.setTime(dataEvenimentCrt);
            while(calendarStart.compareTo(calendarStop) < 0) {
                calendarStart.add(Calendar.HOUR, this.numarOre);
            }
            Date dataViitoare = calendarStart.getTime();
            return format.format(dataViitoare);
        } catch (Exception e) {
            System.out.println("Data nu este in formatul cerut!");
        }
        return " ";
    }
}

public class Main {

    public static void main(String[] args) {
        EvenimentRecurent er = new EvenimentRecurent("2019-03-09 22:46:00",
                "2019-03-09 23:00:00", "Scris probleme", 24);
        System.out.println(er.urmatorulEveniment("2019-04-19 22:46:23"));
        // 2019-04-20 22:46:00
        // exista un decalaj de o ora datorita trecerii la ora de vara
    }
}
