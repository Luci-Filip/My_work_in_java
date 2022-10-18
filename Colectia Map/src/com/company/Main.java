package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> m = new HashMap<>();
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i); // caracterul de pe pozitia i in s
            if (m.containsKey(c)) {// am gasit deja litera c înainte
                m.put(c, m.get(c) + 1); // incrementam numarul vechi de aparitii
                // valoarea veche asociata lui c va fi inlocuita
            } else {
                m.put(c, 1);
            }
        }
        for (char litera = 'a'; litera <= 'z'; ++litera) {
            if (m.containsKey(litera)) {
                System.out.println(litera + ": " + m.get(litera));
            }
        }
        /*
        for (Character litera : m.keySet()) { // parcurgem mulțimea de elemente `key`
            System.out.println(litera + ": " + m.get(litera));
        }
        */
    }
}
