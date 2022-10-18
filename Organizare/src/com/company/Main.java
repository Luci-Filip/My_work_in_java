package com.company;

import java.text.*;
import java.util.*;

class Meeting implements Comparable<Meeting> {
    private Calendar inceput, sfarsit;

    public Meeting(Calendar inceput, Calendar sfarsit) {
        if (inceput.compareTo(sfarsit) > 0) {
            throw new IllegalArgumentException("Date invalide");
        }
        this.inceput = inceput;
        this.sfarsit = sfarsit;
    }

    public Calendar getInceput() {
        return inceput;
    }

    public Calendar getSfarsit() {
        return sfarsit;
    }

    public int compareTo(Meeting m) {
        return this.inceput.compareTo(m.getInceput());
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return sdf.format(inceput.getTime()) + " -> " + sdf.format(sfarsit.getTime());
    }
}

class Planificator {
    public static class Compara implements Comparator<Meeting> {
        @Override
        public int compare(Meeting m1, Meeting m2) {
            int result = m1.getSfarsit().compareTo(m2.getSfarsit());
            if (result == 0) {
                return m1.getInceput().compareTo(m2.getInceput());
            }
            return result;
        }
    }

    public static void planifica(List<Meeting> meetinguri) {
        List<Meeting> finalMeetings = new ArrayList<>();
        Collections.sort(meetinguri, new Compara());
        for (int i = 0; i < meetinguri.size() - 1; ++i) {
            if (meetinguri.get(i).getInceput().compareTo(meetinguri.get(i + 1).getSfarsit()) < 0) {
                finalMeetings.add(meetinguri.get(i));
                //--i;
            }
        }

    }
}
public class Main {
    public static void main(String[] args) {
        try {
            List<Meeting> l = new ArrayList<>();
            l.add(new Meeting(new GregorianCalendar(3,1,1), new GregorianCalendar(8,1,1)));
            l.add(new Meeting(new GregorianCalendar(3,1,1), new GregorianCalendar(6,1,1)));
            l.add(new Meeting(new GregorianCalendar(5,1,1), new GregorianCalendar(6, 1,1)));
            l.add(new Meeting(new GregorianCalendar(3,1,1), new GregorianCalendar(4,1,1)));
            l.add(new Meeting(new GregorianCalendar(2,1,1), new GregorianCalendar(7,1,1)));
            l.add(new Meeting(new GregorianCalendar(1,1,1), new GregorianCalendar(2, 1,1)));
             Planificator.planifica(l);
            System.out.println(l);
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }

        /*
        [01/02/0001 12:00:00 -> 01/02/0002 12:00:00,
        01/02/0003 12:00:00 -> 01/02/0004 12:00:00,
        01/02/0005 12:00:00 -> 01/02/0006 12:00:00]
        hint: crezi ca te-ar ajuta sa te folosesti de o alta lista in care sa stochezi doar meeting-urile valide?
        Gandeste-te acum la mai multe teste in care sa ai aceleasi date de sfarsit (si incearca sa le combini cat mai
         mult posibil, deoarece multe din testele tale sunt aproape in ordine, adica incep cu o data mai mica si se
         termina cu o data mai mare
         */
    }
}

