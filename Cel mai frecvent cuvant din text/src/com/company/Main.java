package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String line;
        String[] words;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while ((line = reader.readLine()) != null){
            // citirea se opreste cu ctrl + D
            words = line.split(" ");
            for (String word : words) {
                if (!word.equals("")) {
                    if (map.containsKey(word)) {
                        int curentValue = map.get(word);
                        map.replace(word, curentValue + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
        }
        int maxFreq = 0;
        String maxWord = "zzz";
        for (String mapKey : map.keySet()) {
            int crtFrequency = map.get(mapKey);
            if (crtFrequency > maxFreq) {
                maxFreq = crtFrequency;
                maxWord = mapKey;
            }
            else if (crtFrequency == maxFreq && maxWord.compareTo(mapKey) > 0) {
                maxFreq = crtFrequency;
                maxWord = mapKey;
            }
        }
        System.out.println(maxWord);
    }
}
// citirea while ((line = reader.readLine()) != null) se opreste cu ctrl + D

/*
mersi de lista ce instructiuni
ce de mersi
ac ac
 */

/*
thanks for the help
the car works now
thanks
 */
