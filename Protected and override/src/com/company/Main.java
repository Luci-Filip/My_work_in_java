package com.company;

/*
class Persoana {
    protected String nume;
    private String prenume;
    private Persoana partener;
    private boolean casatorit;

    public void casatorie(Persoana partener) {
        this.casatorit = true;
        this.partener = partener;
    }
}

class Barbat extends Persoana {}

class Femeie extends Persoana {
    public void casatorie(Persoana partener) {
        super.casatorie(partener);
        nume = partener.nume;
    }
}
*/

class Animal {
    private String specie;

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String afiseazaDetalii() {
        return "Specie: " + specie + '\n';
    }
}

class Pisica extends Animal {
    private String rasa;

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String afiseazaDetalii2() {
        return afiseazaDetalii() + "Rasa: " + rasa + "\n";
    }

    public String afiseazaDetalii3() {
        return super.afiseazaDetalii() + "Rasa: " + rasa + "\n";
    }
}

public class Main {

    public static void main(String[] args) {
        Pisica p = new Pisica();
        p.setSpecie("specie");
        p.setRasa("persan");
        System.out.println(p.afiseazaDetalii2());
    }
}
