/*
Numărul de cuvinte distincte

Gavin te-a felicitat pentru primul tău email trimis ca angajat în companie. Ți-a transmis că se bucură că ai citit
atent regulile și ca răsplată ți-a dat primul task important. Îți rămâne marea responsabilitate de a evalua
eficiența emailurilor trimise în companie în ultima perioadă. Practic, va trebui să scrii un program care citește
conținutul unui email trimis de un angajat și afișează numărul de cuvinte distincte din acest email.
Date de intrare
Vei citi de la tastatură textul emailului. Acesta poate să se întindă pe mai multe linii și conține doar litere mici ale
alfabetului englez și spații.
Date de ieșire
Se va afișa un singur număr întreg, reprezentând numărul de cuvinte distincte din email
Restricții
Textul nu conține mai mult de 100000 de cuvinte, iar fiecare cuvânt poate conține până la 25 de caractere.
Exemplu
Date de intrare
mersi pentru lista de instructiuni
e de ajutor
mersi

Date de ieșire
7
 */
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        String line;
        String[] words;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashSet = new HashMap<>();
        while((line = br.readLine()) != null){
            words = line.split(" ");
            for (String word : words) {
                if(!word.equals("")) {
                    System.out.println("Cuvant: " + word);
                    hashSet.put(word, 1);
                }
            }
        }
        System.out.println(hashSet.size());
    }
}
