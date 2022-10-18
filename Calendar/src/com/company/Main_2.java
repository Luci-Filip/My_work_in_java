package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class Eveniment2 {
    private Date dataInceput, dataSfarsit;
    private String nume;

    public Eveniment2(String dataInceput, String dataSfarsit, String nume) {
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

class EvenimentRecurent2 extends Eveniment2 {
    public int numarOre;

    public EvenimentRecurent2(String dataInceput, String dataSfarsit, String nume, int numarOre) {
        super(dataInceput, dataSfarsit, nume);
        this.numarOre = numarOre;
    }

    public String urmatorulEveniment(String dataEvenimentStr) {

        try {
            Calendar calendarStart = new GregorianCalendar(TimeZone.getTimeZone("GMT+2"));
            calendarStart.setTime(getDataInceput());

            Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT+2"));
            calendar.setTimeInMillis(calendarStart.getTimeInMillis());

            while(true) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date dataEveniment = format.parse(dataEvenimentStr);

                calendar.add(Calendar.HOUR,this.numarOre);
                Date dataViitoare = calendar.getTime();
                if(dataViitoare.compareTo(dataEveniment) > 0)
                    break;
            }
            calendar.add(Calendar.HOUR,this.numarOre);
            Date dataViitoare = calendar.getTime();
            SimpleDateFormat formatTwo = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return formatTwo.format(dataViitoare) + ":00";
        } catch (Exception e) {
            System.out.println("Data nu este in formatul cerut!");
        }
        return dataEvenimentStr;
    }
}

public class Main_2 {

    public static void main(String[] args) {
        EvenimentRecurent2 er = new EvenimentRecurent2("2019-03-09 22:46:00",
                "2019-03-09 23:00:00", "Scris probleme", 24);
        System.out.println(er.urmatorulEveniment("2019-04-19 22:46:23"));
        // 2019-04-20 22:46:00
    }
}
