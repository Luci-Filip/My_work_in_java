package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            l.add(x);
        }
        for (int i = 0; i < l.size(); ++i) {
            for (int j = i + 1; j < l.size(); ++j) {
                if (l.get(i) > l.get(j)) {
                    int aux = l.get(i);
                    l.set(i, l.get(j));
                    l.set(j, aux);
                }
            }
        }
        for (Integer i : l) {
            System.out.print(i + " ");
        }
    }
}