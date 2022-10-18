package com.company;

interface Animal {
    void scoateSunet();
}

class Pisica implements Animal {
    public void scoateSunet() {
        System.out.println("Miau!");
    }
}

class Vaca implements Animal {
    public void scoateSunet() {
        System.out.println("MUUUU!");
    }
}

class Joc {
    private Animal animale[];

    public Joc(Animal[] animale) {
        this.animale = animale;
    }

    public void pornesteJocul() {
        for (int i = 0; i < animale.length; ++i) {
            animale[i].scoateSunet();
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Animal[] a = new Animal[3];
        a[0] = new Pisica();
        a[1] = new Vaca();
        a[2] = new Vaca();
        Joc joc = new Joc(a);
        joc.pornesteJocul();
    }
}
