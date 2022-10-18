/*
Regula 1: Nu repetăm cuvinte
După ce ai învățat programare, ai decis să îți începi cariera în domeniu cu un post bine plătit la o corporație
faimoasă din Silicon Valley.
Șeful tău, Gavin, ți-a trimis o listă de reguli după care să te ghidezi ca să ai un parcurs bun în corporație și să fii
avansat în post. Pe lângă lucrurile evidente, cum ar fi să nu îți lași workstation-ul deblocat când trebuie să mergi
la toaletă sau să nu bei toată kombucha din frigiderul comun, ai observat o regulă ciudată.
Regula spune că angajații nu trebuie să consume prea mult timp pe trimiterea de e-mailuri. Atunci când trimiți
un e-mail, nu e necesar să repeți un cuvânt pentru că se presupune că persoana cealaltă a înțeles deja despre
ce e vorba prima dată când l-ai zis. Prin urmare, în e-mailurile pe care le trimiți trebuie să apară fiecare cuvânt
pe care vrei să îl transmiți o singură dată.
Entuziasmat de noul job și dornic să începi lucrul la proiect, te-ai gândit să îi trimiți șefului tău un e-mail de
mulțumire pentru listă, în care să îl și întrebi la ce task să lucrezi în continuare. Ai compus un e-mail, dar chiar
înainte să îl trimiți ai realizat că nu respectă regulile companiei!
Acum trebuie să îl convertești cât mai rapid ca să dovedești că ești eficient. E-mailul e format din litere mici ale
alfabetului englez și spații. Sarcina ta e acum să îl convertești într-o listă de cuvinte ordonate alfabetic, în care
fiecare cuvânt din textul inițial să apară o singură dată.
Date de intrare
Vei citi de la tastatură textul e-mailului care trebuie convertit. Acesta poate să se întindă pe mai multe linii.
Date de ieșire
Se vor afișa cuvintele distincte din textul citit, în ordine alfabetică, câte unul pe fiecare rând.
Restricții și precizări
Textul nu conține mai mult de 100000 de cuvinte, iar fiecare cuvânt poate conține până la 20 de caractere.
Pentru a scurta timpul de execuție al programului tău folosește BufferedReader
Clasa care conține metoda main trebuie să se numească prog
Exemplu
Date de intrare:
mersi pentru lista de instructiuni
e de ajutor
mersi
Date de iesire:
ajutor
de
e
instructiuni
lista
mersi
pentru


 */
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {

    public static <IoException> void main(String[] args) throws IOException {

        String line;
        String[] words;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println("Tasteaza stringul");
        while((line = br.readLine()) != null){
            words = line.split(" ");
            for (int i = 0; i < words.length; ++i) {
                treeSet.add(words[i]);
            }
        }
        for (String string : treeSet) {
            System.out.println(string);
        }
    }
}
// citirea se opreste cu tastele [ ctrl D ]

