package com.company;

class Animal {
    protected String specie;

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void afiseazaDetalii() {
        System.out.println("Specie: " + specie);
    }
}

class Pisica extends Animal {
    private String rasa;

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void afiseazaDetalii() {
        System.out.println("Specie: " + specie);
        System.out.println("Rasa: " + rasa);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animale = new Animal[2];
        animale[0] = new Animal();
        animale[0].setSpecie("Equus ferus");
        animale[1] = new Pisica();
        animale[1].setSpecie("Felis catus");
        ((Pisica)animale[1]).setRasa("British shorthair");
        for (int i = 0; i < 2; ++i) {
            animale[i].afiseazaDetalii();
        }
    }
}

