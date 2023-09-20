package org.pack.abs;

public class Delfino extends Animale {

    public Delfino() {
        super("Delfino"); // Chiamiamo il costruttore della classe madre con un nome predefinito
    }

	@Override
    public void verso() {
        System.out.println("Ee-ee!");
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia pesce.");
    }
}
