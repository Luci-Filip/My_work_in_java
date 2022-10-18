package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            s.add(x); // x va fi convertit automat la Integer
        }
        System.out.println(s.size()); // numarul de elemente din s
        for (Integer i : s) { // parcurgem fiecare element din s
            System.out.print(i + " ");
        }
    }
}

/*

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        for (int i = 5; i >= 1; --i) {
            s.add(i);
            s.add(i);
        }
        for (Integer value : s) {
            System.out.print(value + " ");
        }
    }
}

 */