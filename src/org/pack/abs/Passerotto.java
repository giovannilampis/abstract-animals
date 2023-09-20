package org.pack.abs;

public class Passerotto extends Animale {

    @Override
    public void verso() {
        System.out.println("Chirp! Chirp!");
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia semi e insetti.");
    }
}
