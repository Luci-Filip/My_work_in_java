package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] servers = new String[3];
        servers[0] = "Europa";
        servers[1] = "SUA";
        servers[2] = "Asia";
        System.out.println("Alege un server:");
        Scanner sc = new Scanner(System.in);
        int serverIndex;
        String errors = ""; // aici vom salva erorile produse
        try {
            serverIndex = sc.nextInt();
            System.out.println("Se conecteaza la serverul din " + servers[serverIndex]);
        } catch (Exception e) {
            System.out.println("Datele introduse sunt invalide. Redirecționare...");
            serverIndex = 0;
            System.out.println("Se conecteaza la serverul din " + servers[serverIndex]);
            errors += e.getMessage(); // mesajul erorii
        }
        if (errors.length() == 0) {
            System.out.println("Programul a fost executat cu succes");
        } else {
            System.out.println("Pe parcursul rularii au fost intalnite urmatoarele erori: " + errors);
        }
    }
}