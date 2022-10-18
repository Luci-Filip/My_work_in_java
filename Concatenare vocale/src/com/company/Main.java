/*
Concatenare vocale

Maria tocmai a învățat la școală despre consoane și vocale. Pentru a se asigura că au înțeles, învățătoarea le dă
o listă de cuvinte și le dă ca temă pe data viitoare să scrie toate cuvintele care încep și se termină cu o vocală.
Pentru că vrea o mașină de făcut teme, Maria te roagă să scrii un program care să rezolve tema primită de la
doamna învățătoare.
Pentru că și ea știe programare, Maria te roagă doar să scrii o metodă care rezolvă problema.
Cerință
Scrie o clasă MasinaDeTeme care să conțină o metodă publică filtrareCuvinte.
Metoda va primi ca parametru un șir de String (String[]) și va returna un StringBuffer care va conține toate
cuvintele cu proprietatea cerută concatenate în ordinea în care apar în șir.
Atenție! Pentru a evita confuziile, niciun cuvânt nu va conține litera y.
Semnătură metodă:
public static StringBuffer filtrareCuvinte(String[] cuvinte)
Exemplu
// clasa ta aici
public class prog {
 public static void main(String[] args) {
 System.out.println(MasinaDeTeme.filtrareCuvinte(new String[]{"ana", "are", "mere"}).toString()); // anaare
 }
}
 */
package com.company;

class MasinaDeTeme {
    public static boolean isVowel (char ch) {
        boolean vowel;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return  true;
        }
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return  true;
        }
        return  false;
    }

    public static StringBuffer filtrareCuvinte (String[] cuvinte) {
        StringBuffer string = new StringBuffer();
        for (int i = 0; i < cuvinte.length; i++) {
            if (isVowel((cuvinte[i].charAt(cuvinte[i].length() - 1))) && isVowel((cuvinte[i].charAt(0)))) {
                string.append(cuvinte[i]);
            }
        }
        return string;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println(MasinaDeTeme.filtrareCuvinte(new String[] {"ana", "are", "mere",}).toString());
        // anaare
    }
}
