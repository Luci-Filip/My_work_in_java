/*
Cărți de joc valide
Orice corporație care se respectă organizează campionate de tenis de masă pentru angajații săi. Compania la
care lucrezi face și ea asta odată pe an, dar din păcate mai sunt multe luni până la începerea următoarei runde
de calificări. Așa că te-ai gândit să mai destinzi puțin atmosfera și să organizezi un campionat de Șeptică online.
Șeptică se joacă cu 32 de cărți de joc, iar fiecare carte are câte o figură și un tip. Există 8 figuri - 7, 8, 9, 10, J, Q, K şi
A. Fiecare dintre figuri poate să fie de 4 tipuri: inimă roșie, inimă neagră, treflă și caro.
Vrei să începi prin implementarea unei clase CarteJoc care să memoreze informațiile corespunzătoare unei cărți.
Clasa trebuie să aibă 2 câmpuri private: un String care salvează figura (7, 8, 9, 10, J, Q, K sau A) și un String care
salvează tipul cărții de joc (INIMA ROSIE, INIMA NEAGRA, TREFLA sau CARO). Clasa va avea un constructor care primește
ca parametri un String și un String și aruncă o excepție de tip GameException, definită tot de tine, în cazul în care
unul dintre parametri nu face parte din variantele enumerate mai sus.
Mesajul excepției aruncate trebuie să fie Figura invalida dacă primul parametru nu e valid, Tip invalid dacă al
doilea parametru nu e valid sau Figura si tip invalide daca niciunul din parametri nu respecta regulile de mai
sus.
Exemplu
import java.util.*;
// clasele tale aici
public class prog {
 public static void main(String[] args) {
 try {
 CarteJoc carte = new CarteJoc("2", "INIMA NEAGRA");
 } catch (GameException e) {
 System.out.print(e.getMessage()); // Figura invalida
 }
 }
}
 */
package com.company;

class GameException extends Exception {
    public GameException(String messageError) {
        super(messageError);
    }
}

class CarteJoc {
    CarteJoc(String form, String type) throws GameException {
        boolean isForm = true, isType = true;
        String[] forma = {"7","8","9","10","A","J","K","Q"};
        String[] tip = {"INIMA NEAGRA","TREFLA","CARO","INIMA ROSIE"};
        try {
            for (int i = 0; i < forma.length; ++i) {
                if (form.compareTo(forma[i]) == 0) {
                    isForm = false;
                }
            }
            for (int j = 0; j < type.length(); ++j) {
                if (type.compareTo(tip[j]) == 0) {
                    isType = false;
                }
            }
        } catch (Exception e) {
            if (isForm && isType) {
                throw new GameException("Figura si tip invalide");
            } else if (isForm) {
                throw new GameException("Figura invalida");
            } else if (isType) {
                throw new GameException("Tip invalid");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            CarteJoc carte = new CarteJoc("2", "INIMA NEAGRA");
        } catch (GameException e) {
            System.out.print(e.getMessage()); // Figura invalida
        }
    }
}
