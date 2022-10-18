package com.company;

class X0Exception extends Exception {
    public X0Exception(String mesajEroare) {
        super(mesajEroare); // apelam constructorul Exception
    }
}

class X0 {
    private char tabla[][] = new char[3][3];

    public void mutare(int linie, int coloana, char jucator) throws X0Exception, IndexOutOfBoundsException {
        if (linie < 0 || coloana < 0 || linie >= 3 || coloana >= 3) {
            throw new IndexOutOfBoundsException("Linia sau coloana se află în afara tablei");
        }
        if (tabla[linie][coloana] == 'X' || tabla[linie][coloana] == '0') {
            throw new X0Exception("Celula este deja ocupata");
        }
        if (jucator != 'X' && jucator != '0') {
            throw new X0Exception("Tipul jucatorului este invalid");
        }
        tabla[linie][coloana] = jucator;
    }
}

public class Main {
    public static void main(String[] args) {
        X0 joc = new X0();
        try {
            joc.mutare(3, 3, 'X');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            joc.mutare(2, 2, 'X');
            joc.mutare(2, 2, 'X');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            joc.mutare(1, 1, 'q');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
