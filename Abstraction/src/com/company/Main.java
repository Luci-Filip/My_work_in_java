package com.company;

abstract class Animal {
    protected String specie;

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public abstract void afiseazaDetalii();
}

public class Main {
    public static void main(String[] args) {
        Animal animal;
        animal = new Animal();
        animal.afiseazaDetalii();
    }
}