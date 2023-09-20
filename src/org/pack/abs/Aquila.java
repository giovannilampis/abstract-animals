package org.pack.abs;

public class Aquila extends Animale {

    public Aquila() {
        super("Aquila"); // Chiamiamo il costruttore della classe madre con un nome predefinito
    }

	@Override
    public void verso() {
        System.out.println("Screech!");
    }

    @Override
    public void mangia() {
        System.out.println("L'aquila mangia carne.");
    }
}
