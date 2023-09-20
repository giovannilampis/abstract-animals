package org.pack.abs;

public class Passerotto extends Animale {

	public Passerotto() {
        super("Passerotto"); // Chiamiamo il costruttore della classe madre con un nome predefinito
    }

	@Override
    public void verso() {
        System.out.println("Chirp! Chirp!");
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia semi e insetti.");
    }
}
