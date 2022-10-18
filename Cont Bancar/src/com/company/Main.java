package com.company;

class ContBancar {
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercari_activare = 0;
    // Constructorul = are rolul de a impune date de start
    // ca si stelutele din formulare

    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }
    // metode
    public void descriere() {
        System.out.println("Titular " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ " + this.activ);
        System.out.println("Incercari " + this.incercari_activare);
    }
    public void activareCont(int pinUtilizator) {
        // modifica campul activ in true doar daca pinul e corect
        if (pinUtilizator == this.pin) {
            System.out.println("Cont activat cu succes");
            this.activ = true;
        } else {
            System.out.println("Pin gresit");
            ++ this.incercari_activare;
        }

    }
    public void alimentareCont(double suma_depusa) {

    }
}

public class Main {

    public static void main(String[] args) {
	// initializam obiecte de tip bancar, sunt instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("Filip Lucian", "RO01234");
        ContBancar cont2 = new ContBancar("Filip Camelia", "RO123456");
        // apelam metoda activare
        cont1.activareCont(7777);
        cont2.activareCont(1234);
        cont2.activareCont(3333);
        cont2.activareCont(7777);

        // apelam metoda descriere
        cont1.descriere();
        cont2.descriere();
    }
}
