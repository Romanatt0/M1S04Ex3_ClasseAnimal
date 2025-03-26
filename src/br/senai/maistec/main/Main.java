package br.senai.maistec.main;

import models.animai;

public class Main {
    public static void main(String[] args) {

        animai cachorro = new animai("Bolt", "Mata", "au au", "Carnivoro");

        animai zebra = new animai("Alex", "Savana", "mée", "Herbivoro");

        cachorro.emitirSom();

        zebra.mover();g

        cachorro.alimentar();
        zebra.alimentar();

    }
}