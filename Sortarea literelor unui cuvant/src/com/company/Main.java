/*
Sortarea literelor unui cuvânt

De ce să sortezi cuvinte când poți să sortezi litere? În timp ce mutai cuvintele din emailuri dintr-o parte în alta, ți-a
venit ideea să sortezi și literele din cadrul fiecărui cuvânt după numărul lor de apariții în cuvânt, pentru a avea
textul sortat complet.
Ți se dă un cuvânt format din litere mici ale alfabetului englez. Afișează toate literele care apar în cuvânt,
reorganizate astfel încât literele care apar cel mai frecvent să se regăsească la început.
Date de intrare
Pe prima linie se va găsi un singur cuvânt, format din litere mici ale alfabetului englez.
Date de ieșire
Se vor afișa literele din cuvânt, fără spații, de atâtea ori de câte apar în cuvântul inițial, reorganizate după regula
de mai sus.
Restricții
Cuvântul poate conține până la 100000 de caractere.
Dacă există litere care apar de același număr de ori, se vor afișa mai întâi cele mai mici după sortarea
alfabetică.
Atenție!
Unele clase și operații sunt lente în Java. Din acest motiv se recomandă folosirea BufferedReader și
BufferedWriter.
Concatenarea folosind String e lentă.
Exemplu
Date de intrare
instructiuni
Date de iesire
iiinnttuucrs
 */
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Tasteaza un string");
        String word = reader.readLine();
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> charCountMap  = new HashMap<>();
        for (char c : word.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        Comparator<Map.Entry<Character, Integer>> valueComparator = (e1, e2) -> e2.getValue().compareTo(e1.getValue());
        Comparator<Map.Entry<Character, Integer>> keyComparator = valueComparator.thenComparing(Map.Entry::getKey);
        charCountMap.entrySet().stream().sorted(keyComparator).forEach(e -> {
            int i = 0;
            while (i < e.getValue()) {
                sb.append(e.getKey());
                ++i;
            }
        });
        System.out.println(sb.toString());
    }
}
