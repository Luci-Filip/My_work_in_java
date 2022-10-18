/*
Calendar 2
Poveste
Deși ești foarte mândru de aplicația pe care ai creat-o, ai observat că aceasta a început să îți aducă probleme
în viața personală: ai început să uiți de zilele de naștere ale prietenilor tăi.
Te-ai hotărât să adaugi o clasă nouă care să rețină un All day event (un eveniment care durează toată ziua).
Pentru stocarea unui eveniment folosești umătoarea clasă:

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
class Eveniment {
 private Date dataInceput, dataSfarsit;
 private String nume;
 public Eveniment(String dataInceput, String dataSfarsit, String nume) {
 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
 this.dataInceput = format.parse(dataInceput);
 this.dataSfarsit = format.parse(dataSfarsit);
 } catch (Exception e) {
 System.out.println("Data in format incorect");
 System.out.println(e.getMessage());
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
 // Returneaza durata in ore a unui eveniment
 public final long durataEveniment() {
 long diferentaInMs = Math.abs(dataSfarsit.getTime() - dataInceput.getTime());
 return TimeUnit.HOURS.convert(diferentaInMs, TimeUnit.MILLISECONDS);
 }
}
Acum vrei să creezi clasa EvenimentToataZiua, subclasă a clasei Eveniment care să te ajute să stochezi un All day
event.
Cerință
În această problemă va trebui să scrii o clasă EvenimentToataZiua subclasă a Eveniment.
Aceasta va păstra funcționalitățile clasei Eveniment, cu o excepție: constructorul va primi următorii parametri:
data - String în formatul yyyy-MM-dd reprezentând data când are loc evenimentul
nume - String reprezentând numele evenimentului
În plus:
în momentul apelului, metoda durataEveniment va returna 24.
în momentul apelului, metoda getDataInceput va returna data de început a evenimentului - ora 00:00:00
Precizare
Pentru rezolvarea acestei probleme poți folosi orice clasă din java.util și java.text
Exemplu

import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
class Eveniment {
 private Date dataInceput, dataSfarsit;
 private String nume;
 public Eveniment(String dataInceput, String dataSfarsit, String nume) {
 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
 this.dataInceput = format.parse(dataInceput);
 this.dataSfarsit = format.parse(dataSfarsit);
 } catch (Exception e) {
 System.out.println("Data in format incorect");
 System.out.println(e.getMessage());
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
 // Returneaza durata in ore a unui eveniment
 public final long durataEveniment() {
 long diferentaInMs = Math.abs(dataSfarsit.getTime() - dataInceput.getTime());
 return TimeUnit.HOURS.convert(diferentaInMs, TimeUnit.MILLISECONDS);
 }
}
// clasa ta aici
public class prog {
 public static void main(String[] args) throws Exception {
 Scanner scanner = new Scanner(System.in);
 Eveniment e = new EvenimentToataZiua("2019-04-22", "asd");
 System.out.println(e.durataEveniment()); // 24
 }
}
 */
package com.company;

import java.text.*;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

class Eveniment {
    private Date dataInceput, dataSfarsit;
    private String nume;

    public Eveniment(String dataInceput, String dataSfarsit, String nume) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.dataInceput = format.parse(dataInceput);
            this.dataSfarsit = format.parse(dataSfarsit);
        } catch (Exception e) {
            System.out.println("Data in format incorect");
            System.out.println(e.getMessage());
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

    public final long durataEveniment() {
        long diferentaInMs = Math.abs(dataSfarsit.getTime() - dataInceput.getTime());
        return TimeUnit.HOURS.convert(diferentaInMs, TimeUnit.MILLISECONDS);
    }
}
class EvenimentToataZiua extends Eveniment {
    public EvenimentToataZiua (String dataEveniment, String nume) {
        super(dataEveniment + " 00:00:00", dataEveniment + " 24:00:00", nume);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Eveniment e = new EvenimentToataZiua("2019-04-22 ", "asd");
        System.out.println(e.durataEveniment());  // 24
    }
}
